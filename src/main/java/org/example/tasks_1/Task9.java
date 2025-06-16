package org.example.tasks_1;

public class Task9 {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int len = (int) Math.log10(x) + 1;

        for (int i = 0; i < len / 2; i++) {
            int r = (int) (x / Math.pow(10, i)) % 10;
            int l = (int) (x / Math.pow(10, len - i - 1)) % 10;

            if (l != r) return false;
        }

        return true;
    }

    public boolean isPalindromeNew(int x) {
        if (x < 0) return false;

        int rev = 0, dup = x;

        while (x != 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }

        return dup == rev;
    }
}
