class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(String s : words2){
            HashMap<Character, Integer> map1 = new HashMap<>();
            for(char c : s.toCharArray()){
                map1.put(c, map1.getOrDefault(c, 0)+1);
            }
            for(var e : map1.entrySet()){
                char c = e.getKey();
                int f = e.getValue();
                map.put(c, Math.max(map.getOrDefault(c, 0), f));
            }
        }
        List<String> list = new ArrayList<>();
        for(String s : words1){
            HashMap<Character, Integer> temp = new HashMap<>(map);
            if(subset(s, temp)) list.add(s);
        }
        return list;
    }
    private boolean subset(String s, HashMap<Character, Integer> map){
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)-1);
                if(map.get(c) == 0) map.remove(c);
            }
        }
        return map.isEmpty();
    }
}