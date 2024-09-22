package BehavioralPatterns.CommandPattern;

public class BookRoomCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Room booked successfully.");
    }
}
