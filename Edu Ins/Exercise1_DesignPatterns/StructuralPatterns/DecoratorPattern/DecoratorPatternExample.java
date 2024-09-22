package StructuralPatterns.DecoratorPattern;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        Task basicTask = new BasicTask();
        Task urgentTask = new UrgentTaskDecorator(basicTask);
        urgentTask.perform();
    }
}
