package leetcode_51_to_100;

public class _62_UniquePaths {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) dp[0][j] = 1;
                if (j == 0) dp[i][0] = 1;
                if (i != 0 && j != 0) {
                    int up = dp[i - 1][j];
                    int left = dp[i][j - 1];
                    dp[i][j] = up + left;
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
