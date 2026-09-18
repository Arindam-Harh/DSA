class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(char ch : order.toCharArray()){
            if(map.containsKey(ch)){
                while(map.containsKey(ch)){
                    sb.append(ch);
                    map.put(ch, map.get(ch)-1);
                    if(map.get(ch) == 0) map.remove(ch);
                }
            }
        }
        while(!map.isEmpty()){
            Character ch = map.keySet().iterator().next();
            sb.append(ch);
            map.put(ch, map.get(ch)-1);
            if(map.get(ch) == 0) map.remove(ch);
        }
        return sb.toString();
    }
}