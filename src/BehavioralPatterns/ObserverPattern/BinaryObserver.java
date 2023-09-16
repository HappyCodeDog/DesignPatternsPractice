package BehavioralPatterns.ObserverPattern;

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("========");
        System.out.println("BinaryObserver being nontified!");
        super.update();
    }
}
