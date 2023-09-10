package BehavioralPatterns.MediatorPattern;

import java.util.Date;

public class User {
    private String name;
    private ChatRoom chatRoom;

    public User(ChatRoom chatRoom) {
       this.chatRoom = chatRoom;
    };

    public void getName() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        chatRoom.receiveMessage("[" + new Date().toString() +
                "] " + name + ": " + message);
    }
}
