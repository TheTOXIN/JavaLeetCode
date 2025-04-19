import org.example.Task1;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {

    private final Task1 task = Mockito.spy(new Task1());

    @Test
    public void test_1() {
        int[] res = task.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertEquals(res[0], 0);
        assertEquals(res[1], 1);
    }

    @Test
    public void test_2() {
        int[] res = task.twoSum(new int[]{3, 2, 4}, 6);
        assertEquals(res[0], 1);
        assertEquals(res[1], 2);
    }

    @Test
    public void test_3() {
        int[] res = task.twoSum(new int[]{3, 3}, 6);
        assertEquals(res[0], 0);
        assertEquals(res[1], 1);
    }

    @Test
    public void test_4() {
        int[] res = task.twoSum(new int[]{2, 8, 7}, 9);
        assertEquals(res[0], 0);
        assertEquals(res[1], 2);
    }

    @Test
    public void test_5() {
        int[] res = task.twoSum(new int[]{0, 4, 3, 0}, 0);
        assertEquals(res[0], 0);
        assertEquals(res[1], 3);
    }

    @Test
    public void test_6() {
        int[] res = task.twoSum(new int[]{-3, 4, 3, 90}, 0);
        assertEquals(res[0], 0);
        assertEquals(res[1], 2);
    }
}