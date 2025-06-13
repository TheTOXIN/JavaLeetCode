import org.example.Task36;
import org.example.Task37;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

public class Test37 {

    Task37 task = Mockito.spy(Task37.class);
    Task36 check = Mockito.spy(Task36.class);

    @Test
    public void test_1() {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        task.solveSudoku(board);
        Assertions.assertTrue(check.isValidSudoku(board));

        Arrays.stream(board).forEach(row ->
                System.out.println(Arrays.toString(row)));
    }
}
