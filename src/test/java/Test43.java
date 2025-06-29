import org.example.Task43;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Test43 {

    Task43 task = Mockito.spy(Task43.class);

    @Test
    public void test_1() {
        String actual = task.multiply("2", "3");
        String expected = "6";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_2() {
        String actual = task.multiply("123", "456");
        String expected = "56088";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_3() {
        String actual = task.multiply("123", "45");
        String expected = "5535";

        Assertions.assertEquals(expected, actual);
    }
}
