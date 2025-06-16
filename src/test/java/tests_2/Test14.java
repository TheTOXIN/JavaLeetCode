package tests_2;

import org.example.tasks_2.Task14;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Test14 {

    Task14 task = Mockito.spy(Task14.class);

    private static long time;

    @BeforeAll
    public static void before() {
        time = System.nanoTime();
    }

    @AfterAll
    public static void after() {
        System.out.println("TIME: " + (System.nanoTime() - time));
    }

    @Test
    public void test_0() {
        for (int i = 0; i < 10000; i++) {
            String res1 = task.longestCommonPrefix(new String[] {
                    "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc",
                    "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabx",
                    "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabd",
                    "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabd",
                    "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabg",
            });
            Assertions.assertEquals("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcab", res1);
        }
    }

    @Test
    public void test_1() {
        String res = task.longestCommonPrefix(new String[] {
                "flower", "flow", "flight"
        });
        Assertions.assertEquals("fl", res);
    }

    @Test
    public void test_2() {
        String res = task.longestCommonPrefix(new String[] {
                "dog", "dog", "dog"
        });
        Assertions.assertEquals("dog", res);
    }

    @Test
    public void test_3() {
        String res = task.longestCommonPrefix(new String[] {});
        Assertions.assertEquals("", res);
    }

    @Test
    public void test_4() {
        String res = task.longestCommonPrefix(new String[] {
                "test"
        });
        Assertions.assertEquals("test", res);
    }

    @Test
    public void test_5() {
        String res = task.longestCommonPrefix(new String[] {
                "dog", "cat", "bird"
        });
        Assertions.assertEquals("", res);
    }

    @Test
    public void test_6() {
        String res = task.longestCommonPrefix(new String[] {
                "", "flower", "flight"
        });
        Assertions.assertEquals("", res);
    }

    @Test
    public void test_7() {
        String res = task.longestCommonPrefix(new String[] {
                "", "", ""
        });
        Assertions.assertEquals("", res);
    }

    @Test
    public void test_8() {
        String res = task.longestCommonPrefix(new String[] {
                "abcdefghij", "abcdefg", "abcdef"
        });
        Assertions.assertEquals("abcdef", res);
    }

    @Test
    public void test_9() {
        String res = task.longestCommonPrefix(new String[] {
                "", "", ""
        });
        Assertions.assertEquals("", res);
    }

    @Test
    public void test_10() {
        String res = task.longestCommonPrefix(new String[] {
                "a", "a", "a"
        });
        Assertions.assertEquals("a", res);
    }

    @Test
    public void test_11() {
        String res = task.longestCommonPrefix(new String[] {
                "abc", "abd", "abe"
        });
        Assertions.assertEquals("ab", res);
    }

    @Test
    public void test_12() {
        String res = task.longestCommonPrefix(new String[] {
                "abc", "abd", "abe", "abb", "abcd"
        });
        Assertions.assertEquals("ab", res);
    }

    @Test
    public void test_13() {
        String res = task.longestCommonPrefix(new String[] {
                "abc", "cbd", "cdd", "cbb", "abcd"
        });
        Assertions.assertEquals("", res);
    }
}
