package org.example.tasks_03;

import java.util.ArrayList;
import java.util.List;

/**
 * Дано целое число n, которое представляет собой количество пар скобок.
 * Напишите функцию, которая генерирует все комбинации правильных скобочных последовательностей.
 */
public class Task22 {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();

        if (n <= 0) return res;

        func(res, 0, 0, n, "");

        return res;
    }

    private void func(List<String> res, int open, int close, int n, String s) {
        if (open == close && open + close == n * 2) {
            res.add(s);
            return;
        }

        if (open < n) {
            func(res, open + 1, close, n, s + "(");
        }

        if (close < open) {
            func(res, open, close + 1, n, s + ")");
        }
    }
}
