import org.example.Task11;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Test11 {

    Task11 task = Mockito.spy(Task11.class);

    @Test
    public void test_1() {
        int res = task.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        Assertions.assertEquals(49, res);
    }

    @Test
    public void test_2() {
        int res = task.maxArea(new int[]{1, 1});
        Assertions.assertEquals(1, res);
    }

    @Test
    public void test_3() {
        int res = task.maxArea(new int[]{1,2,4,3});
        Assertions.assertEquals(4, res);
    }
}
