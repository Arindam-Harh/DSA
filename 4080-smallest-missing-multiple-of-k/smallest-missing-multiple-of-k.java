class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        boolean arr[] = new boolean[n+1];
        for(int i=0;i<n;i++){
            if(nums[i]%k == 0 && nums[i]/k <= n) {
                arr[nums[i]/k] = true;
            }
        }
        for(int i=1;i<=n;i++){
            if(!arr[i]) return i*k;
        }
        return (n+1)*k;
    }
}