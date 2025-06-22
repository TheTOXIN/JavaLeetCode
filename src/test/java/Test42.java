import org.example.Task42;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Test42 {

    Task42 task = Mockito.spy(Task42.class);

    @Test
    public void test_1() {
        int actual = task.trap(
                new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        Assertions.assertEquals(6, actual);
    }

    @Test
    public void test_2() {
        int actual = task.trap(
                new int[]{4, 2, 0, 3, 2, 5});
        Assertions.assertEquals(9, actual);
    }

    @Test
    public void test_3() {
        int actual = task.trap(
                new int[]{2, 0, 2});
        Assertions.assertEquals(9, actual);
    }
}
