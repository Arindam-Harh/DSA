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
        for(var entry : sortedMap.entrySet()){
            if(entry.getValue() <= k){
                k -= entry.getValue();
                sortedMap.put(entry.getKey(), 0);
            }else break;
        }
        int n = arr.length;
        int uniqueValues = 0;
        for(var entry : sortedMap.entrySet()){
            if(entry.getValue() != 0) uniqueValues++;
        }
        return uniqueValues;
    }
}