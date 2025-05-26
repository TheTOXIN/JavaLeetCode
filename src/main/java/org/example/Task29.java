package org.example;

public class Task29 {

    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (divisor == dividend) return 1;
        if (divisor == 1) return dividend;

        long dividendL = Math.abs((long) dividend);
        long divisorL = Math.abs((long) divisor);

        boolean negative = (dividend < 0) ^ (divisor < 0);

        if (dividendL == divisorL) return negative ? -1 : 1;

        long n = 0;

        while (divisorL <= dividendL) {
            int pow = 0;
            while (dividendL >= (divisorL << (pow + 1))) pow++;
            dividendL -= divisorL << pow;
            n += 1L << pow;
        }

        return (int) (negative ? -n : n);
    }
}
