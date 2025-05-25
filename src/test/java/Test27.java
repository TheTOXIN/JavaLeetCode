import org.example.Task27;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

/**
 * Тестирующая система проверит ваше решение с помощью следующего кода:
 * <p>
 * int[] nums = [...]; // входной массив
 * int val = ...; // значение val, которое нужно удалить
 * int[] expectedNums = [...]; // ожидаемый ответ с корректной длиной.
 * // этот массив отсортирован и не содержит элементов, равных val.
 * <p>
 * int k = removeElement(nums, val); // вызов функции с вашим решением
 * <p>
 * assert k == expectedNums.length;
 * sort(nums, 0, k); // сортировка первых k элементов в nums
 * for (int i = 0; i < actualLength; i++) {
 * assert nums[i] == expectedNums[i];
 * }
 * Если все тесты пройдут, ваше решение будет принято.
 */
public class Test27 {

    Task27 task = Mockito.spy(Task27.class);

    /**
     * Ввод: nums = [3,2,2,3], val = 3
     * Вывод: 2, nums = [2,2,_,_]
     * Пояснение: Ваша функция должна вернуть k = 2, причем первые два элемента в nums это 2 и 2.
     * Не имеет значения, что будет идти после k элементов (для примера они равны нижнему подчеркиванию).
     */
    @Test
    public void test_1() {
        int[] nums = {3, 2, 2, 3};
        int[] expectedNums = {2, 2};
        int k = task.removeElement(nums, 3);
        assert k == expectedNums.length;
        Arrays.sort(nums, 0, k);
        Arrays.sort(expectedNums, 0, k);
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    /**
     * Ввод: nums = [0,1,2,2,3,0,4,2], val = 2
     * Вывод: 5, nums = [0,1,4,0,3,_,_,_]
     * Пояснение: Ваша функция должна вернуть k = 5, причем первые пять элементов в nums это 0, 0, 1, 3 и 4.
     * Обратите внимание, что эти элементы можно вернуть в любом порядке.
     * Не имеет значения, что будет идти после k элементов (для примера они равны нижнему подчеркиванию).
     */
    @Test
    public void test_2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int[] expectedNums = {0, 1, 4, 0, 3};
        int k = task.removeElement(nums, 2);
        assert k == expectedNums.length;
        Arrays.sort(nums, 0, k);
        Arrays.sort(expectedNums, 0, k);
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
