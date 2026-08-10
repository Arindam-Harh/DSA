class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        return paths(0, 0, m, n, dp);
    }

    static int paths(int i, int j, int m, int n, int[][] dp) {
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        if (dp[i][j] != -1) return dp[i][j];
        int right = 0;
        int down = 0;
        if (i >= 0 && i < m - 1) {
            down += paths(i + 1, j, m, n,dp);
        }
        if (j >= 0 && j < n - 1) {
            right  += paths(i, j + 1, m, n, dp);
        }
        dp[i][j] = right + down;
        return dp[i][j];
    }
}