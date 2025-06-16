package tests_1;

import org.example.tasks_1.Task8;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Test8 {

    Task8 task = Mockito.spy(Task8.class);

    @Test
    public void test_1() {
        int res = task.myAtoi("42");
        Assertions.assertEquals(res, 42);
    }

    @Test
    public void test_2() {
        int res = task.myAtoi(" -042");
        Assertions.assertEquals(res, -42);
    }

    @Test
    public void test_3() {
        int res = task.myAtoi("1337c0d3");
        Assertions.assertEquals(res, 1337);
    }

    @Test
    public void test_4() {
        int res = task.myAtoi("0-1");
        Assertions.assertEquals(res, 0);
    }

    @Test
    public void test_5() {
        int res = task.myAtoi("words and 987");
        Assertions.assertEquals(res, 0);
    }

    @Test
    public void test_6() {
        int res = task.myAtoi("-91283472332");
        Assertions.assertEquals(res, -2147483648);
    }

    @Test
    public void test_7() {
        int res = task.myAtoi("91283472332");
        Assertions.assertEquals(res, 2147483647);
    }

    @Test
    public void test_8() {
        int res = task.myAtoi("+1");
        Assertions.assertEquals(res, 1);
    }

    @Test
    public void test_9() {
        int res = task.myAtoi(" ");
        Assertions.assertEquals(res, 0);
    }

    @Test
    public void test_10() {
        int res = task.myAtoi("2147483648");
        Assertions.assertEquals(res, 2147483647);
    }

    @Test
    public void test_11() {
        int res = task.myAtoi("+-12");
        Assertions.assertEquals(res, 0);
    }

    @Test
    public void test_12() {
        int res = task.myAtoi("-+12");
        Assertions.assertEquals(res, 0);
    }

    @Test
    public void test_13() {
        int res = task.myAtoi("   +0 123");
        Assertions.assertEquals(res, 0);
    }

    @Test
    public void test_14() {
        int res = task.myAtoi("-13+8");
        Assertions.assertEquals(res, -13);
    }
}
