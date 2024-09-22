package Singleton;

import Models.Task;
import java.util.ArrayList;
import java.util.List;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks = new ArrayList<>();

    // Private constructor to prevent instantiation
    private ScheduleManager() {}

    // Public method to get the single instance of ScheduleManager
    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    // Add a task if there's no conflict
    public void addTask(Task task) {
        if (!hasConflict(task)) {
            tasks.add(task);
            System.out.println("Task added: " + task.getDescription());
        } else {
            System.out.println("Task conflict detected.");
        }
    }

    // Remove a task by its description
    public void removeTask(String description) {
        tasks.removeIf(t -> t.getDescription().equals(description));
        System.out.println("Task removed: " + description);
    }

    // View all tasks sorted by start time
    public void viewTasks() {
        tasks.sort((t1, t2) -> t1.getStartTime().compareTo(t2.getStartTime()));
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    // Check if adding a new task causes a time conflict
    private boolean hasConflict(Task newTask) {
        for (Task task : tasks) {
            if (task.getEndTime().compareTo(newTask.getStartTime()) > 0 && task.getStartTime().compareTo(newTask.getEndTime()) < 0) {
                return true;
            }
        }
        return false;
    }
}
