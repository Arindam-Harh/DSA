class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> freqCount = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for(var entry : map.entrySet()){
            freqCount.put(entry.getValue(), freqCount.getOrDefault(entry.getValue(), 0) + 1);
        }
        HashSet<Integer> uniqueFreq = new HashSet<>();
        for(var entry : freqCount.entrySet()){
            if(entry.getValue() == 1) uniqueFreq.add(entry.getKey());
        }
        for(int n : nums){
            if(uniqueFreq.contains(map.get(n))) return n;
        }
        return -1;
    }
}