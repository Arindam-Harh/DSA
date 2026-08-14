class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        for(int n : nums){
            min = Math.min(n, min);
        }
        int steps = 0;
        for(int n : nums){
            steps += n - min;
        }
        return steps;
    }
}