import org.example.Task39;
import org.example.Task40;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.example.utils.Util.compareInnerLists;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test40 {

    Task40 task = Mockito.spy(Task40.class);

    @Test
    public void test_1() {
        List<List<Integer>> actual = task.combinationSum2(
                new int[]{10, 1, 2, 7, 6, 1, 5}, 8);

        List<List<Integer>> expected = List.of(
                List.of(1, 1, 6),
                List.of(1, 2, 5),
                List.of(1, 7),
                List.of(2, 6)
        );

        assertTrue(compareInnerLists(actual, expected));
    }

    @Test
    public void test_2() {
        List<List<Integer>> actual = task.combinationSum2(
                new int[]{2, 5, 2, 1, 2}, 5);

        List<List<Integer>> expected = List.of(
                List.of(1, 2, 2),
                List.of(5)
        );

        assertTrue(compareInnerLists(actual, expected));
    }
}
