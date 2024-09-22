package Models;

public class Task {
    private String description;
    private String startTime;
    private String endTime;
    private String priority;

    // Constructor to initialize a task
    public Task(String description, String startTime, String endTime, String priority) {
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.priority = priority;
    }

    // Getters for Task fields
    public String getDescription() {
        return description;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return description + " [" + priority + "] from " + startTime + " to " + endTime;
    }
}
