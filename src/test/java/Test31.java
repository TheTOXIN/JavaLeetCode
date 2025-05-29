import org.example.Task31;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Test31 {

    Task31 task = Mockito.spy(Task31.class);

    @Test
    public void test_1() {
        int[] nums = {1, 2, 3};
        task.nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{1, 3, 2}, nums);
    }

    @Test
    public void test_2() {
        int[] nums = {3, 2, 1};
        task.nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{1, 2, 3}, nums);
    }

    @Test
    public void test_3() {
        int[] nums = {1, 1, 5};
        task.nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{1, 5, 1}, nums);
    }

    @Test
    public void test_4() {
        int[] nums = {2, 4, 3, 1};
        task.nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{3, 1, 2, 4}, nums);
    }

    @Test
    public void test_5() {
        int[] nums = {3, 1, 2};
        task.nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{3, 2, 1}, nums);
    }

    @Test
    public void test_6() {
        int[] nums = {5, 1, 1};
        task.nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{1, 1, 5}, nums);
    }

    @Test
    public void test_7() {
        int[] nums = {5, 4, 7, 5, 3, 2};
        task.nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{5, 5, 2, 3, 4, 7}, nums);
    }
}
