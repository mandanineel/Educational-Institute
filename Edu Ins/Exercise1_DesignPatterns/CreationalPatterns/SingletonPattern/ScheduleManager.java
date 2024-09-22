package CreationalPatterns.SingletonPattern;

public class ScheduleManager {
    private static ScheduleManager instance;

    private ScheduleManager() {}

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void showSchedule() {
        System.out.println("Showing the schedule...");
    }
}
