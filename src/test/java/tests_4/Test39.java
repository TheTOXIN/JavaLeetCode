package tests_4;

import org.example.tasks_4.Task39;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.example.utils.Util.compareInnerLists;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test39 {

    Task39 task = Mockito.spy(Task39.class);

    @Test
    public void test_1() {
        List<List<Integer>> actual = task.combinationSum(
                new int[]{2, 3, 6, 7}, 7);

        List<List<Integer>> expected = List.of(
                List.of(2, 2, 3),
                List.of(7)
        );

        assertTrue(compareInnerLists(actual, expected));
    }

    @Test
    public void test_2() {
        List<List<Integer>> actual = task.combinationSum(
                new int[]{2, 3, 5}, 8);

        List<List<Integer>> expected = List.of(
                List.of(2, 2, 2, 2),
                List.of(2, 3, 3),
                List.of(3, 5)
        );

        assertTrue(compareInnerLists(actual, expected));
    }

    @Test
    public void test_3() {
        List<List<Integer>> actual = task.combinationSum(
                new int[]{2}, 1);

        List<List<Integer>> expected = List.of();

        assertTrue(compareInnerLists(actual, expected));
    }
}
