class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String,Integer> map = new HashMap<>();
        List<String> l = new ArrayList<>();
        for(List<String> list : responses){
            HashSet<String> set = new HashSet<>();
            for(String s : list){
                if(!set.contains(s)) {
                    set.add(s);
                    l.add(s);
                }
            }
        }
        for(String s : l){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        l.clear();
        int max = -1;
        for(var e : map.entrySet()){
            if(e.getValue() > max) {
                max = Math.max(max, e.getValue());
                l.clear();
                l.add(e.getKey());
            }else if(e.getValue() == max) l.add(e.getKey());
        }
        Collections.sort(l);
        return l.get(0);
    }
}