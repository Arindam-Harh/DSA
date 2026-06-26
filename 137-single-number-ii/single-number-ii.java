class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> seen = new HashSet<>();
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int e = nums[i];
            if (set.contains(e)) {
                seen.add(e);
                set.remove(e);
            } else if (!seen.contains(e)){
                set.add(e);
            }
        }
        for (int num : set) {
            res = num;
        }
        return res;
    }
}