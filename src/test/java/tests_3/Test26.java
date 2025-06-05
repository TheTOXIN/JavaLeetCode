package tests_3;

import org.example.tasks_03.Task26;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Тестирующая система проверит ваше решение с помощью следующего кода:
 * <p>
 * int[] nums = [...]; // входной массив
 * int[] expectedNums = [...]; // ожидаемый ответ с корректной длиной
 * <p>
 * int k = removeDuplicates(nums); // вызов функции с вашим решением
 * <p>
 * assert k == expectedNums.length;
 * for (int i = 0; i < k; i++) {
 * assert nums[i] == expectedNums[i];
 * }
 * Если все тесты пройдут, ваше решение будет принято.
 */
public class Test26 {

    Task26 task = Mockito.spy(Task26.class);

    /**
     * Ввод: nums = [1,1,2]
     * Вывод: 2, nums = [1,2,_]
     * Пояснение: Ваша функция должна вернуть k = 2,
     * причем первые два элемента в nums это 1 и 2,
     * в том же порядке, что и в изначальном nums.
     * Не имеет значения, что будет идти после k элементов
     * (для примера они равны нижнему подчеркиванию).
     */
    @Test
    public void test_1() {
        int[] nums = new int[]{1, 1, 2};
        int[] expectedNums = new int[]{1, 2};
        int res = task.removeDuplicates(nums);
        Assertions.assertEquals(2, res);
        for (int i = 0; i < res; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    /**
     * Ввод: nums = [0,0,1,1,1,2,2,3,3,4]
     * Вывод: 5, nums = [0,1,2,3,4,_,_,_,_,_]
     * Пояснение: Ваша функция должна вернуть k = 5,
     * причем первые два элемента в nums это 0, 1, 2, 3 и 4,
     * в том же порядке, что и в изначальном nums.
     * Не имеет значения, что будет идти после k элементов
     * (для примера они равны нижнему подчеркиванию).
     */
    @Test
    public void test_2() {
        int[] nums = new int[]{0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = new int[]{0, 1, 2, 3, 4};
        int res = task.removeDuplicates(nums);
        Assertions.assertEquals(expectedNums.length, res);
        for (int i = 0; i < res; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    public void test_3() {
        int[] nums = new int[]{-3, -1, 0, 0, 0, 3, 3};
        int[] expectedNums = new int[]{-3, -1, 0, 3};
        int res = task.removeDuplicates(nums);
        Assertions.assertEquals(expectedNums.length, res);
        for (int i = 0; i < res; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
