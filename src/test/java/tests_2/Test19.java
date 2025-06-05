package tests_2;

import org.example.tasks_02.Task19;
import org.example.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.example.utils.Util.generateNodeList;

public class Test19 {

    Task19 task = Mockito.spy(Task19.class);

    @Test
    public void test_1() {
        ListNode res = task.removeNthFromEnd(
                generateNodeList(List.of(1, 2, 3, 4, 5)), 2);

        Assertions.assertEquals(1, res.val);
        Assertions.assertEquals(2, res.next.val);
        Assertions.assertEquals(3, res.next.next.val);
        Assertions.assertEquals(5, res.next.next.next.val);
    }

    @Test
    public void test_2() {
        ListNode res = task.removeNthFromEnd(
                generateNodeList(List.of(1)), 1);

        Assertions.assertEquals(null, res);
    }

    @Test
    public void test_3() {
        ListNode res = task.removeNthFromEnd(
                generateNodeList(List.of(1, 2)), 1);

        Assertions.assertEquals(1, res.val);
        Assertions.assertEquals(null, res.next);
    }

    @Test
    public void test_4() {
        ListNode res = task.removeNthFromEnd(
                generateNodeList(List.of(1, 2)), 2);

        Assertions.assertEquals(2, res.val);
        Assertions.assertEquals(null, res.next);
    }
}
