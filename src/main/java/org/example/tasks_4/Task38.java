package org.example.tasks_4;

public class Task38 {

    public String countAndSay(int n) {
        return countAndSayHelper(n, 1, "1");
    }

    public String countAndSayHelper(int n, int i, String s) {
        if (n == i) return s;
        return countAndSayHelper(n, i + 1, counter(s));
    }

    public String counter(String s) {
        StringBuilder res = new StringBuilder();

        int counter = 1;

        for (int i = 1; i < s.length(); i++) {
            char c  = s.charAt(i - 1);

            if (s.charAt(i) == c) {
                counter++;
            } else {
                res.append(counter).append(c);
                counter = 1;
            }
        }

        res.append(counter).append(s.charAt(s.length() - 1));

        return res.toString();
    }
}
