package CreationalPatterns.FactoryPattern;

public class FactoryPatternExample {
    public static void main(String[] args) {
        TaskFactory factory = new TaskFactory();
        Task task = factory.createTask("MEETING");
        task.perform();
    }
}
