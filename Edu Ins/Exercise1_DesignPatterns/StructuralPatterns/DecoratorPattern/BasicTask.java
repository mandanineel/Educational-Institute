package StructuralPatterns.DecoratorPattern;

public class BasicTask implements Task {
    @Override
    public void perform() {
        System.out.println("Performing Basic Task");
    }
}
