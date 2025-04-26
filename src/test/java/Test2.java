import org.example.Task2;
import org.example.utils.ListNode;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class Test2 {

    private final Task2 task = Mockito.spy(new Task2());

    @Test
    public void test_1() {
        ListNode l1 = createNode(List.of(2, 4, 3));
        ListNode l2 = createNode(List.of(5, 6, 4));

        ListNode res = task.addTwoNumbers(l1, l2);
        printNode(res);//7,0,8
    }

    @Test
    public void test_2() {
        ListNode l1 = createNode(List.of(9, 9, 9, 9, 9, 9, 9));
        ListNode l2 = createNode(List.of(9, 9, 9, 9));

        ListNode res = task.addTwoNumbers(l1, l2);
        printNode(res); //8,9,9,9,0,0,0,1
    }

    private static ListNode createNode(List<Integer> list) {
        ListNode node = null;

        ListNode nextNode = null;
        ListNode lastNode = null;

        for (Integer val : list) {
            if (nextNode != null) {
                ListNode newNode = new ListNode();

                nextNode.val = val;
                nextNode.next = newNode;

                lastNode = nextNode;
                nextNode = newNode;
            }

            if (node == null) {
                nextNode = new ListNode();
                node = new ListNode(val, nextNode);
            }
        }

        if (lastNode != null) {
            lastNode.next = null;
        }

        return node;
    }

    private void printNode(ListNode node) {
        System.out.println("node=" + node.val);

        if (node.next == null) {
            return;
        } else {
            printNode(node.next);
        }
    }
}
