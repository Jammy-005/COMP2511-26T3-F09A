package mail;

public class User implements Receiver, Sender{
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override 
    public String toString() {
        return this.name;
    }

    public void sendMailServer(MailServer server, Receiver receiver, String subject, String content) {
        server.sendMail(receiver, subject, content);
    }

    @Override 
    public void sendMail(Receiver user, String subject, String content) {
        // TODO: implement me
    }

    @Override 
    public void receiveMail(Mail mail) {
        // TODO: implement me
    }
    
}
