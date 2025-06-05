package org.example.tasks_01;

public class Task5 {

    int start = 0;
    int end = 0;

    public String longestPalindrome(String s) {
        char[] array = s.toCharArray();

        for (int i = 0; i < array.length; i++) {
            int l = i, r = i;

            while (r < array.length - 1 && array[r] == array[r + 1]) r++;
            i = r;

            while (l > 0 && r < array.length - 1 && array[l - 1] == array[r + 1]) {
                l--;
                r++;
            }

            if ((end - start) < (r - l)) {
                end = r;
                start = l;
            }
        }

        return s.substring(start, end + 1);
    }

    public String longestPalindromeOld(String s) {
        String res = String.valueOf(s.charAt(0));
        boolean finish = false;

        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = s.length() - 1; j > i; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    String str = s.substring(i, j + 1);
                    int l = i + 1, r = j - 1;
                    int size = 1;
                    while (l < r && s.charAt(l++) == s.charAt(r--)) size++;
                    if (size == str.length() / 2 && str.length() > res.length()) {
                        res = str;
                        if (size >= s.length() / 2) {
                            finish = true;
                            break;
                        }
                    }
                }
            }
            if (finish) break;
        }

        return res;
    }

//    public String palindrome(String s, int r, int l, int max) {
//        if (r == l || r - l == 1) {
//            return s.substring(r - max, l + max + 1);
//        }
//
//        if (s.charAt(r) == s.charAt(l)) {
//            return process(s, ++r, --l, ++max);
//        } else {
//            String res1 = process(s, r, --l, max);
//            String res2 = process(s, ++r, l, max);
//
//            if (res1.length() > res2.length()) {
//                return res1;
//            } else {
//                return res2;
//            }
//        }
//    }
}
