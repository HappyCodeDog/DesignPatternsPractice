package BehavioralPatterns.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    List<String> messages = new ArrayList<>();

    public void receiveMessage(String message) {
        messages.add(message);
    }

    public void showMessage() {
        for (String message : messages) {
            System.out.println(message);
        }
    }

}
