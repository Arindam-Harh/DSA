class Solution {
    public boolean canJump(int[] nums) {
        int l = nums.length;
        if(l == 1) return true;
        if(nums[0] == 0) return false;
        int i = 0;
        while(i<l-1){
            int n = nums[i];
            int max = 0;
            int maxIndex = i;
            if(n == 0) return false;
            for(int j=i;j<=n+i && j<l-1;j++){
                if(j + nums[j] >= l-1) return true;
                max = Math.max(max, j+nums[j]);
                maxIndex = max == j+nums[j] ? j : maxIndex;
            }
            i = maxIndex;
        }
        return false;
    }
} 