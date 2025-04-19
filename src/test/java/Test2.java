import org.example.Task2;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class Test2 {

    private final Task2 task = Mockito.spy(new Task2());

    @Test
    public void test_1() {
        Task2.ListNode l1 = createNode(List.of(2, 4, 3));
        Task2.ListNode l2 = createNode(List.of(5, 6, 4));

        Task2.ListNode res = task.addTwoNumbers(l1, l2);
        printNode(res);//7,0,8
    }

    @Test
    public void test_2() {
        Task2.ListNode l1 = createNode(List.of(9, 9, 9, 9, 9, 9, 9));
        Task2.ListNode l2 = createNode(List.of(9, 9, 9, 9));

        Task2.ListNode res = task.addTwoNumbers(l1, l2);
        printNode(res); //8,9,9,9,0,0,0,1
    }

    private static Task2.ListNode createNode(List<Integer> list) {
        Task2.ListNode node = null;

        Task2.ListNode nextNode = null;
        Task2.ListNode lastNode = null;

        for (Integer val : list) {
            if (nextNode != null) {
                Task2.ListNode newNode = new Task2.ListNode();

                nextNode.val = val;
                nextNode.next = newNode;

                lastNode = nextNode;
                nextNode = newNode;
            }

            if (node == null) {
                nextNode = new Task2.ListNode();
                node = new Task2.ListNode(val, nextNode);
            }
        }

        if (lastNode != null) {
            lastNode.next = null;
        }

        return node;
    }

    private void printNode(Task2.ListNode node) {
        System.out.println("node=" + node.val);

        if (node.next == null) {
            return;
        } else {
            printNode(node.next);
        }
    }
}
