class Solution {
    public int scoreDifference(int[] nums) {
        int p1 = 0;
        int p2 = 0;
        boolean a1 = true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 != 0) a1 = !a1;
            if((i+1)%6 == 0) a1 = !a1;

            if(a1) p1 += nums[i];
            else p2 += nums[i];
        }
        return p1 - p2;
    }
}