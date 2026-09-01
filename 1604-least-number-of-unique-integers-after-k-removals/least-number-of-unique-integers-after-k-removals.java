class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : arr){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list =
            new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        int uniqueValues = map.size();
        for(var entry : sortedMap.entrySet()){
            if(entry.getValue() <= k){
                k -= entry.getValue();
                uniqueValues--;
            }else break;
        }
        return uniqueValues;
    }
}