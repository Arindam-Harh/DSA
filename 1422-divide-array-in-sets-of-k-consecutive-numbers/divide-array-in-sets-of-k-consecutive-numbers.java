class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length % k != 0) return false;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        while(!map.isEmpty()){
            int first = map.firstKey();
            for(int i=0;i<k;i++){
                int next = first + i;
                if(!map.containsKey(next)) return false;
                map.put(next, map.get(next)-1);
                if(map.get(next) == 0) map.remove(next);
            }
        }
        return true;
    }
}