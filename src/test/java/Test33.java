import org.example.Task33;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Test33 {

    Task33 task = Mockito.spy(Task33.class);

    @Test
    public void test_1() {
        int res = task.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
        Assertions.assertEquals(4, res);
    }

    @Test
    public void test_1_1() {
        int res = task.search(new int[]{4, 5, 6, 7, 8, 9, 0, 1, 2}, 0);
        Assertions.assertEquals(6, res);
    }

    @Test
    public void test_1_2() {
        int res = task.search(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 7);
        Assertions.assertEquals(7, res);
    }

    @Test
    public void test_2() {
        int res = task.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3);
        Assertions.assertEquals(-1, res);
    }

    @Test
    public void test_3() {
        int res = task.search(new int[]{1}, 0);
        Assertions.assertEquals(-1, res);
    }

    @Test
    public void test_4() {
        int res = task.search(new int[]{1}, 0);
        Assertions.assertEquals(-1, res);
    }
}
