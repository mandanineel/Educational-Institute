package BehavioralPatterns.CommandPattern;

public class BookingSystem {
    public void executeCommand(Command command) {
        command.execute();
    }
}
