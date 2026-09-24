class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int current = 0;
        int n = cardPoints.length;
        for(int i=0;i<n-k;i++){
            current += cardPoints[i];
        }
        int minSum = current;
        for(int i=1;i<=k;i++){
            int newWindow = current - cardPoints[i-1] + cardPoints[n-k+i-1];
            current = newWindow;
            minSum = Math.min(minSum, current);
        }
        int total = 0;
        for(int i=0;i<n;i++) total += cardPoints[i];
        return total - minSum;
    }
}