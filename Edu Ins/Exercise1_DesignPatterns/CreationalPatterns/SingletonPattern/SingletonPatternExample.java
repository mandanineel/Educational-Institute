package CreationalPatterns.SingletonPattern;

public class SingletonPatternExample {
    public static void main(String[] args) {
        ScheduleManager manager = ScheduleManager.getInstance();
        manager.showSchedule();
    }
}
