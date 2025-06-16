package org.example.tasks_2;

import java.util.HashMap;
import java.util.Map;

public class Task13 {

    public int romanToInt(String s) {
        int result = 0;
        Map <Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanMap.get(currentChar);

            if (i < s.length() - 1 && currentValue < romanMap.get(s.charAt(i + 1))) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }

        return result;
    }

    public int romanToIntOld(String s) {
        int res = 0;

        Map<String, Integer> map = new HashMap<>() {{
            put("M", 1000);
            put("CM", 900);
            put("D", 500);
            put("CD", 400);
            put("C", 100);
            put("XC", 90);
            put("L", 50);
            put("XL", 40);
            put("X", 10);
            put("IX", 9);
            put("V", 5);
            put("IV", 4);
            put("I", 1);
        }};

        int i = 0;
        int length = s.length();

        while (i < length) {
            String str;

            if (i != length - 1) {
                Integer doubleNum = map.get( s.substring(i, i + 2));
                if (doubleNum != null) {
                    res += doubleNum;
                    i += 2;
                    continue;
                }
            }

            str = s.substring(i, i + 1);
            res += map.get(str);
            i++;
        }

        return res;
    }
}
