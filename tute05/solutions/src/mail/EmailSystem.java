package mail;

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

        // Bobby sends an email to COMP1511 and COMP2511
        bobby.sendMail(comp1511, "Hello", "Welcome to CSE!");
        bobby.sendMail(comp2511, "Hacking", "I am hacking the mailing list!");

        // Alice sends an email to COMP2511
        alice.sendMail(comp2511, "COMP2511 Changes", "Everyone now gets full marks for labs!");

        // New student joins the COMP2511 mailing list
        User dylan = new User("Dylan");
        comp2511.addUser(dylan);

        // Alice sends another email to COMP2511
        alice.sendMail(comp2511, "Java", "I hope everyone loves Java!");

        // Alice makes a new account and mailserver for COMP2511 messages
        User alice2511 = new User("Alice 2511");
        MailServer aliceMailServer = new MailServer("COMP2511");

        // Alice adds her accounts to the mailserver
        aliceMailServer.addAccount(alice2511);
        aliceMailServer.addAccount(alice);
        comp2511.makeVerified(aliceMailServer);

        // Email using the mailserver
        alice2511.sendMailServer(aliceMailServer, comp2511, "Testing my mail server", "Test!");

        // Mail server forwards emails to the accounts
        dylan.sendMail(aliceMailServer, "Late enrolment", "Hi Alice, I enrolled late");
    }
}
