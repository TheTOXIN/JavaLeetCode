package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 17. Буквенные комбинации по номеру телефона
 * <p>
 * Дана строка digits, содержащая цифры от 2 до 9 включительно,
 * верните все возможные буквенные комбинации,
 * которые может образовать данная строка.
 * Верните ответ в любом порядке.
 * Соответствие цифр буквам (как на кнопках телефона) приведено ниже.
 * Обратите внимание, что 1 не соответствует ни одной букве.
 */
public class Task17 {

    private final Map<Character, List<String>> map = Map.of(
            '2', List.of("a", "b", "c"),
            '3', List.of("d", "e", "f"),
            '4', List.of("g", "h", "i"),
            '5', List.of("j", "k", "l"),
            '6', List.of("m", "n", "o"),
            '7', List.of("p", "q", "r", "s"),
            '8', List.of("t", "u", "v"),
            '9', List.of("w", "x", "y", "z")
    );

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty())
            return new ArrayList<>();


        List<List<String>> combinations = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            combinations.add(map.get(digits.charAt(i)));
        }

        if (digits.length() == 1) {
            return map.get(digits.charAt(0));
        }

        return letterCombinationsHelper(
                combinations,
                combinations.getFirst(),
                1
        );
    }

    private List<String> letterCombinationsHelper(List<List<String>> combinations, List<String> result, int index) {
        if (index == combinations.size()) return result;

        List<String> combo = getCombo(result, combinations.get(index));

        return letterCombinationsHelper(combinations, combo, index + 1);
    }

    private List<String> getCombo(List<String> list1, List<String> list2) {
        List<String> res = new ArrayList<>();

        for (String s1 : list1) {
            for (String s2 : list2) {
                res.add(s1 + s2);
            }
        }

        return res;
    }
}
