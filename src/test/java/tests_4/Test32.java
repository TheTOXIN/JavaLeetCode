package tests_4;

import org.example.tasks_4.Task32;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Test32 {

    Task32 task = Mockito.spy(Task32.class);

    @Test
    public void test_1() {
        int res = task.longestValidParentheses("(()");
        Assertions.assertEquals(2, res);
    }

    @Test
    public void test_2() {
        int res = task.longestValidParentheses(")()())");
        Assertions.assertEquals(4, res);
    }

    @Test
    public void test_3() {
        int res = task.longestValidParentheses("");
        Assertions.assertEquals(0, res);
    }

    @Test
    public void test_4() {
        int res = task.longestValidParentheses(")((");
        Assertions.assertEquals(0, res);
    }

    @Test
    public void test_5() {
        int res = task.longestValidParentheses("()");
        Assertions.assertEquals(2, res);
    }

    @Test
    public void test_6() {
        int res = task.longestValidParentheses("()(())");
        Assertions.assertEquals(6, res);
    }

    @Test
    public void test_7() {
        int res = task.longestValidParentheses("()((()(())(()");
        Assertions.assertEquals(6, res);
    }

    @Test
    public void test_8() {
        int res = task.longestValidParentheses("(()))())(");
        Assertions.assertEquals(4, res);
    }

    @Test
    public void test_9() {
        int res = task.longestValidParentheses(")(())))(())())");
        Assertions.assertEquals(6, res);
    }
}
