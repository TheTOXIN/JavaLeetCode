import org.example.Task25;
import org.example.utils.ListNode;
import org.example.utils.Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Test25 {

    Task25 task = Mockito.spy(Task25.class);

    @Test
    public void test_1() {
        ListNode node = Util.generateNodeList(1, 2, 3, 4, 5);
        ListNode actual = task.reverseKGroup(node, 2);

        ListNode expected = Util.generateNodeList(2, 1, 4, 3, 5);
        Assertions.assertTrue(Util.compareNodes(actual, expected));
    }

    @Test
    public void test_2() {
        ListNode node = Util.generateNodeList(1, 2, 3, 4, 5);
        ListNode actual = task.reverseKGroup(node, 3);

        ListNode expected = Util.generateNodeList(3, 2, 1, 4, 5);
        Assertions.assertTrue(Util.compareNodes(actual, expected));
    }

    @Test
    public void test_3() {
        ListNode node = Util.generateNodeList(1, 2, 3);
        ListNode actual = task.reverseKGroup(node, 3);

        ListNode expected = Util.generateNodeList(3, 2, 1);
        Assertions.assertTrue(Util.compareNodes(actual, expected));
    }
}
