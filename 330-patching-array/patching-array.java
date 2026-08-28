class Solution {
    public int minPatches(int[] nums, int n) {
        long coverage = 0;
        int count = 0;
        int i = 0;
        while(coverage < n){
            if(i < nums.length && nums[i] <= coverage + 1){
                coverage += nums[i];
                i++;
            }else {
                coverage  += coverage + 1;
                count++;
            }
        }
        return count;
    }
}