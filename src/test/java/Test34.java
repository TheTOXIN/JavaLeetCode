import org.example.Task34;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Test34 {

    Task34 task = Mockito.spy(Task34.class);

    @Test
    public void test_1() {
        int[] res = task.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        Assertions.assertEquals(3, res[0]);
        Assertions.assertEquals(4, res[1]);
    }

    @Test
    public void test_1_1() {
        int[] res = task.searchRange(new int[]{5, 8, 8, 8, 8, 10}, 8);
        Assertions.assertEquals(1, res[0]);
        Assertions.assertEquals(4, res[1]);
    }

    @Test
    public void test_1_2() {
        int[] res = task.searchRange(new int[]{5, 8, 9, 9, 9, 10}, 8);
        Assertions.assertEquals(1, res[0]);
        Assertions.assertEquals(1, res[1]);
    }

    @Test
    public void test_2() {
        int[] res = task.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6);
        Assertions.assertEquals(-1, res[0]);
        Assertions.assertEquals(-1, res[1]);
    }

    @Test
    public void test_3() {
        int[] res = task.searchRange(new int[]{}, 0);
        Assertions.assertEquals(-1, res[0]);
        Assertions.assertEquals(-1, res[1]);
    }
}
