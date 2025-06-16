package tests_3;

import org.example.tasks_3.Task24;
import org.example.utils.ListNode;
import org.example.utils.Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class Test24 {

    Task24 task = Mockito.spy(Task24.class);

    @Test
    public void test_0() {
        ListNode node = Util.generateNodeList(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        ListNode actual = task.swapPairs(node);
        ListNode expected = Util.generateNodeList(List.of(2, 1, 4, 3, 6, 5, 8, 7, 9));
        Assertions.assertTrue(Util.compareNodes(actual, expected));
    }

    @Test
    public void test_1() {
        ListNode node = Util.generateNodeList(List.of(1, 2, 3, 4));
        ListNode actual = task.swapPairs(node);
        ListNode expected = Util.generateNodeList(List.of(2, 1, 4, 3));
        Assertions.assertTrue(Util.compareNodes(actual, expected));
    }

    @Test
    public void test_2() {
        ListNode node = Util.generateNodeList(List.of());
        ListNode actual = task.swapPairs(node);
        ListNode expected = Util.generateNodeList(List.of());
        Assertions.assertTrue(Util.compareNodes(actual, expected));
    }

    @Test
    public void test_3() {
        ListNode node = Util.generateNodeList(List.of(1));
        ListNode actual = task.swapPairs(node);
        ListNode expected = Util.generateNodeList(List.of(1));
        Assertions.assertTrue(Util.compareNodes(actual, expected));
    }

    @Test
    public void test_4() {
        ListNode node = Util.generateNodeList(List.of(1, 2, 3));
        ListNode actual = task.swapPairs(node);
        ListNode expected = Util.generateNodeList(List.of(2, 1, 3));
        Assertions.assertTrue(Util.compareNodes(actual, expected));
    }
}
