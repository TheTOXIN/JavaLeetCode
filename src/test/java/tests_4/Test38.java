package tests_4;

import org.example.tasks_4.Task38;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Test38 {

    Task38 task = Mockito.spy(Task38.class);

    @Test
    public void test_1() {
        String actual = task.countAndSay(4);
        Assertions.assertEquals("1211", actual);
    }

    @Test
    public void test_2() {
        String actual = task.countAndSay(1);
        Assertions.assertEquals("1", actual);
    }
}
