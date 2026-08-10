class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        return sum(0, 0, grid, dp, m, n);
    }
    static int sum(int i, int j, int[][] grid, int[][] dp, int m, int n){
        if(i==m-1 && j == n-1){
            return grid[i][j];
        }
        if(dp[i][j] != -1) return dp[i][j];
        int right = Integer.MAX_VALUE;
        int down =  Integer.MAX_VALUE;
        if(i < m-1){
            right = sum(i+1, j, grid, dp, m, n);
        }
        if(j < n-1){
            down = sum(i, j+1, grid, dp, m, n);
        }
        dp[i][j] = grid[i][j] + Math.min(right, down);
        return dp[i][j];
    }
}