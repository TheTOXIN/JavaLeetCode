package tests_3;

import org.example.tasks_03.Task28;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Test28 {

    Task28 task = Mockito.spy(Task28.class);

    @Test
    public void test_1() {
        int actual = task.strStr("sadbutsad", "sad");
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void test_2() {
        int actual = task.strStr("leetcode", "leeto");
        Assertions.assertEquals(-1, actual);
    }

    @Test
    public void test_3() {
        int actual = task.strStr("mississippi", "issip");
        Assertions.assertEquals(4, actual);
    }

    @Test
    public void test_4() {
        int actual = task.strStr("hello", "ll");
        Assertions.assertEquals(2, actual);
    }

    @Test
    public void test_5() {
        int actual = task.strStr("a", "a");
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void test_6() {
        int actual = task.strStr("abc", "c");
        Assertions.assertEquals(2, actual);
    }
}
