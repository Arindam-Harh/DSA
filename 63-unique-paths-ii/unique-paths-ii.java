class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(obstacleGrid[i][j] != 1) dp[i][j] = -1;
                else dp[i][j] = -99;
            }
        }
        return paths(0, 0, m, n, dp);
    }
    static int paths(int i, int j, int m, int n, int[][] dp){
        if(i == m-1 && j == n-1){
            if(dp[i][j] == -99) return 0;
            return 1;
        }
        if(dp[i][j] == -99) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int down = 0;
        int right = 0;
        if(i < m-1){
            down = paths(i+1, j, m, n, dp);
        }
        if(j < n-1){
            right = paths(i, j+1, m, n, dp);
        }
        dp[i][j] = right + down;
        return dp[i][j];
    }
}