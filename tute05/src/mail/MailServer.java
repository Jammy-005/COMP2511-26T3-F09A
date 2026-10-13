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
    public void sendMail(Receiver user, String subject, String content) {
        // TODO: implement me!
    }

    @Override
    public void receiveMail(Mail mail) {
        // TODO: implement me!
    }
    
}
