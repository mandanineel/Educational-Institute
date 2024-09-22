package Observer;

import Models.Task;

public interface TaskObserver {
    // Observer interface to notify about task conflicts
    void notifyConflict(Task task);
}
