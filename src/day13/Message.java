package day13;

import java.util.Date;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    Date date = new Date();

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = date;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    public String toString(){
        return "FROM: " + sender +
                "\nTO: " + receiver +
                "\nON: " + date +
                "\n'" + text + "'\n";
    }
}
