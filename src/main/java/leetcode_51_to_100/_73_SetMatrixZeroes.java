package leetcode_51_to_100;

public class _73_SetMatrixZeroes {
    /*public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new _73_SetMatrixZeroes().setZeroes(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}})));
    }*/

    public void setZeroes(int[][] matrix) {
        boolean fr = false;
        boolean fc = false;
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) fr = true;
                    if (j == 0) fc = true;
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (fr) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        if (fc) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
