import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<Task> test = new TreeSet<>(new TaskDateComparator());
        Epic epic = new Epic(1, "NEW_0L", "NEW", null,null);
        Epic epic1 = new Epic(2, "NEW_2L", "EPIC 2L", null,null);
        Task task3 = new Task(5, "NEW_2L", "NEW", Status.NEW, Duration.ofMinutes(1), null);
        Task task1 = new Task(5, "NEW_2L", "NEW", Status.NEW, Duration.ofMinutes(1), LocalDateTime.now());
        Task task2 = new Task(6, "NEW_3L", "NEW", Status.NEW, Duration.ofMinutes(60), LocalDateTime.now().plusMinutes(10));

        test.add(epic);
        test.add(epic1);
        test.add(task3);
        test.add(task1);
        test.add(task2);
        System.out.println(test);
    }
}
