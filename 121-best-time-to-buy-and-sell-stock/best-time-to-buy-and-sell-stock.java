class Solution {
    public int maxProfit(int[] prices) {
        int maxElem = prices[prices.length-1];
        int maxDiff = 0;
        for(int i=prices.length - 2;i>=0;i--){
            maxElem = Math.max(maxElem, prices[i]);
            maxDiff = Math.max(maxDiff, maxElem - prices[i]);
        }
        return maxDiff;
    }
}