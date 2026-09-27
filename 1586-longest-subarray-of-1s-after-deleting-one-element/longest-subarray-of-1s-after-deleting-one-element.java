class Solution {
    public int longestSubarray(int[] nums) {
        int zero = 0;
        int n = nums.length;
        for(int num : nums){
            if(num == 0) zero++;
        }
        if(zero <= 1) return n - 1;
        int arr[] = new int[zero];
        for(int i=0, j=0;i<n;i++){
            if(nums[i] == 0) arr[j++] = i;
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(i == 0) max = Math.max(+arr[i+1]-1, max);
            else if(i == arr.length-1) max = Math.max(n-arr[i-1]-2, max);
            else max = Math.max(arr[i+1]-arr[i-1]-2, max);
        }
        return max;
    }
}