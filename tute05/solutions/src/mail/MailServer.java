package mail;

import java.util.ArrayList;
import java.util.List;

public class MailServer implements Receiver, Sender {
    private String name;
    private List<Receiver> accounts;

    public MailServer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(User account) {
        this.accounts.add(account);
    }

    @Override 
    public String toString() {
        return name + " Mailserver";
    }

    @Override 
    public void sendMail(Receiver receiver, String subject, String content) {
        receiver.recieveMail(new Mail(this, subject, content));
    }

    @Override
    public void receiveMail(Mail mail) {
        System.out.println(name + " received some mail!");

        for (Receiver account : accounts) {
            account.recieveMail(mail);
        }
    }
    
}
