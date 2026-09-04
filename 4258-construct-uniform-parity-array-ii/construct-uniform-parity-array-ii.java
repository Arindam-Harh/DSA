class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;
        for(int n : nums1){
            if(n%2 != 0){
                minOdd = Math.min(n, minOdd);
            }else{
                minEven = Math.min(n, minEven);
            }
        }
        if(minOdd == Integer.MAX_VALUE || minEven == Integer.MAX_VALUE) return true;
        if(minOdd >= minEven) return false;
        return true;
    }
}