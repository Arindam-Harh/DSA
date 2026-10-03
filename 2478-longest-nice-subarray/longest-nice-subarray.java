class Solution {
    public int longestNiceSubarray(int[] nums) {
        int max = 1;
        int l = 0;
        int r = 1;
        int a = nums[l];
        while(r < nums.length){
            if((a+nums[r]) == (a^nums[r])){
                a = a + nums[r];
                r++;
            }else if((a+nums[r]) != (a^nums[r])){
                a -= nums[l];
                l++;
            }
            max = Math.max(r - l, max);
        }        
        return max;
    }
}