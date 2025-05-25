package org.example;

public class Task28 {

    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        if (hLen < nLen) return -1;

        for (int i = 0; i <= hLen - nLen; i++) {
            int n = 0;

            while (n < nLen && haystack.charAt(i + n) == needle.charAt(n)) n++;

            if (n == nLen) return i;
        }

        return -1;
    }

    public int strStrOld(String haystack, String needle) {
        if (haystack.length() < needle.length()) return -1;

        int n = 0;

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(n)) {
                n++;
                for (int j = i + 1; j < haystack.length(); j++) {
                    if (n < needle.length() && haystack.charAt(j) == needle.charAt(n)) {
                        n++;
                    } else {
                        break;
                    }
                }
                if (n == needle.length()) {
                    return i;
                } else {
                    n = 0;
                }
            }
        }

        return -1;
    }

    public int strStrIndex(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
