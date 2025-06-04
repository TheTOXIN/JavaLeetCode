import org.example.Task35;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test35 {

    Task35 task = Mockito.spy(Task35.class);

    public int searchInsert(int[] nums, int target) {
        return task.searchInsert(nums, target);
    }

    @Test
    public void test_1() {
        // Пример 1: nums = [1,3,5,6], target = 5, ожидаемый результат = 2
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int expected = 2;

        int result = searchInsert(nums, target);

        assertEquals(expected, result,
                "Для массива [1,3,5,6] и target=5 должна вернуться позиция 2");
    }

    @Test
    public void test_2() {
        // Пример 2: nums = [1,3,5,6], target = 2, ожидаемый результат = 1
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int expected = 1;

        int result = searchInsert(nums, target);

        assertEquals(expected, result,
                "Для массива [1,3,5,6] и target=2 должна вернуться позиция 1");
    }

    @Test
    public void test_3() {
        // Пример 3: nums = [1,3,5,6], target = 7, ожидаемый результат = 4
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int expected = 4;

        int result = searchInsert(nums, target);

        assertEquals(expected, result,
                "Для массива [1,3,5,6] и target=7 должна вернуться позиция 4");
    }

    @Test
    public void test_4() {
        // Дополнительный тест: target меньше первого элемента
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        int expected = 0;

        int result = searchInsert(nums, target);

        assertEquals(expected, result,
                "Для target меньше первого элемента должна вернуться позиция 0");
    }

    @Test
    public void test_5() {
        // Тест с массивом из одного элемента, target существует
        int[] nums = {1};
        int target = 1;
        int expected = 0;

        int result = searchInsert(nums, target);

        assertEquals(expected, result,
                "Для массива [1] и target=1 должна вернуться позиция 0");
    }

    @Test
    public void test_6() {
        // Тест с массивом из одного элемента, target больше
        int[] nums = {1};
        int target = 2;
        int expected = 1;

        int result = searchInsert(nums, target);

        assertEquals(expected, result,
                "Для массива [1] и target=2 должна вернуться позиция 1");
    }

    @Test
    public void test_7() {
        // Тест с массивом из одного элемента, target меньше
        int[] nums = {1};
        int target = 0;
        int expected = 0;

        int result = searchInsert(nums, target);

        assertEquals(expected, result,
                "Для массива [1] и target=0 должна вернуться позиция 0");
    }

    @Test
    void test_8() {
        int[] nums = {1, 3};
        int target = 0;
        int expected = 0;

        int result = searchInsert(nums, target);

        assertEquals(expected, result);
    }

    @Test
    void test_9() {
        int[] nums = {1, 3};
        int target = 2;
        int expected = 1;

        int result = searchInsert(nums, target);

        assertEquals(expected, result);
    }

    @Test
    void test_10() {
        int[] nums = {3, 5, 7, 9, 10};
        int target = 8;
        int expected = 3;

        int result = searchInsert(nums, target);

        assertEquals(expected, result);
    }
}
