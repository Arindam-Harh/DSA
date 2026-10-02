class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 1) return nums.length;
        Arrays.sort(nums);
        int prev = nums[0];
        int count = 1;
        int maxCount = 1;
        for(int i=1;i<nums.length;i++){
            int curr = nums[i];
            if(curr - prev == 1 || curr - prev == -1) {
                count++;
                maxCount = Math.max(count, maxCount);
            }else if(Math.abs(Math.abs(prev)-Math.abs(curr)) == 0) continue;
            else count = 1;
            prev = curr;
        }
        return maxCount;
    }
}