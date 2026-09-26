class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int odd = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%2 != 0) odd++;
        }
        if(odd == 0) return 0;
        int arr[] = new int[odd];
        for(int i=0, j=0;i<n && j<odd;i++){
            if(nums[i]%2 != 0) arr[j++] = i; 
        }
        int ans = 0;
        for (int i = 0; i + k - 1 < odd; i++) {
            int left = (i == 0) ? arr[i] + 1 : arr[i] - arr[i - 1];
            int right;
            if (i + k < odd) {
                right = arr[i + k] - arr[i + k - 1];
            } else {
                right = n - arr[i + k - 1];
            }
            ans += left * right;
        }
        return ans;
    }
}