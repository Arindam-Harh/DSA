class Solution {
    public int numOfPairs(String[] nums, String target) {
        int pairs = 0;
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                String s1 = nums[i] + nums[j];
                if(s1.equals(target)) pairs++;
                String s2 = nums[n - i - 1] + nums[n - j - 1];
                if(s2.equals(target)) pairs++;
            }
        }
        return pairs;
    }
}