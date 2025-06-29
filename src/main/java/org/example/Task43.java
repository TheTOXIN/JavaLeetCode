package org.example;

public class Task43 {

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        int len1 = num1.length(), len2 = num2.length(), len = len1 + len2;
        int[] array = new int[len];

        for (int i = len2 - 1; i >= 0; i--) {
            int digit2 = num2.charAt(i) - '0';
            for (int j = len1 - 1; j >= 0; j--) {
                int digit1 = num1.charAt(j) - '0';

                int mul = digit1 * digit2;
                int sum = array[i + j + 1] + mul;

                array[i + j + 1] = sum % 10;
                array[i + j] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++) {
            if (!(sb.isEmpty() && array[i] == 0)) {
                sb.append(array[i]);
            }
        }

        return sb.toString();
    }
}
