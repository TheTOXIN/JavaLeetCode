package org.example.tasks_03;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Дан массив целочисленных значений nums, отсортированный в неубывающем порядке,
 * удалите дубликаты на месте так, чтобы каждый уникальный элемент появлялся только один раз.
 * Порядок элементов должен оставаться тем же. Верните количество уникальных элементов в nums.
 * <p>
 * Предположим, что k - это количество уникальных элементов в nums.
 * Чтобы решение прошло все тесты, нужно выполнить следующие действия:
 * <p>
 * Изменить массив nums так, чтобы первые k элементов nums содержали
 * уникальные элементы в том же порядке, в каком они были изначально в массиве nums.
 * Вернуть значение k.
 */
public class Task26 {

    public int removeDuplicates(int[] nums) {
        int k = 0, len = nums.length;

        for (int i = 0; i < len; i++) {
            if (i == len - 1 || nums[i] != nums[i  + 1]) {
                nums[k++] = nums[i];
            }
        }

        return k;
    }

    public int removeDuplicatesOld(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int k = set.size();

        Iterator<Integer> iterator = set.iterator();

        for (int i = 0; i < k; i++) {
            nums[i] = iterator.next();
        }

        return k;
    }
}
