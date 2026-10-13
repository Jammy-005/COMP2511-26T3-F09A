package mail;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Mail {

    private String subject;
    private String content;
    private LocalDateTime timeSent;
    private Sender sender;

    public Mail(Sender sender, String subject, String content) {
        this.subject = subject;
        this.content = content;
        this.timeSent = LocalDateTime.now();
        this.sender = sender;
    }

    @Override 
    public String toString() {
        return sender + " @" + timeSent.toLocalTime().truncatedTo(ChronoUnit.SECONDS) + " -> " + subject + ": " + content;
    }

    public Sender getSender() {
        return this.sender;
    }
    
}
