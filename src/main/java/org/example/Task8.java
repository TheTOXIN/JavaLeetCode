package org.example;

public class Task8 {

    public int myAtoi(String s) {
        s = s.trim();

        if (s.isEmpty()) return 0;

        long res = 0;
        int sign = 1;
        char c;

        boolean stop = false;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);

            if (c == '-') {
                if (stop) break;
                stop = true;
                sign = -1;
            } else if (c == '+') {
                if (stop) break;
                stop = true;
            } else if (c >= '0' && c <= '9') {
                res = res * 10 + (c - '0');
                if (res * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (sign * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
                stop = true;
            } else {
                break;
            }
        }

        return (int) res * sign;
    }
}

