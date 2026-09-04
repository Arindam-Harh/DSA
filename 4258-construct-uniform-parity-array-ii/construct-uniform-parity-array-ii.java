class Solution {
    static int max = Integer.MAX_VALUE;
    public boolean uniformArray(int[] nums1) {
        int minOdd = max;
        int minEven = max;
        for(int n : nums1){
            if(n%2 != 0) minOdd = Math.min(n, minOdd);
            else minEven = Math.min(n, minEven);
        }
        if(minOdd == max || minEven == max) return true;
        return minEven - minOdd >= 1;
    }
}