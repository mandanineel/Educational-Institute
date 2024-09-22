package Main;

import Singleton.ScheduleManager;
import Factory.TaskFactory;
import Models.Task;

public class AstronautScheduleApp {
    public static void main(String[] args) {
        // Get the single instance of ScheduleManager (Singleton Pattern)
        ScheduleManager manager = ScheduleManager.getInstance();

        // Create a TaskFactory instance (Factory Pattern)
        TaskFactory taskFactory = new TaskFactory();

        // Create two tasks using the factory
        Task task1 = taskFactory.createTask("Morning Exercise", "07:00", "08:00", "High");
        Task task2 = taskFactory.createTask("Team Meeting", "09:00", "10:00", "Medium");

        // Add tasks to the ScheduleManager
        manager.addTask(task1);
        manager.addTask(task2);

        // View the tasks in the schedule
        manager.viewTasks();

        // Remove a task by description
        manager.removeTask("Morning Exercise");

        // View the tasks after removal
        manager.viewTasks();
    }
}
