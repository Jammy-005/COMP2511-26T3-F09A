package mail;

/**
 * In src/mail, you have been provided with a model email system. 
 * In this system, users can send and receive mail from each other. 
 * The system also includes mailing lists and mail servers, which provide more funcionality.

Mailing lists are a way for users to send an email to everyone on the list, without needing to specify individual emails. 
To send an email to a mailing list, the user must be a verified sender. 
Users can be a member and/or a verified sender for any number of mailing lists.
Mail servers are a tool for users with multiple accounts. 
Mail servers can both send and receive mail, but users can add each account they own to the server. 
This allows the user to send email as the mailserver, and makes it so any mail 
sent to the mailserver is forwarded to all of that user's accounts.

However, the provided implementation is incomplete. 
Your task is to finish implementing the system (using the Observer pattern) so it works as descibed. Then, answer the following questions:

Which class(es) are observers? Which are subjects? Is there any overlap between them?
Observers (implements Receiver): User, MailingList, MailServer
Subjects (implements Sender): User, MailServer

How do the Sender and Receiver interfaces help in implementing this Observer pattern? 
How would a similar system without those interfaces be different?
Do you think this system can support new ways to send and receive mail? 
Why might that be useful?
 * 
 * EmailSystem
 */

public class EmailSystem {

    public static void main(String[] args) {
        // Users
        User alice = new User("Alice");
        User bobby = new User("Bobby");
        User charlie = new User("Charlie");

        // Mailing Lists
        MailingList comp1511 = new MailingList("COMP1511");
        MailingList comp2511 = new MailingList("COMP2511");

        // Add users
        comp1511.addUser(alice);
        comp1511.addUser(bobby);

        comp2511.addUser(bobby);
        comp2511.addUser(charlie);

        comp1511.makeVerified(bobby);
        comp2511.makeVerified(alice);

        // Bobby sends an email to COMP1511
        bobby.sendMail(comp1511, "Hello", "Welcome to CSE!");
        // Bobby tries to send an email to COMP2511, and fails
        bobby.sendMail(comp2511, "Hacking", "I am hacking the mailing list!");

        // Alice sends an email to COMP2511
        alice.sendMail(comp2511, "COMP2511 Changes", "Everyone now gets full marks for labs!");

        // New student joins the COMP2511 mailing list
        User dylan = new User("Dylan");
        comp2511.addUser(dylan);

        // Alice sends another email to COMP2511
        alice.sendMail(comp2511, "Java", "I hope everyone loves Java!");

        // Alice makes a new account for COMP2511 messages
        User alice2511 = new User("Alice 2511");

        // Alice makes a mailserver for COMP2511
        MailServer aliceMailServer = new MailServer("COMP2511");

        // Alice adds her accounts to the mailserver, and makes it a verified sender
        aliceMailServer.addAccount(alice2511);
        aliceMailServer.addAccount(alice);
        comp2511.makeVerified(aliceMailServer);

        // Email using the mailserver
        alice2511.sendMailServer(aliceMailServer, comp2511, "Testing my mail server", "Test!");

        // Mail server forwards emails to the accounts
        dylan.sendMail(aliceMailServer, "Late enrolment", "Hi Alice, I enrolled late");

    }
}
