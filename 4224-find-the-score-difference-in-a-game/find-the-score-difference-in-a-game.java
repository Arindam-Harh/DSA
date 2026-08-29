class Solution {
    public int scoreDifference(int[] nums) {
        int score = 0;
        boolean active = true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 != 0) active = !active;
            if((i+1)%6 == 0) active = !active;

            if(active) score += nums[i];
            else score -= nums[i];
        }
        return score;
    }
}