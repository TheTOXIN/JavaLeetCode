package org.example.tasks_1;

public class Task7 {

    // Integer.reverse(x) Hmm?
    public int reverse(int x) {
        int res = 0;

        int len = (int) (Math.log10(Math.abs(x)) + 1);

        try {
            for (int i = 0; i < len; i++) {
                int val = (int) (x / Math.pow(10, i)) % 10;
                res = Math.multiplyExact(res, 10) + val;
            }
        } catch (ArithmeticException ex) {
            return 0;
        }

        return res;
    }

    public int reverseNew(int x) {
        int res = 0;

        try {
            while (x != 0) {
                int val = x % 10;
                x = x / 10;
                res = Math.multiplyExact(res, 10) + val;
            }
        } catch (ArithmeticException ex) {
            return 0;
        }

        return res;
    }
}
