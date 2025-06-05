package tests_1;

import org.example.tasks_01.Task3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Test3 {

    private final Task3 task = Mockito.spy(new Task3());

    @Test
    public void test_1() {
        int res = task.lengthOfLongestSubstring("abcabcbb");
        Assertions.assertEquals(3, res);
    }

    @Test
    public void test_2() {
        int res = task.lengthOfLongestSubstring("bbbbb");
        Assertions.assertEquals(1, res);
    }

    @Test
    public void test_3() {
        int res = task.lengthOfLongestSubstring("pwwkew");
        Assertions.assertEquals(3, res);
    }

    @Test
    public void test_4() {
        int res = task.lengthOfLongestSubstring(" ");
        Assertions.assertEquals(1, res);
    }

    @Test
    public void test_5() {
        int res = task.lengthOfLongestSubstring("dvdf");
        Assertions.assertEquals(3, res);
    }

    @Test
    public void test_6() {
        int res = task.lengthOfLongestSubstring("vdvdf");
        Assertions.assertEquals(3, res);
    }

    @Test
    public void test_7() {
        int res = task.lengthOfLongestSubstring("vdvdvdf");
        Assertions.assertEquals(3, res);
    }

    @Test
    public void test_8() {
        int res = task.lengthOfLongestSubstring("loddktdji");
        Assertions.assertEquals(5, res);
    }

    @Test
    public void test_9() {
        int res = task.lengthOfLongestSubstring("dlokdktdji");
        Assertions.assertEquals(5, res);
    }

    @Test
    public void test_10() {
        int res = task.lengthOfLongestSubstring("abba");
        Assertions.assertEquals(2, res);
    }
}
