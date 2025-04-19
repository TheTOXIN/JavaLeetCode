import org.example.Task10;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Test10 {

    Task10 task = Mockito.spy(Task10.class);

    @Test
    public void test_1() {
        String s = "aa";
        String p = "a";

//        String template = task.template(s, p);
//        Assertions.assertEquals("a", template);

        boolean match = task.isMatch(s, p);
        Assertions.assertFalse(match);
    }

    @Test
    public void test_1_1() {
        String s = "aa";
        String p = "a*";

//        String template = task.template(s, p);
//        Assertions.assertEquals("a", template);

        boolean match = task.isMatch(s, p);
        Assertions.assertTrue(match);
    }

    @Test
    public void test_1_2() {
        String s = "aab";
        String p = "c*a*b";

//        String template = task.template(s, p);
//        Assertions.assertEquals("a", template);

        boolean match = task.isMatch(s, p);
        Assertions.assertTrue(match);
    }

    @Test
    public void test_2() {
        String s = "aaa";
        String p = "a*";

//        String template = task.template(s, p);
//        Assertions.assertEquals("aaa", template);

        boolean match = task.isMatch(s, p);
        Assertions.assertTrue(match);
    }

    @Test
    public void test_2_1() {
        String s = "aaab";
        String p = "a*b";

//        String template = task.template(s, p);
//        Assertions.assertEquals("aaab", template);

        boolean match = task.isMatch(s, p);
        Assertions.assertTrue(match);
    }

    @Test
    public void test_2_2() {
        String s = "aaaab";
        String p = "aa*b";

//        String template = task.template(s, p);
//        Assertions.assertEquals("aaaab", template);

        boolean match = task.isMatch(s, p);
        Assertions.assertTrue(match);
    }

    @Test
    public void test_3() {
        String s = "ab";
        String p = ".*";

//        String template = task.template(s, p);
//        Assertions.assertEquals("..", template);

        boolean match = task.isMatch(s, p);
        Assertions.assertTrue(match);
    }

    @Test
    public void test_4() {
        String s = "a123c";
        String p = "a.*c";

//        String template = task.template(s, p);
//        Assertions.assertEquals("a...c", template);

        boolean match = task.isMatch(s, p);
        Assertions.assertTrue(match);
    }

    @Test
    public void test_5() {
        String s = "ac";
        String p = "a.*c";

//        String template = task.template(s, p);
//        Assertions.assertEquals("ac", template);

        boolean match = task.isMatch(s, p);
        Assertions.assertTrue(match);
    }

    @Test
    public void test_6() {
        String s = "ab";
        String p = ".b*";

//        String template = task.template(s, p);
//        Assertions.assertEquals(".b", template);

        boolean match = task.isMatch(s, p);
        Assertions.assertTrue(match);
    }

    @Test
    public void test_6_2() {
        String s = "ab";
        String p = "..*";

//        String template = task.template(s, p);
//        Assertions.assertEquals(".b", template);

        boolean match = task.isMatch(s, p);
        Assertions.assertTrue(match);
    }

    @Test
    public void test_7() {
        String s = "abc";
        String p = ".b*";

//        String template = task.template(s, p);
//        Assertions.assertEquals(".bb", template);

        boolean match = task.isMatch(s, p);
        Assertions.assertFalse(match);
    }

    @Test
    public void test_8() {
        String s = "aa";
        String p = ".";

//        String template = task.template(s, p);
//        Assertions.assertEquals(".", template);

        boolean match = task.isMatch(s, p);
        Assertions.assertFalse(match);
    }

    @Test
    public void test_9() {
        String s = "a";
        String p = ".*abs..qwe*.q*.*";

//        String template = task.template(s, p);
//        Assertions.assertEquals("?", template);

        boolean match = task.isMatch(s, p);
        Assertions.assertFalse(match);
    }

    @Test
    public void test_10() {
        String s = "aaaabcd";
        String p = ".*abc.";

//        String template = task.template(s, p);
//        Assertions.assertEquals("...abc.", template);

        boolean match = task.isMatch(s, p);
        Assertions.assertTrue(match);
    }

    @Test
    public void test_10_2() {
        String s = "aaaabc";
        String p = "a*abc";

//        String template = task.template(s, p);
//        Assertions.assertEquals("aaaabc", template);

        boolean match = task.isMatch(s, p);
        Assertions.assertTrue(match);
    }

    @Test
    public void test_10_3() {
        String s = "aaaabc";
        String p = ".aa*abc";

//        String template = task.template(s, p);
//        Assertions.assertEquals("aaaabc", template);

        boolean match = task.isMatch(s, p);
        Assertions.assertTrue(match);
    }

    @Test
    public void test_11() {
        String s = "xabc";
        String p = "..*abc";

//        String template = task.template(s, p);
//        Assertions.assertEquals(".abc", template);

        boolean match = task.isMatch(s, p);
        Assertions.assertTrue(match);
    }

    @Test
    public void test_12() {
        String s = "mississippi";
        String p = "mis*is*ip*.";

        boolean match = task.isMatch(s, p);
        Assertions.assertTrue(match);
    }

    @Test
    public void test_13() {
        String s = "aaa";
        String p = "aaaa";

        boolean match = task.isMatch(s, p);
        Assertions.assertFalse(match);
    }

    @Test
    public void test_14() {
        String s = "aaa";
        String p = "a*a";

        boolean match = task.isMatch(s, p);
        Assertions.assertTrue(match);
    }

    @Test
    public void test_15() {
        String s = "aaa";
        String p = "ab*a*c*a";

        boolean match = task.isMatch(s, p);
        Assertions.assertTrue(match);
    }
}
