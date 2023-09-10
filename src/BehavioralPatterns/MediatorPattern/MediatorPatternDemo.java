package BehavioralPatterns.MediatorPattern;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User user = new User(chatRoom);
        user.setName("Mike");
        user.getName();
        user.sendMessage("Hello!");

        User user2 = new User(chatRoom);
        user.setName("Cherry");
        user.sendMessage("How are you?");

        chatRoom.showMessage();
    }
}
