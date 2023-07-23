package leetcode_1_to_50;

public class _48_RotateImage {
    public static void main(String[] args) {
        new _48_RotateImage().rotate(new int[][]{{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}});
    }

    public void rotate(int[][] matrix) {
        reverse(matrix);
        transpose(matrix);
    }

    private void reverse(int[][] matrix) {
        int i = 0;
        int j = matrix.length - 1;
        while (i < j) {
            for (int k = 0; k < matrix[0].length; k++) {
                int temp = matrix[i][k];
                matrix[i][k] = matrix[j][k];
                matrix[j][k] = temp;
            }
            i++;
            j--;
        }
    }

    private void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
