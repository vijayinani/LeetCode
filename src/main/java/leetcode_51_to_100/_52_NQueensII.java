package leetcode_51_to_100;

public class _52_NQueensII {
    public static void main(String[] args) {
        System.out.println(new _52_NQueensII().totalNQueens(5));
    }

    public int totalNQueens(int n) {

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        return backTrack(board, 0);
    }

    private int backTrack(char[][] board, int colIndex) {
        if (colIndex == board.length) {
            return 1;
        }

        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (isValid(board, i, colIndex)) {
                board[i][colIndex] = 'Q';
                count += backTrack(board, colIndex + 1);
                board[i][colIndex] = '.';
            }
        }

        return count;
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
}
