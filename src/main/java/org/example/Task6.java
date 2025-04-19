package org.example;

public class Task6 {

    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder[] rows = new StringBuilder[numRows];

        int space = numRows - 2;
        int iter = (numRows - 1) * 2;
        int row, offset = 0;

        for (int i = 0; i < s.length(); i++) {
            if (offset > 0) {
                row = offset;
                offset--;
            } else {
                row = i % iter;
                if (row == numRows - 1) offset = space;
            }

            if (rows[row] == null) rows[row] = new StringBuilder();
            rows[row].append(s.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder r : rows) result.append(r);

        return result.toString();
    }
}
