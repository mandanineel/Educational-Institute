package StructuralPatterns.AdapterPattern;

public class AdapterPatternExample {
    public static void main(String[] args) {
        LegacyBookingSystem legacySystem = new LegacyBookingSystem();
        NewBookingSystem bookingSystem = new BookingAdapter(legacySystem);
        bookingSystem.book();
    }
}
