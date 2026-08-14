class Solution {
    public int minCost(int n) {
        int[] cost = new int[n+1];
        cost[1] = 0;
        for(int i=2;i<=n;i++){
            cost[i] = cost[i-1] + i-1;
        }
        return cost[n];
    }
}