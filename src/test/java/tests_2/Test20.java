package tests_2;

import org.example.tasks_02.Task20;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Test20 {

    Task20 task = Mockito.spy(Task20.class);

    @Test
    public void test_1() {
        Assertions.assertTrue(task.isValid("()"));
    }

    @Test
    public void test_2() {
        Assertions.assertTrue(task.isValid("()[]{}"));
    }

    @Test
    public void test_3() {
        Assertions.assertFalse(task.isValid("(]"));
    }

    @Test
    public void test_4() {
        Assertions.assertTrue(task.isValid("([])"));
    }

    @Test
    public void test_5() {
        Assertions.assertTrue(task.isValid("({}[()[]]{})"));
    }

    @Test
    public void test_6() {
        Assertions.assertFalse(task.isValid("({[}()]{})"));
    }

    @Test
    public void test_7() {
        Assertions.assertFalse(task.isValid("]"));
    }

    @Test
    public void test_8() {
        Assertions.assertFalse(task.isValid("){"));
    }

    @Test
    public void test_9() {
        Assertions.assertFalse(task.isValid("(])"));
    }

    @Test
    public void test_10() {
        Assertions.assertFalse(task.isValid("([}}])"));
    }
}
