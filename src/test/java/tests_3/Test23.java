package tests_3;

import org.example.tasks_03.Task23;
import org.example.utils.ListNode;
import org.example.utils.Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class Test23 {

    Task23 task = Mockito.spy(Task23.class);

    @Test
    public void test_0() {
        ListNode actual = task.mergeKLists(new ListNode[]{
                Util.generateNodeList(List.of(0)),
                Util.generateNodeList(List.of(1)),
                Util.generateNodeList(List.of(2)),
                Util.generateNodeList(List.of(3)),
                Util.generateNodeList(List.of(4)),
                Util.generateNodeList(List.of(5)),
                Util.generateNodeList(List.of(6)),
                Util.generateNodeList(List.of(7)),
                Util.generateNodeList(List.of(8)),
                Util.generateNodeList(List.of(9))
        });
        Util.printListNode(actual);
    }

    @Test
    public void test_1() {
        ListNode actual = task.mergeKLists(new ListNode[]{
                Util.generateNodeList(List.of(1, 4, 5)),
                Util.generateNodeList(List.of(1, 3, 4)),
                Util.generateNodeList(List.of(2, 6))
        });
        Util.printListNode(actual);
        ListNode expected = Util.generateNodeList(List.of(1, 1, 2, 3, 4, 4, 5, 6));
        Assertions.assertTrue(Util.compareNodes(actual, expected));
    }

    @Test
    public void test_2() {
        ListNode actual = task.mergeKLists(new ListNode[]{});
        Assertions.assertNull(actual);
    }

    @Test
    public void test_3() {
        ListNode actual = task.mergeKLists(new ListNode[]{
                Util.generateNodeList(List.of()),
        });
        Assertions.assertNull(actual);
    }

    @Test
    public void test_4() {
        ListNode actual = task.mergeKLists(new ListNode[]{
                Util.generateNodeList(List.of(0, 2, 5)),
        });
        Util.printListNode(actual);
        ListNode expected = Util.generateNodeList(List.of(0, 2, 5));
        Assertions.assertTrue(Util.compareNodes(actual, expected));
    }

    @Test
    public void test_5() {
        ListNode actual = task.mergeKLists(new ListNode[]{
                Util.generateNodeList(List.of(2)),
                Util.generateNodeList(List.of()),
                Util.generateNodeList(List.of(-1)),
        });
        Util.printListNode(actual);
        ListNode expected = Util.generateNodeList(List.of(-1, 2));
        Assertions.assertTrue(Util.compareNodes(actual, expected));
    }
}
