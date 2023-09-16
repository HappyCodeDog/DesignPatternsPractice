package BehavioralPatterns.ObserverPattern;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        // change status and notify all observers
        System.out.println();
        System.out.println("====>> First state: 0");
        subject.setState(0);
        System.out.println();
        System.out.println("====>> Second state: 1");
        subject.setState(1);
        System.out.println();
        System.out.println("====>> Third state: 99");
        subject.setState(99);
    }
}
