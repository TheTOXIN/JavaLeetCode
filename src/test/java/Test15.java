import org.example.Task15;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test15 {

    Task15 task = Mockito.spy(Task15.class);

    @Test
    public void test_0() {
        long l = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            test_1();
        }
        System.out.println(System.currentTimeMillis() - l);
    }

    @Test
    public void test_1() {
        List<List<Integer>> res = task.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        assertTest(res, List.of(
                List.of(-1, -1, 2),
                List.of(-1, 0, 1)
        ));
    }

    @Test
    public void test_1_1() {
        List<List<Integer>> res = task.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(res);
        assertTest(res, List.of(
                List.of(1, 0, -1),
                List.of(-1, 2, -1)
        ));
    }

    @Test
    public void test_2() {
        List<List<Integer>> res = task.threeSum(new int[]{0, 1, 1});
        assertTest(res, List.of());
    }

    @Test
    public void test_3() {
        List<List<Integer>> res = task.threeSum(new int[]{0, 0, 0});
        assertTest(res, List.of(
                List.of(0, 0, 0)
        ));
    }

    @Test
    public void test_4() {
        List<List<Integer>> res = task.threeSum(new int[]{
                2, -3, 0, -2, -5, -5, -4, 1, 2, -2, 2, 0, 2, -4, 5, 5, -10
        });
        //[-10, -5, -5, -4, -4, -3, -2, -2, 0, 0, 1, 2, 2, 2, 2, 5, 5]
        assertTest(res, List.of(
                List.of(-10, 5, 5),
                List.of(-5, 0, 5),
                List.of(-4, 2, 2),
                List.of(-3, -2, 5),
                List.of(-2, 0, 2),
                List.of(-3, 1, 2)
        ));
    }

    private void assertTest(List<List<Integer>> res, List<List<Integer>> test) {
        Assertions.assertEquals(res.size(), test.size());

        int counter = 0;

        for (int i = 0; i < res.size(); i++) {

            for (int j = 0; j < test.size(); j++) {
                List<Integer> r = new ArrayList<>(res.get(i));
                List<Integer> t = new ArrayList<>(test.get(j));

                Assertions.assertEquals(r.size(), t.size());

                Collections.sort(r);
                Collections.sort(t);

                boolean f = true;

                for (int k = 0; k < r.size(); k++) {
                    f = r.get(k).equals(t.get(k));
                    if (!f) break;
                }

                if (f)  {
                    counter++;
                }
            }
        }

        Assertions.assertEquals(res.size(), counter);
    }
}
