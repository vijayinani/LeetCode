package leetcode_1_to_50;

import java.util.HashSet;
import java.util.Set;

public class _36_ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> row = new HashSet<>();
            Set<Character> column = new HashSet<>();
            Set<Character> block = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !row.add(board[i][j])) {
                    return false;
                }
                if (board[j][i] != '.' && !column.add(board[j][i])) {
                    return false;
                }
                int rowIndex = 3 * (i / 3);
                int columnIndex = 3 * (i % 3);
                if (board[rowIndex + j / 3][columnIndex + j % 3] != '.' && !block.add(board[rowIndex + j / 3][columnIndex + j % 3])) {
                    return false;
                }
            }
        }
        return true;
    }
}
