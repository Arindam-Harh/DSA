class Solution {
    public int minimumDistance(int[] nums) {
        if(nums.length <= 2) return -1;
        int n = nums.length;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        int min = Integer.MAX_VALUE;
        for(var entry : map.entrySet()){
            List<Integer> list = entry.getValue();
            if(list.size() >= 3){
                int res = calculate(list);
                min = Math.min(min, res);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
    static int calculate(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= list.size() - 3; i++) {
            int distance = 2 * (list.get(i + 2) - list.get(i));
            min = Math.min(min, distance);
        }
        return min;
    }
}