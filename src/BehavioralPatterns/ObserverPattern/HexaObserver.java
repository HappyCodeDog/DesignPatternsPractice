package BehavioralPatterns.ObserverPattern;

public class HexaObserver extends Observer{
    public HexaObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("========");
        System.out.println("HexaObserver being nontified!");
        super.update();
    }
}
