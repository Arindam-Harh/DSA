class Solution {
    public int maxProfit(int[] prices) {
        int maxElem = prices[prices.length-1];
        int maxDiff = 0;
        for(int i=prices.length - 2;i>=0;i--){
            if(prices[i] >= maxElem) maxElem = prices[i];
            else{
                int profit = maxElem - prices[i];
                maxDiff = Math.max(profit, maxDiff);
            }
        }
        return maxDiff;
    }
}