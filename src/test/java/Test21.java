import org.example.Task21;
import org.example.utils.ListNode;
import org.example.utils.Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class Test21 {

    Task21 task = Mockito.spy(Task21.class);

    @Test
    public void test_1() {
        ListNode actual = task.mergeTwoLists(
                Util.generateNodeList(List.of(1, 2, 4)),
                Util.generateNodeList(List.of(1, 3, 4))
        );
        Util.printListNode(actual);
        ListNode expected = Util.generateNodeList(List.of(1, 1, 2, 3, 4, 4));
        Assertions.assertTrue(Util.compareNodes(actual, expected));
    }

    @Test
    public void test_1_1() {
        ListNode actual = task.mergeTwoLists(
                Util.generateNodeList(List.of(2, 4)),
                Util.generateNodeList(List.of(1, 1, 3, 4))
        );
        Util.printListNode(actual);
        ListNode expected = Util.generateNodeList(List.of(1, 1, 2, 3, 4, 4));
        Assertions.assertTrue(Util.compareNodes(actual, expected));
    }

    @Test
    public void test_2() {
        ListNode actual = task.mergeTwoLists(
                Util.generateNodeList(List.of()),
                Util.generateNodeList(List.of())
        );
        ListNode expected = Util.generateNodeList(List.of());
        Assertions.assertTrue(Util.compareNodes(actual, expected));
    }

    @Test
    public void test_3() {
        ListNode actual = task.mergeTwoLists(
                Util.generateNodeList(List.of()),
                Util.generateNodeList(List.of(0))
        );
        ListNode expected = Util.generateNodeList(List.of(0));
        Assertions.assertTrue(Util.compareNodes(actual, expected));
    }
}
