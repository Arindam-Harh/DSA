class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean odd = true;
        boolean even = true;
        for(int n : nums1){
            if(n%2 == 0) {
                odd = false;
                break;
            }
        }
        for(int n : nums1){
            if(n%2 != 0) {
                even = false;
                break;
            }
        }
        if(odd || even) return true;
        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;
        for(int n : nums1){
            if(n%2 != 0){
                minOdd = Math.min(n, minOdd);
            }else{
                minEven = Math.min(n, minEven);
            }
        }
        if(minOdd >= minEven) return false;
        return true;
    }
}