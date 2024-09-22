package StructuralPatterns.AdapterPattern;

public class BookingAdapter implements NewBookingSystem {
    private LegacyBookingSystem legacySystem;

    public BookingAdapter(LegacyBookingSystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public void book() {
        legacySystem.reserve();
    }
}
