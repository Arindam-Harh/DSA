class Solution {
    static int INF = Integer.MAX_VALUE;
    public boolean uniformArray(int[] nums1) {
        int minOdd = INF;
        int minEven = INF;
        for(int n : nums1){
            if(n%2 != 0) minOdd = Math.min(n, minOdd);
            else minEven = Math.min(n, minEven);
        }
        if(minOdd == INF || minEven == INF) return true;
        return minEven - minOdd >= 1;
    }
}