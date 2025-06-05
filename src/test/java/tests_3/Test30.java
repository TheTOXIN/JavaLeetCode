package tests_3;

import org.example.tasks_03.Task30;
import org.example.utils.Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class Test30 {

    Task30 task = Mockito.spy(Task30.class);

    @Test
    public void test_1() {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        List<Integer> actual = task.findSubstring(s, words);
        List<Integer> expected = List.of(0, 9);
        Assertions.assertTrue(Util.compareToList(expected, actual));
    }

    @Test
    public void test_2() {
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word", "good", "best", "word"};
        List<Integer> actual = task.findSubstring(s, words);
        List<Integer> expected = List.of();
        Assertions.assertTrue(Util.compareToList(expected, actual));
    }

    @Test
    public void test_3() {
        String s = "barfoofoobarthefoobarman";
        String[] words = {"bar", "foo", "the"};
        List<Integer> actual = task.findSubstring(s, words);
        List<Integer> expected = List.of(6, 9, 12);
        Assertions.assertTrue(Util.compareToList(expected, actual));
    }

    @Test
    public void test_4() {
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word", "good", "best", "good"};
        List<Integer> actual = task.findSubstring(s, words);
        List<Integer> expected = List.of(8);
        Assertions.assertTrue(Util.compareToList(expected, actual));
    }

    @Test
    public void test_5() {
        String s = "ababababab";
        String[] words = {"ababa", "babab"};
        List<Integer> actual = task.findSubstring(s, words);
        List<Integer> expected = List.of(0);
        System.out.println(actual);
        Assertions.assertTrue(Util.compareToList(expected, actual));
    }

    @Test
    public void test_6() {
        String s = "aaaaaaaaaaaaaa";
        String[] words = {"aa", "aa"};
        List<Integer> actual = task.findSubstring(s, words);
        List<Integer> expected = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(actual);
        Assertions.assertTrue(Util.compareToList(expected, actual));
    }
}
