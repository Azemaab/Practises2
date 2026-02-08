import java.util.*;

public class Task21 {

    static ArrayDeque<String> tasks = new ArrayDeque<>();

    public static void addTask(String task, boolean highPriority) {
        if (highPriority) {
            tasks.addFirst(task);
        } else {
            tasks.addLast(task);
        }
    }

    public static void processTask() {
        System.out.println("Processing: " + tasks.pollFirst());
    }

    public static void main(String[] args) {
        addTask("Homework", false);
        addTask("Exam", true);
        addTask("Project", false);

        processTask();
        processTask();
    }
}
