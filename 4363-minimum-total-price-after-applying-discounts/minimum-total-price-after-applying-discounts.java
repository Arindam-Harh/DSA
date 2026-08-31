class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int j = discounts.length - 1;
        double total = 0;
        for(int i=prices.length-1;i>=0;i--){
            if(j >= 0) total += prices[i] * (100.0 - discounts[j--]) / 100.0;
            else total += prices[i];
        }
        return total;
    }
}