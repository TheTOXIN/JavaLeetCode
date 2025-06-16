package tests_1;

import org.example.tasks_1.Task4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Test4 {

    private final Task4 task = Mockito.spy(new Task4());

    @Test
    public void test_1() {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};

        double res = task.findMedianSortedArrays(nums1, nums2);
        Assertions.assertEquals(res, 2.00000);
    }

    @Test
    public void test_2() {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};

        double res = task.findMedianSortedArrays(nums1, nums2);
        Assertions.assertEquals(res, 2.50000);
    }

    @Test
    public void test_3() {
        int[] nums1 = new int[]{1, 5, 7};
        int[] nums2 = new int[]{2, 3, 6, 9};

        double res = task.findMedianSortedArrays(nums1, nums2);
        Assertions.assertEquals(res, 5);
    }
}
