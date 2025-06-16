package org.example.tasks_2;

public class Task12 {

    public String intToRomanNew(int num) {
        int[] n = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] s = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int i = 0;
        StringBuilder str = new StringBuilder();

        while (num > 0) {
            if (num >= n[i]) {
                num -= n[i];
                str.append(s[i]);
            } else {
                i++;
            }
        }

        return str.toString();
    }

    public String intToRoman(int num) {
        StringBuilder res = new StringBuilder();

        char[] symbols = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int len = (int) Math.log10(num) + 1;

        for (int i = 0; i < len; i++) {
            int n = num % 10;
            StringBuilder val = new StringBuilder();

            if (n < 4) {
                while (n-- != 0) val.append(symbols[i * 2]);
            } else if (n == 4) {
                val.append(symbols[i * 2]);
                val.append(symbols[i * 2 + 1]);
            } else if (n == 5) {
                val.append(symbols[i * 2 + 1]);
            } else if (n == 9) {
                val.append(symbols[i * 2]);
                val.append(symbols[i * 2 + 2]);
            } else {
                val.append(symbols[i * 2 + 1]);
                while (n-- != 5) val.append(symbols[i * 2]);
            }

            num = num / 10;
            res.insert(0, val);
        }

        return res.toString();
    }
}
