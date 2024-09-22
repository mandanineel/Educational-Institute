package Observer;

import Models.Task;

public class ConflictNotifier implements TaskObserver {
    // Notify the user when there's a conflict with an existing task
    @Override
    public void notifyConflict(Task task) {
        System.out.println("Conflict detected with task: " + task.getDescription());
    }
}
