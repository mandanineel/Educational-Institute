package BehavioralPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String taskName) {
        for (Observer observer : observers) {
            observer.update("Conflict detected with task: " + taskName);
        }
    }

    public void checkConflict(String newTask) {
        if ("Meeting".equals(newTask)) {
            notifyObservers(newTask);
        }
    }
}
