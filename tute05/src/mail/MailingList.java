package mail;

import java.util.ArrayList;
import java.util.List;

public class MailingList implements Receiver {
    private String name;
    private List<Receiver> users;
    private List<Sender> verifiedUsers;

    public MailingList(String name) {
        this.name = name;
        this.users = new ArrayList<>();
        this.verifiedUsers = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void makeVerified(Sender user) {
        verifiedUsers.add(user);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void receiveMail(Mail mail) {
        // TODO: implement me!
    }
    
}
