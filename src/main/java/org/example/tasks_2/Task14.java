package org.example.tasks_2;

public class Task14 {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();

        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        boolean f = true;
        int i = 0;

        while (f) {
            if (strs[0].length() == i) break;
            char c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() == i || strs[j].charAt(i) != c) {
                    f = false;
                    break;
                }
            }

            if (f) {
                res.append(c);
                i++;
            }
        }

        return res.toString();
    }

    public String longestCommonPrefixOld(String[] strs) {
        if (strs.length == 1) return strs[0];
        if (strs.length == 0) return "";

        int lw = 0;
        int rw = strs.length - 1;

        String prev = null;
        String next;

        while (lw <= rw) {
            next = sub(strs[lw], strs[rw]);
            prev = sub(prev, next);

            if (prev.isEmpty()) return "";

            lw++;
            rw--;
        }

        return prev;
    }

    public String sub(String left, String right) {
        StringBuilder builder = new StringBuilder();

        if (left == null) return right;

        int i = 0;
        while (i < left.length() && i < right.length()) {
            char lc = left.charAt(i);
            char rc = right.charAt(i);

            if (lc == rc) {
                builder.append(lc);
            } else {
                break;
            }

            i++;
        }

        return builder.toString();
    }
}
