package org.example.tasks_1;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Task10 {

    public boolean isMatchDP(String s, String p) {
        return matchHelper(s, p, 0, 0, new Boolean[s.length() + 1][p.length() + 1]);
    }

    private boolean matchHelper(String s, String p, int i, int j, Boolean[][] memo) {
        if (memo[i][j] != null) return memo[i][j];

        if (j == p.length()) {
            memo[i][j] = i == s.length();
            return memo[i][j];
        }

        boolean firstMatch = (i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'));

        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
            memo[i][j] = (matchHelper(s, p, i, j + 2, memo) || (firstMatch && matchHelper(s, p, i + 1, j, memo)));
        } else {
            memo[i][j] = firstMatch && matchHelper(s, p, i + 1, j + 1, memo);
        }

        return memo[i][j];
    }

    public boolean isMatch(String s, String p) {
        Stack<int[]> stack = new Stack<>();
        Set<Long> visited = new HashSet<>();

        int m = s.length();
        int n = p.length();

        int[] start = {0, 0};
        stack.push(start);

        while (!stack.empty()) {
            int[] pos = stack.pop();

            int i = pos[0];
            int j = pos[1];

            long pair = concatenate(i, j);

            if (visited.contains(pair)) {
                continue;
            } else {
                visited.add(pair);
            }

            if (j >= n) {
                if (i >= m) {
                    return true;
                }
                continue;
            }

            boolean match = i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');

            if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
                if (j + 2 <= p.length()) {
                    stack.push(new int[]{i, j + 2});
                }
                if (match && i + 1 <= s.length()) {
                    stack.push(new int[]{i + 1, j});
                }
            } else if (match && i + 1 <= s.length() && j + 1 <= p.length()) {
                stack.push(new int[]{i + 1, j + 1});
            }
        }

        return false;
    }

    public static long concatenate(int i, int j) {
        // Вычисляем количество цифр в j
        int count = j == 0 ? 1 : (int) Math.floor(Math.log10(j)) + 1;
        // Формула: i * 10^d(j) + j
        return (long) i * (long) Math.pow(10, count) + j;
    }

//    public boolean isMatch(String s, String p) {
//        if (p.isEmpty() || s.isEmpty() || p.charAt(0) == '*') return false;
//
//        int i = 0, j = 0;
//
//        StringBuilder sub = new StringBuilder();
//
//        while (i < p.length() && j < s.length()) {
//            if (!sub.isEmpty()) {
//                int res = s.indexOf(sub.toString(), j);
//                if (res == -1) return false;
//                j = res + sub.length();
//                sub = new StringBuilder();
//            }
//
//            if (i + 1 < p.length() && p.charAt(i + 1) == '*') {
//                if ((i + 1 == p.length() - 1) || (i + 1 == p.length() - 2 && i + 2 == p.length() - 1 && p.charAt(i + 2) == '.')) {
//                    while (j < s.length() && (s.charAt(j) == p.charAt(i) || p.charAt(i) == '.')) j++;
//                    i += 2;
//                } else {
//                    i += 2;
//                }
//
//                if (i == p.length() - 1 && j <= i) {
//                    j += 2;
//                }
//            } else if (p.charAt(i) == '.') {
//                i++;
//                j++;
//            } else {
//                while (i < p.length() && p.charAt(i) != '.' && (i + 1 >= p.length() || p.charAt(i + 1) != '*')) {
//                    sub.append(p.charAt(i));
//                    i++;
//                }
//            }
//        }
//
//        if (!sub.isEmpty()) {
//            int res = s.indexOf(sub.toString(), j);
//            if (res == -1) return false;
//            j = res + sub.length();
//        }
//
//        return i == p.length() && j == s.length();
//    }

//    public String template(String s, String p) {
//        String template = "";
//
//        for (int i = 0; i < p.length(); i++) {
//            char c = p.charAt(i);
//
//            if (i + 1 < p.length() && p.charAt(i + 1) == '*') {
//                int n = 0;
//
//                if (i + 2 >= p.length()) {
//                    n = s.length() - template.length();
//                } else {
//                    char end = p.charAt(i + 2);
//                    int j = template.length();
//
////                    while (j < s.length() && (s.charAt(j) == c || c == '.') && s.charAt(j) != end) {
////                        n++;
////                        j++;
////                    }
//
//                    while (j <= s.length() && s.charAt(j) != end) {
//                        j++;
//                        n++;
//                    }
//                }
//
//                for (int j = 0; j < n; j++) template += c;
//
//                i++;
//            } else if (c == '.') {
//                template += c;
//            } else {
//                template += c;
//            }
//        }
//
//        return template;
//    }


//    public boolean isMatch(String s, String p) {
//        if (p.isEmpty() || s.isEmpty() || p.charAt(0) == '*') return false;
//
//        List<String> regxParts = new ArrayList<>();
//
//        for (int i = 0; i < p.length(); i++) {
//            char c = p.charAt(i);
//
//            if (i + 1 < p.length() && p.charAt(i + 1) == '*') {
//                regxParts.add(c + "*");
//                i++;
//                continue;
//            }
//
//            if (c == '.') {
//                regxParts.add(c + "");
//                continue;
//            }
//
//            StringBuilder str = new StringBuilder();
//            while (i < p.length() && p.charAt(i) != '.' && (i + 1 >= p.length() || p.charAt(i + 1) != '*')) {
//                str.append(p.charAt(i));
//                i++;
//            }
//            i--;
//            regxParts.add(str.toString());
//        }
//        System.out.println(regxParts);
//
//        boolean match = true;
//
//        for (int i = 0; i < regxParts.size(); i++) {
//            String regx = regxParts.get(i);
//
//            int j = 0;
//
//            if (regx.length() > 1 && regx.charAt(j + 1) == '*') {
//
//            } else if (regx.length() == 1 && regx.charAt(j) == '.') {
//                j++;
//            } else {
//
//                while (true) {
//
//                }
//
//            }
//        }
//
//        return match;
//    }

//    public boolean isMatch(String s, String p) {
//        if (p.isEmpty() || s.isEmpty() || p.charAt(0) == '*') return false;
//
//        List<String> regxParts = new ArrayList<>();
//
//        boolean match = true;
//
//        for (int i = 0; i < p.length(); i++) {
//            char c = p.charAt(i);
//
//            if (i + 1 < p.length() && p.charAt(i + 1) == '*') {
//                regxParts.add(c + "*");
//                i++;
//                continue;
//            }
//
//            if (c == '.') {
//                regxParts.add(c + "");
//                continue;
//            }
//
//            StringBuilder str = new StringBuilder();
//            while (i < p.length() && p.charAt(i) != '.' && (i + 1 >= p.length() || p.charAt(i + 1) != '*')) {
//                str.append(p.charAt(i));
//                i++;
//            }
//            i--;
//            regxParts.add(str.toString());
//        }
//        System.out.println(regxParts);
//
//        return match;
//    }
}
