import org.example.utils.Util;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test0 {

    @Test
    public void test() {
        for (int i = 0; i < 1000000; i++) {
            int[] nums1 = IntStream.range(0, (int) (Math.random() * 10))
                    .map(n -> (int) (Math.random() * 100))
                    .sorted()
                    .toArray();

            int[] nums2 = IntStream.range(0, (int) (Math.random() * 10))
                    .map(n -> (int) (Math.random() * 100))
                    .sorted()
                    .toArray();

            System.out.println(i);
            System.out.println(Arrays.toString(nums1));
            System.out.println(Arrays.toString(nums2));

            int[] merge = Util.merge(nums1, nums2);

            if (merge.length != (nums1.length + nums2.length)) {
                throw new RuntimeException("ERROR");
            }

            int val = Integer.MIN_VALUE;
            boolean res = false;
            for (int j : merge) {
                if (j < val) {
                    res = true;
                    break;
                }
                val = j;
            }

            System.out.println(Arrays.toString(merge));

            if (res) {
                throw new RuntimeException("ERROR");
            } else {
                System.out.println("OK");
            }
        }
    }
}
