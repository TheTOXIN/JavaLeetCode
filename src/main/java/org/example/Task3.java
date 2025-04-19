package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task3 {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int res = 0;

        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            Integer index = map.get(c);

            if (index != null && index != -1) {
                map.forEach((k, v) -> {
                    if (v <= index) {
                        map.put(k, -1);
                    }
                });

                res = i - index;
            } else {
                res++;
            }

            map.put(c, i);
            max = Math.max(res, max);
        }

        return max;
    }

    public int lengthOfLongestSubstringNew(String s) {
        Set<Character> set = new HashSet<>();
        int left= 0, right = 0, max = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            if (!set.contains(c)) {
                set.add(c);
                max = Math.max(max, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return max;
    }
}
