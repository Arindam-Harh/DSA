class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i] < 0) arr[i] = -nums[i];
            else arr[i] = nums[i];
        }
        Arrays.sort(arr);
        long ans = 0;
        for(int i=0;i<n;i++){
            if(i < n/2) ans -= Math.pow(arr[i], 2);
            else ans += Math.pow(arr[i], 2);
        }
        return ans;
    }
}