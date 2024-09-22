package BehavioralPatterns.ObserverPattern;

public class ObserverPatternExample {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addObserver(new TaskObserver("Observer1"));
        manager.addObserver(new TaskObserver("Observer2"));

        manager.checkConflict("Meeting");
    }
}
