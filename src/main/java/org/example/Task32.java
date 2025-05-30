package org.example;

import java.util.Stack;

public class Task32 {

    public int longestValidParentheses(String s) {
        int res = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();

                if (!stack.isEmpty()) {
                    res = Math.max(res, i - stack.peek());
                } else {
                    stack.push(i);
                }
            }
        }

        return res;
    }
}
