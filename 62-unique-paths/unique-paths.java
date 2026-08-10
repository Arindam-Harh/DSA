class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        return paths(0, 0, m, n, dp);
    }

    static int paths(int i, int j, int m, int n, int[][] dp) {
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        if (dp[i][j] != 0)
            return dp[i][j];
        int down = 0;
        int right = 0;
        if (i >= 0 && i < m - 1) {
            down += paths(i + 1, j, m, n,dp);
        }
        if (j >= 0 && j < n - 1) {
            right += paths(i, j + 1, m, n, dp);
        }
        dp[i][j] = down + right;
        return dp[i][j];
    }
}