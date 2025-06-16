package tests_2;

import org.example.tasks_2.Task12;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Test12 {

    Task12 task = Mockito.spy(Task12.class);

    @Test
    public void test_1() {
        String res = task.intToRoman(3);
        Assertions.assertEquals("III", res);
    }

    @Test
    public void test_1_1() {
        String res = task.intToRoman(4);
        Assertions.assertEquals("IV", res);
    }

    @Test
    public void test_1_2() {
        String res = task.intToRoman(5);
        Assertions.assertEquals("V", res);
    }

    @Test
    public void test_1_3() {
        String res = task.intToRoman(7);
        Assertions.assertEquals("VII", res);
    }

    @Test
    public void test_1_9() {
        String res = task.intToRoman(9);
        Assertions.assertEquals("IX", res);
    }

    @Test
    public void test_1_10() {
        String res = task.intToRoman(10);
        Assertions.assertEquals("X", res);
    }

    @Test
    public void test_2() {
        String res = task.intToRoman(58);
        Assertions.assertEquals("LVIII", res);
    }

    @Test
    public void test_3() {
        String res = task.intToRoman(1994);
        Assertions.assertEquals("MCMXCIV", res);
    }

    @Test
    public void test_4() {
        String res = task.intToRoman(1231);
        Assertions.assertEquals("MCCXXXI", res);
    }

    @Test
    public void test_5() {
        String res = task.intToRoman(3657);
        Assertions.assertEquals("MMMDCLVII", res);
    }
}
