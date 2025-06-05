package tests_1;

import org.example.tasks_01.Task6;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Test6 {

    Task6 task = Mockito.spy(Task6.class);

    static long time = 0;

    @BeforeAll
    public static void before() {
        time = System.nanoTime();
    }

    @AfterAll
    public static void after() {
        System.out.println("TIME: " + (System.nanoTime() - time));
    }

    @Test
    public void test_1() {
        String res = task.convert("PAYPALISHIRING", 3);
        Assertions.assertEquals(res, "PAHNAPLSIIGYIR");
    }

    @Test
    public void test_2() {
        String res = task.convert("PAYPALISHIRING", 4);
        Assertions.assertEquals(res, "PINALSIGYAHRPI");
    }

    @Test
    public void test_3() {
        String res = task.convert("A", 1);
        Assertions.assertEquals(res, "A");
    }

    @Test
    public void test_4() {
        String res = task.convert("PAYPALISHIRING", 5);
        Assertions.assertEquals(res, "PHASIYIRPLIGAN");
    }

    @Test
    public void test_5() {
        String res = task.convert("FCKLEETCODE", 3);
        Assertions.assertEquals(res, "FEOCLECDKTE");
    }

    @Test
    public void test_6() {
        String res = task.convert("FCKLEETCODE", 4);
        Assertions.assertEquals(res, "FTCECKEOELD");
    }

    @Test
    public void test_7() {
        String res = task.convert("AB", 3);
        Assertions.assertEquals(res, "AB");
    }

    @Test
    public void test_8() {
        String res = task.convert("A", 2);
        Assertions.assertEquals(res, "A");
    }
}
