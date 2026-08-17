class Solution {
    public int minimumDistance(int[] nums) {
        if(nums.length <= 2) return -1;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        int min = Integer.MAX_VALUE;
        for(var entry : map.entrySet()){
            if(entry.getValue().size() >= 3) min = Math.min(min, calculate(entry.getValue()));
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
    static int calculate(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= list.size() - 3; i++) {
            min = Math.min(min, 2 * (list.get(i + 2) - list.get(i)));
        }
        return min;
    }
}