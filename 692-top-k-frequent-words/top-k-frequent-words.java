class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String s : words){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        TreeSet<String> set = new TreeSet<>((a, b) -> {
            if(!map.get(a).equals(map.get(b)))
                return map.get(b) - map.get(a);
            return a.compareTo(b);
        });
        set.addAll(map.keySet());
        List<String> ans = new ArrayList<>();
        while( k > 0){
            ans.add(set.pollFirst());
            k--;
        }
        return ans;
    }
}