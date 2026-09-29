class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = -Double.MAX_VALUE;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];
            max = (double)sum/k;
        }
        for(int i=1;i+k<=nums.length;i++){
            sum += nums[i+k-1] - nums[i-1];
            max = Math.max(max, (double)sum/k);
        }
        return max;
    }
}