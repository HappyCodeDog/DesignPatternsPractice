package BehavioralPatterns.ObserverPattern;

public class OctalObserver extends Observer{
    public OctalObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("========");
        System.out.println("OctalObserver being nontified!");
        super.update();
    }
}
