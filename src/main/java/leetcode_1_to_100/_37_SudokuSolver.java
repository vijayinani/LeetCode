package leetcode_1_to_100;

public class _37_SudokuSolver {

    public static void main(String[] args) {
        new _37_SudokuSolver().solveSudoku(new char[][]{{'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}});
    }

    private boolean solveSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c;

                            if (solveSudoku(board)) {
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int i, int j, char c) {
        for (int x = 0; x < 9; x++) {
            if (board[i][x] == c) {
                return false;
            }
        }
        for (int x = 0; x < 9; x++) {
            if (board[x][j] == c) {
                return false;
            }
        }

        int row = 3 * (i / 3);
        int col = 3 * (j / 3);
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (board[x + row][y + col] == c) {
                    return false;
                }
            }
        }
        return true;
    }
}
