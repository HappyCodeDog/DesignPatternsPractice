package BehavioralPatterns.ObserverPattern;

public abstract class Observer {

    public Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update() {
        System.out.println("State changed: " + subject.getState());
    }

    public void observe(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }
}
