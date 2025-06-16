package org.example.tasks_2;

import java.util.Stack;

/**
 * Дана строка s, содержащая символы '(', ')', '{', '}', '[' и ']',
 * определите, является ли строка валидной.
 * <p>
 * Входная строка валидна, если:
 * <p>
 * Открывающая скобка закрыта скобкой того же типа.
 * Открывающие скобки закрыты в правильном порядке.
 * Каждой закрывающей скобке соответствует открывающая скобка того же типа.
 */
public class Task20 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        int n = s.length();
        if (n % 2 != 0) return false;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;

                Character popped = stack.pop();
                if (!(popped == '(' && c == ')' || popped == '{' && c == '}' || popped == '[' && c == ']')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public boolean isValidOld(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                if (c == ')' || c == '}' || c == ']') {
                    Character peeked = stack.peek();
                    if (peeked == '(' && c != ')' || peeked == '{' && c != '}' || peeked == '[' && c != ']') {
                        stack.push(c);
                    } else if (peeked == ')' || peeked == '}' || peeked == ']') {
                        return false;
                    } else {
                        stack.pop();
                    }
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
