class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Arrays.sort(words);
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        List<String> w = new ArrayList<>();
        for(String s : words){
            map.put(s, map.getOrDefault(s, 0) + 1);
            if(!set.contains(s)) {
                w.add(s);
                set.add(s);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(var entry : map.entrySet()){
            list.add(entry.getValue());
        }
        Collections.sort(list, Collections.reverseOrder());
        List<String> ans = new ArrayList<>();
        while( ans.size() < k){
            for (int j = 0; j < w.size(); j++) {
                if (map.get(w.get(j)).equals(list.get(0))) {
                    ans.add(w.get(j));
                    if(ans.size() == k) break;
                    list.remove(0);
                    w.remove(j);
                    break;
                }
            }
        }
        return ans;
    }
}