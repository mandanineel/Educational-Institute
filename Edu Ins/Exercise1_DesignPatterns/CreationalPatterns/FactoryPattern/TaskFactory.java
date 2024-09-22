package CreationalPatterns.FactoryPattern;

public class TaskFactory {
    public Task createTask(String taskType) {
        if ("MEETING".equalsIgnoreCase(taskType)) {
            return new MeetingTask();
        } else if ("CODING".equalsIgnoreCase(taskType)) {
            return new CodingTask();
        }
        return null;
    }
}
