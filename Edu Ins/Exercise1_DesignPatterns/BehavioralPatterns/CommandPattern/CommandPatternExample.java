package BehavioralPatterns.CommandPattern;

public class CommandPatternExample {
    public static void main(String[] args) {
        BookingSystem system = new BookingSystem();

        Command bookRoom = new BookRoomCommand();
        Command cancelRoom = new CancelRoomCommand();

        system.executeCommand(bookRoom);
        system.executeCommand(cancelRoom);
    }
}
