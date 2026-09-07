class Solution {
    public int thirdMax(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        if(map.size() < 3) return map.lastKey();
        int k = map.lastKey();
        for(int i = 1; i < 3; i++){
            k = map.lowerKey(k);
        }
        return k;
    }
}