package leetcode_51_to_100;

public class _64_MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j != 0) {
                    grid[0][j] = grid[0][j] + grid[0][j - 1];
                } else if (i != 0 && j == 0) {
                    grid[i][0] = grid[i][0] + grid[i - 1][0];
                } else if (i == 0 && j == 0) {
                    grid[0][0] = grid[0][0];
                } else {
                    grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
                }
            }
        }
        return grid[m - 1][n - 1];
    }
}
