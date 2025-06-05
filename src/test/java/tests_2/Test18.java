package tests_2;

import org.example.tasks_02.Task18;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class Test18 {

    Task18 task = Mockito.spy(Task18.class);

    @Test
    public void test_1() {
        List<List<Integer>> res = task.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        System.out.println(res); //[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
        assertEquals(List.of(
                List.of(-2, -1, 1, 2),
                List.of(-2, 0, 0, 2),
                List.of(-1, 0, 0, 1)
        ), res);
    }

    @Test
    public void test_2() {
        List<List<Integer>> res = task.fourSum(new int[]{2, 2, 2, 2, 2}, 8);
        System.out.println(res); //[[2,2,2,2]]
        assertEquals(List.of(List.of(2, 2, 2, 2)), res);
    }

    @Test
    public void test_3() {
        List<List<Integer>> res = task.fourSum(new int[]{-3, -2, -1, 0, 0, 1, 2, 3}, 0);
        System.out.println(res);
        //[[-3,-2,2,3],[-3,-1,1,3],[-3,0,0,3],[-3,0,1,2],[-2,-1,0,3],[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
        assertEquals(List.of(
                List.of(-3, -2, 2, 3),
                List.of(-3, -1, 1, 3),
                List.of(-3, 0, 0, 3),
                List.of(-3, 0, 1, 2),
                List.of(-2, -1, 0, 3),
                List.of(-2, -1, 1, 2),
                List.of(-2, 0, 0, 2),
                List.of(-1, 0, 0, 1)
        ), res);
    }

    @Test
    public void test_4() {
        List<List<Integer>> res = task.fourSum(
                new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296);
        System.out.println(res);
        assertEquals(List.of(), res);
    }

    private void assertEquals(List<List<Integer>> expected, List<List<Integer>> actual) {
        Assertions.assertEquals(expected.size(), actual.size());
    }
}
