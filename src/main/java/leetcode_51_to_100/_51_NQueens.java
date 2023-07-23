package leetcode_51_to_100;

import java.util.ArrayList;
import java.util.List;

public class _51_NQueens {
    public List<List<String>> solveNQueens(int n) {

        List<List<String>> result = new ArrayList<>();

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        backTrack(board, result, 0);

        return result;
    }

    private void backTrack(char[][] board, List<List<String>> result, int colIndex) {
        if (colIndex == board.length) {
            result.add(generateResult(board));
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (isValid(board, i, colIndex)) {
                board[i][colIndex] = 'Q';
                backTrack(board, result, i + 1);
                board[i][colIndex] = '.';
            }
        }
    }

    public boolean isValid(char board[][], int row, int col) {
        int dupRow = row;
        int dupCol = col;

        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') return false;
            row--;
            col--;
        }
        row = dupRow;
        col = dupCol;
        while (col >= 0) {
            if (board[row][col] == 'Q') return false;
            col--;
        }
        row = dupRow;
        col = dupCol;
        while (col >= 0 && row < board.length) {
            if (board[row][col] == 'Q') return false;
            col--;
            row++;
        }
        return true;
    }


    private List<String> generateResult(char[][] board) {
        List<String> currResult = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            currResult.add(s);
        }
        return currResult;
    }
}
