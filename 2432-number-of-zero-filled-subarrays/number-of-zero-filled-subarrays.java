class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int count = 0;
        long totalCount = 0;
        for(int num : nums){
            if(num == 0){
                count++;
            }else{
                totalCount += (long) count*(count + 1)/2;
                count = 0;
            }
        }
        totalCount += (long) count*(count + 1)/2;
        return totalCount;
    }
}