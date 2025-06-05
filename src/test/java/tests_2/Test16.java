package tests_2;

import org.example.tasks_02.Task16;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Test16 {

    Task16 task = Mockito.spy(Task16.class);

    @Test
    public void test_1() {
        int res = task.threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
        Assertions.assertEquals(res, 2);
    }

    @Test
    public void test_2() {
        int res = task.threeSumClosest(new int[]{0, 0, 0}, 1);
        Assertions.assertEquals(res, 0);
    }
}
