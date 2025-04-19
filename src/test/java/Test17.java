import org.example.Task17;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class Test17 {

    Task17 task = Mockito.spy(Task17.class);

    @Test
    public void test_1() {
        List<String> res = task.letterCombinations("23");
        assertTest(res, List.of("ad","ae","af","bd","be","bf","cd","ce","cf"));
    }

    @Test
    public void test_2() {
        List<String> res = task.letterCombinations("");
        assertTest(res, List.of());
    }

    @Test
    public void test_3() {
        List<String> res = task.letterCombinations("2");
        assertTest(res, List.of("a","b","c"));
    }

    private void assertTest(List<String> expected, List<String> actual) {
        Assertions.assertEquals(expected.size(), actual.size());
    }
}
