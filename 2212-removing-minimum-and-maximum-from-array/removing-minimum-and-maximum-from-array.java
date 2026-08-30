class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n <= 1) return n;
        int i1 = 0;
        int i2 = 0;
        int low = nums[i1];
        int high = nums[i2];
        for(int i=0;i<n;i++){
            if(nums[i1] > nums[i]) i1 = i;
            if(nums[i2] < nums[i]) i2 = i;
        }
        int front = Math.max(i1, i2) + 1;
        int last = n - Math.min(i1, i2);
        int both = Math.min(i1, i2) + 1 +  n - Math.max(i1, i2);
        return Math.min(front, Math.min(last, both));
    }
}