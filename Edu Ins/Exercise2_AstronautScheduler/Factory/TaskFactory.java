package Factory;

import Models.Task;

public class TaskFactory {
    // Factory method to create a new Task
    public Task createTask(String description, String startTime, String endTime, String priority) {
        return new Task(description, startTime, endTime, priority);
    }
}
