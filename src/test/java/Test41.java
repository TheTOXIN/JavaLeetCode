import org.example.Task41;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Test41 {

    Task41 task = Mockito.spy(Task41.class);

    @Test
    public void test_1() {
        int actual = task.firstMissingPositive(
                new int[]{1, 2, 0});
        Assertions.assertEquals(3, actual);
    }

    @Test
    public void test_2() {
        int actual = task.firstMissingPositive(
                new int[]{3, 4, -1, 1});
        Assertions.assertEquals(2, actual);
    }

    @Test
    public void test_3() {
        int actual = task.firstMissingPositive(
                new int[]{7, 8, 9, 11, 12});
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void test_4() {
        int actual = task.firstMissingPositive(
                new int[]{1, 2, 3, 4});
        Assertions.assertEquals(5, actual);
    }

    @Test
    public void test_5() {
        int actual = task.firstMissingPositive(
                new int[]{-5});
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void test_6() {
        int actual = task.firstMissingPositive(
                new int[]{-1, -2, -60, 40, 43});
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void test_7() {
        int actual = task.firstMissingPositive(
                new int[]{3, 2});
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void test_8() {
        int actual = task.firstMissingPositive(
                new int[]{100000, 3, 4000, 2, 15, 1, 99999});
        Assertions.assertEquals(4, actual);
    }

}
