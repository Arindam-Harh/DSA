class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length <= 1) return 0;
        int n = nums.length;
        int e = n-1;
        int s = 0;
        while(s < e){
            int mid = s + (e-s)/2;
            if(nums[mid] > nums[mid+1]) e = mid;
            else if(nums[mid] < nums[mid+1]) s = mid+1;
        }
        return s;
    }
}