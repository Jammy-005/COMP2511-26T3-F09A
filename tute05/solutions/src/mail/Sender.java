package mail;


public interface Sender {
    public void sendMail(Receiver user, String subject, String content);
}
