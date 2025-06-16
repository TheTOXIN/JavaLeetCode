package tests_3;

import org.example.tasks_3.Task22;
import org.example.utils.Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class Test22 {

    Task22 task = Mockito.spy(Task22.class);

    @Test
    public void test_1() {
        List<String> actual = task.generateParenthesis(1);
        List<String> expected = List.of("()");
        Assertions.assertTrue(Util.compareToList(expected, actual));
    }

    @Test
    public void test_2() {
        List<String> actual = task.generateParenthesis(2);
        List<String> expected = List.of("(())","()()");
        Assertions.assertTrue(Util.compareToList(expected, actual));
    }

    @Test
    public void test_3() {
        List<String> actual = task.generateParenthesis(3);
        List<String> expected = List.of("((()))","(()())","(())()","()(())","()()()");
        Assertions.assertTrue(Util.compareToList(expected, actual));
    }
}
