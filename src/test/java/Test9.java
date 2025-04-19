import org.example.Task9;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Test9 {

    Task9 task = Mockito.spy(Task9.class);

    @Test
    public void test_1() {
        Assertions.assertEquals(true, task.isPalindrome(121));
    }

    @Test
    public void test_2() {
        Assertions.assertEquals(false, task.isPalindrome(-121));
    }

    @Test
    public void test_3() {
        Assertions.assertEquals(false, task.isPalindrome(10));
    }

    @Test
    public void test_4() {
        Assertions.assertEquals(true, task.isPalindrome(1234321));
    }
}
