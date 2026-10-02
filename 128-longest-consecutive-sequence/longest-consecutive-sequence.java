class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 1) return nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums) set.add(n);
        int count = 1;
        int maxCount = 1;
        for(int num : nums){
            if(!set.contains(num-1)){
                set.remove(num);
                while(true){
                    if(set.contains(num+1)) {
                        count++;
                        set.remove(num+1);
                        num = num+1;
                    }else break;
                }
                maxCount = Math.max(count, maxCount);
                count = 1;
            }else count = 1;
        }
        return maxCount;
    }
}