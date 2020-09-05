package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static List<Message> getMessages() {
        return messages;
    }

    public static void sendMessage(User u1, User u2, String text){
        Message message = new Message(u1,u2,text);
        messages.add(message);

    }

    public static void showDialog(User u1, User u2){
        for (int i = 0; i < messages.size();i++){
            if((u1.equals(messages.get(i).getSender()) & u2.equals(messages.get(i).getReceiver()))){
                System.out.println(messages.get(i).getSender() + ": " + messages.get(i).getText());
            }
            else if (((u2.equals(messages.get(i).getSender()) & u1.equals(messages.get(i).getReceiver())))){
                System.out.println(messages.get(i).getSender() + ": " + messages.get(i).getText());
            }

        }
    }
}
