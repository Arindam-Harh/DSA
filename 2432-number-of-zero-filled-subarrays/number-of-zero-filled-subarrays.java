class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int count = 0;
        long totalCount = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                count++;
            }else if(nums[i] != 0){
                totalCount += (long) count*(count + 1)/2;
                count = 0;
            }
        }
        totalCount += (long) count*(count + 1)/2;
        return totalCount;
    }
}