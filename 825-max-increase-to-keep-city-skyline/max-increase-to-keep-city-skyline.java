class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[] row = new int[n];
        int[] col = new int[n];
        for(int i=0;i<n;i++){
            int maxVal = grid[i][0];
            int mVal = grid[0][i];
            for(int j=0;j<n;j++){
                maxVal = Math.max(maxVal, grid[i][j]);
                mVal = Math.max(mVal, grid[j][i]);
            }
            row[i] = maxVal;
            col[i] = mVal;
        }
        int score = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int m = Math.min(row[i], col[j]);
                score += m - grid[i][j];
            }
        }
        return score;
    }
}