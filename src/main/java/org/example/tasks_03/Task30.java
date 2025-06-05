package org.example.tasks_03;

import java.util.*;

/**
 * You are given a string s and an array of strings words.
 * All the strings of words are of the same length.
 * <p>
 * A concatenated string is a string that exactly contains all the strings
 * of any permutation of words concatenated.
 * <p>
 * For example, if words = ["ab","cd","ef"], then "abcdef", "abefcd", "cdabef", "cdefab", "efabcd",
 * and "efcdab" are all concatenated strings.
 * "acdbef" is not a concatenated string because it is not the concatenation
 * of any permutation of words.
 * Return an array of the starting indices of all the concatenated substrings in s.
 * You can return the answer in any order.
 */
public class Task30 {

    public List<Integer> findSubstringNew(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();

        if (words.length == 0 || s.isEmpty()) return ans;

        int wordLength = words[0].length();
        int wordCount = words.length;

        HashMap<String, Integer> originalCount = new HashMap<>();
        for (String word : words) {
            originalCount.merge(word, 1, Integer::sum);
        }

        for (int offset = 0; offset < wordLength; offset++) {
            HashMap<String, Integer> currentCount = new HashMap<>();

            int start = offset;
            int count = 0;

            for (int end = offset; end + wordLength <= s.length(); end += wordLength) {
                String currWord = s.substring(end, end + wordLength);

                if (originalCount.containsKey(currWord)) {

                    count++;
                    currentCount.merge(currWord, 1, Integer::sum);

                    while (currentCount.get(currWord) > originalCount.get(currWord)) {
                        String startWord = s.substring(start, start + wordLength);
                        currentCount.merge(startWord, 1, (a, b) -> a - b);

                        start += wordLength;
                        count--;
                    }

                    if (count == wordCount) {
                        ans.add(start);
                    }
                } else {
                    count = 0;
                    start = end + wordLength;
                    currentCount.clear();
                }
            }
        }

        return ans;
    }

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();

        int l = words[0].length();
        int c = words.length;

        Map<String, Integer> wordsCount = new HashMap<>();
        for (String word : words) {
            wordsCount.merge(word, 1, Integer::sum);
        }

        for (int i = 0; i <= s.length() - l * c; i++) {
            Map<String, Integer> mapCount = new HashMap<>();

            int j;
            for (j = 0; j < c; j++) {
                int start = i + j * l;
                String word = s.substring(start, start + l);

                Integer count = mapCount.merge(word, 1, Integer::sum);
                if (count > wordsCount.getOrDefault(word, 0)) break;
            }

            if (j == c) res.add(i);
        }

        return res;
    }

    public List<Integer> findSubstringOld(String s, String[] words) {
        List<String> wordList = Arrays.asList(words);
        Set<String> set = new HashSet<>(wordList);

        List<Integer> list = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();

        int l = words[0].length();

        for (int j = 0; j <= s.length() - l; j++) {
            String str = s.substring(j, j + l);
            if (set.contains(str)) {
                list.add(j);
                map.put(j, str);
                j += l - 1;
            }
        }

        List<Integer> res = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        int c = words.length;

        Map<String, Integer> mapCount = new HashMap<>();
        for (String word : wordList) {
            mapCount.merge(word, 1, Integer::sum);
        }

        for (int i = 0; i <= list.size() - c; i++) {
            for (int j = i; j < i + c; j++) {
                Integer index = list.get(j);
                String word = map.get(index);

                list2.add(word);
            }

            Map<String, Integer> mapCount2 = new HashMap<>();
            for (String word : list2) {
                mapCount2.merge(word, 1, Integer::sum);
            }

            if (mapCount.equals(mapCount2)) res.add(list.get(i));

            list2.clear();
        }

        return res;
    }
}
