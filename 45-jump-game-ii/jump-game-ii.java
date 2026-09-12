class Solution {
    public int jump(int[] nums) {
        int l = nums.length;
        int i=0;
        int count = 1;
        while(i<l-1){
            int n = nums[i];
            if(n >= l-1) return count;
            int maxIndex = i;
            int max = 0;
            for(int j=i;j<=n+i && j<l-1;j++){
                if(nums[j] == 0) continue;
                if(j+nums[j] >= l-1) return count+1;
                max = Math.max(max, j+nums[j]);
                maxIndex = max == j+nums[j] ? j : maxIndex;
            }
            count++;
            i = maxIndex;
        }
        return 0;
    }
}