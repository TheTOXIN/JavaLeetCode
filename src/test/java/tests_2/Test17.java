package tests_2;

import org.example.tasks_2.Task17;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class Test17 {

    Task17 task = Mockito.spy(Task17.class);

    @Test
    public void test_1() {
        List<String> res = task.letterCombinations("23");
        assertTest(res, List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
    }

    @Test
    public void test_2() {
        List<String> res = task.letterCombinations("");
        assertTest(res, List.of());
    }

    @Test
    public void test_3() {
        List<String> res = task.letterCombinations("2");
        assertTest(res, List.of("a", "b", "c"));
    }

    @Test
    public void test_4() {
        List<String> res = task.letterCombinations("234");
        System.out.println(res);
        assertTest(res, List.of(
                "adg", "aeg", "afg", "bdg", "beg", "bfg", "cdg", "ceg", "cfg",
                "adh", "aeh", "afh", "bdh", "beh", "bfh", "cdh", "ceh", "cfh",
                "adi", "aei", "afi", "bdi", "bei", "bfi", "cdi", "cei", "cfi"));
    }

    private void assertTest(List<String> expected, List<String> actual) {
        List<String> test1 = new ArrayList<>(expected);
        List<String> test2 = new ArrayList<>(actual);

        test1.retainAll(test2);
        Assertions.assertEquals(test1.size(), test2.size());
    }
}
