package org.example;

public class Task37 {

    public void solveSudoku(char[][] board) {
        solver(board, 0, 0);
    }

    public boolean solver(char[][] board, int i, int j) {
        for (; i < 9; i++) {
            for (; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        boolean valid = valid(board, i, j, c);
                        if (valid) {
                            board[i][j] = c;
                            boolean solve = solver(board, i, j);
                            if (solve) return true;
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
            j = 0;
        }
        return true;
    }

    public boolean valid(char[][] board, int i, int j, char c) {
        for (int k = 0; k < 9; k++) {
            if (board[i][k] == c) return false;
            if (board[k][j] == c) return false;
        }

        int sRow = i / 3 * 3;
        int sCol = j / 3 * 3;

        for (int k = sRow; k < sRow + 3; k++) {
            for (int l = sCol; l < sCol + 3; l++) {
                if (board[k][l] == c) return false;
            }
        }

        return true;
    }
}
