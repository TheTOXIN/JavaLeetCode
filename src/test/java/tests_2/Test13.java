package tests_2;

import org.example.tasks_2.Task13;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Test13 {

    Task13 task = Mockito.spy(Task13.class);

    @Test
    public void test_1() {
        int res = task.romanToInt("III");
        Assertions.assertEquals(3, res);
    }

    @Test
    public void test_1_1() {
        int res = task.romanToInt("IV");
        Assertions.assertEquals(4, res);
    }

    @Test
    public void test_1_2() {
        int res = task.romanToInt("V");
        Assertions.assertEquals(5, res);
    }

    @Test
    public void test_1_3() {
        int res = task.romanToInt("VII");
        Assertions.assertEquals(7, res);
    }

    @Test
    public void test_1_9() {
        int res = task.romanToInt("IX");
        Assertions.assertEquals(9, res);
    }

    @Test
    public void test_1_10() {
        int res = task.romanToInt("X");
        Assertions.assertEquals(10, res);
    }

    @Test
    public void test_2() {
        int res = task.romanToInt("LVIII");
        Assertions.assertEquals(58, res);
    }

    @Test
    public void test_3() {
        int res = task.romanToInt("MCMXCIV");
        Assertions.assertEquals(1994, res);
    }

    @Test
    public void test_4() {
        int res = task.romanToInt("MCCXXXI");
        Assertions.assertEquals(1231, res);
    }

    @Test
    public void test_5() {
        int res = task.romanToInt("MMMDCLVII");
        Assertions.assertEquals(3657, res);
    }
}
