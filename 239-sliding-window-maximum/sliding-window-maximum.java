class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] window = new int[n-k+1];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            max = Math.max(max, nums[i]);
        }
        window[0] = max;
        for(int i=1;i<=n-k;i++){
            int exit = nums[i-1];
            int entry = nums[k+i-1];
            if(exit != max) {
                window[i] = Math.max(max, entry);
                max = Math.max(max, entry);
            }
            else {
                max = nums[i];
                for(int j=i;j<k+i;j++){
                    max = Math.max(nums[j], max);
                }
                window[i] = max;
            }
        }
        return window;
    }
}