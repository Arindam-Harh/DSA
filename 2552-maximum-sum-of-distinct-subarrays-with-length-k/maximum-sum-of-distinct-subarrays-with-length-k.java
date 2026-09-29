class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0;
        long sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<k;i++){
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        if(map.size() == k) max = Math.max(sum, max);
        for(int i=1;i+k<=nums.length;i++){
            map.put(nums[i-1], map.get(nums[i-1])-1);
            if(map.get(nums[i-1]) == 0) map.remove(nums[i-1]);
            sum += nums[i+k-1] - nums[i-1];
            map.put(nums[i+k-1], map.getOrDefault(nums[i+k-1], 0)+1);
            if(map.size() == k) max = Math.max(max, sum);
        }
        return max;
    }
}