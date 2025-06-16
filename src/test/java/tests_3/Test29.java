package tests_3;

import org.example.tasks_3.Task29;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Test29 {

    Task29 task = Mockito.spy(Task29.class);

    @Test
    public void test_1() {
        int actual = task.divide(10, 3);
        Assertions.assertEquals(3, actual);
    }

    @Test
    public void test_2() {
        int actual = task.divide(7, -3);
        Assertions.assertEquals(-2, actual);
    }

    @Test
    public void test_3() {
        int actual = task.divide(1, 1);
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void test_4() {
        int actual = task.divide(-1, 1);
        Assertions.assertEquals(-1, actual);
    }

    @Test
    public void test_5() {
        int actual = task.divide(-2147483648, -1);
        Assertions.assertEquals(2147483647, actual);
    }

    @Test
    public void test_6() {
        int actual = task.divide(-2147483648, 1);
        Assertions.assertEquals(-2147483648, actual);
    }

    @Test
    public void test_7() {
        int actual = task.divide(2147483647, 2);
        Assertions.assertEquals(1073741823, actual);
    }

    @Test
    public void test_8() {
        int actual = task.divide(-2147483648, 2);
        Assertions.assertEquals(-1073741824, actual);
    }

    @Test
    public void test_9() {
        int actual = task.divide(-2147483648, -3);
        Assertions.assertEquals(715827882, actual);
    }

    @Test
    public void test_10() {
        int actual = task.divide(1, -1);
        Assertions.assertEquals(-1, actual);
    }

    @Test
    public void test_11() {
        int actual = task.divide(2147483647, 1);
        Assertions.assertEquals(2147483647, actual);
    }

    @Test
    public void test_12() {
        int actual = task.divide(-231, 3);
        Assertions.assertEquals(-77, actual);
    }

    @Test
    public void test_tmp() {
        int actual = task.divide(512 + 69, 64);
        Assertions.assertEquals(9, actual);
    }
}
