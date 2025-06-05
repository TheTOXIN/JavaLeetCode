package tests_1;

import org.example.tasks_01.Task7;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Test7 {

    Task7 task = Mockito.spy(Task7.class);

    @Test
    public void test_1() {
        int reverse = task.reverse(123);
        Assertions.assertEquals(321 ,reverse);
    }

    @Test
    public void test_2() {
        int reverse = task.reverse(-123);
        Assertions.assertEquals(-321 ,reverse);
    }

    @Test
    public void test_3() {
        int reverse = task.reverse(120);
        Assertions.assertEquals(21 ,reverse);
    }

    @Test
    public void test_4() {
        int reverse = task.reverse(12345);
        Assertions.assertEquals(54321 ,reverse);
    }

    @Test
    public void test_5() {
        int reverse = task.reverse(123456);
        Assertions.assertEquals(654321 ,reverse);
    }

    @Test
    public void test_6() {
        int reverse = task.reverse(-12345);
        Assertions.assertEquals(-54321 ,reverse);
    }

    @Test
    public void test_7() {
        int reverse = task.reverse(-123456);
        Assertions.assertEquals(-654321 ,reverse);
    }

    @Test
    public void test_8() {
        int reverse = task.reverse(-2147483647);
        Assertions.assertEquals(0 ,reverse);
    }

    @Test
    public void test_9() {
        int reverse = task.reverse(2147483647);
        Assertions.assertEquals(0 ,reverse);
    }

    @Test
    public void test_10() {
        int reverse = task.reverse(1534236469);
        Assertions.assertEquals(0 ,reverse);
    }

    @Test
    public void test_performance() {
        long l = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            task.reverse(1234567890);
        }
        System.out.println(System.nanoTime() - l);
    }
}
