package StructuralPatterns.DecoratorPattern;

public class UrgentTaskDecorator implements Task {
    private Task task;

    public UrgentTaskDecorator(Task task) {
        this.task = task;
    }

    @Override
    public void perform() {
        System.out.println("This is an urgent task.");
        task.perform();
    }
}
