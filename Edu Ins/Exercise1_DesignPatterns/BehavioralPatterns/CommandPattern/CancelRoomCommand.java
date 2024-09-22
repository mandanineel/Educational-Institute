package BehavioralPatterns.CommandPattern;

public class CancelRoomCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Room booking canceled.");
    }
}
