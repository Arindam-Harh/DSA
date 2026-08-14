class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int steps = 0;
        for(int n : nums){
            steps += n - min;
        }
        return steps;
    }
}