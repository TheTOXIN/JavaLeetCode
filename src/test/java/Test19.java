import org.example.Task19;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class Test19 {

    Task19 task = Mockito.spy(Task19.class);

    @Test
    public void test_1() {
        Task19.ListNode res = task.removeNthFromEnd(
                generate(List.of(1, 2, 3, 4, 5)), 2);

        Assertions.assertEquals(1, res.val);
        Assertions.assertEquals(2, res.next.val);
        Assertions.assertEquals(3, res.next.next.val);
        Assertions.assertEquals(5, res.next.next.next.val);
    }

    @Test
    public void test_2() {
        Task19.ListNode res = task.removeNthFromEnd(
                generate(List.of(1)), 1);

        Assertions.assertEquals(null, res);
    }

    @Test
    public void test_3() {
        Task19.ListNode res = task.removeNthFromEnd(
                generate(List.of(1, 2)), 1);

        Assertions.assertEquals(1, res.val);
        Assertions.assertEquals(null, res.next);
    }

    @Test
    public void test_4() {
        Task19.ListNode res = task.removeNthFromEnd(
                generate(List.of(1, 2)), 2);

        Assertions.assertEquals(2, res.val);
        Assertions.assertEquals(null, res.next);
    }

    public Task19.ListNode generate(List<Integer> list) {
        Task19.ListNode head = new Task19.ListNode();
        Task19.ListNode prev = null;
        for (int j = 0; j < list.size(); j++) {
            Integer i = list.get(j);
            if (prev == null) {
                if (j != list.size() - 1) {
                    prev = new Task19.ListNode();
                }
                head.val = i;
                head.next = prev;
            } else {
                prev.val = i;
                if (j != list.size() - 1) {
                    prev.next = new Task19.ListNode();
                }
                prev = prev.next;
            }
        }
        return head;
    }
}
