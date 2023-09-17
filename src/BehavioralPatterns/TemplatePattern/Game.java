package BehavioralPatterns.TemplatePattern;

public abstract class Game {
    void initialize() {
        System.out.println("initialize");
    }
    void startPlay() {
        System.out.println("start play");
    }
    void endPlay() {
        System.out.println("end play");
    }
    void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
