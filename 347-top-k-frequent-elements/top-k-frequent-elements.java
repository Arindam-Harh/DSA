class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (var entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list, Collections.reverseOrder());
        int i = 0;
        int arr[] = new int[k];
        while (i < k) {
            Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                var entry = it.next();
                if (entry.getValue() == list.get(0)) {
                    arr[i++] = entry.getKey();
                    list.remove(0);
                    it.remove();
                    break;
                }
            }
        }
        return arr;
    }
}