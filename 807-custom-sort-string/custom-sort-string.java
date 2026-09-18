class Solution {
    public String customSortString(String order, String s) {
        char res[] = new char[s.length()];
        int i = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(char ch : order.toCharArray()){
            while(map.containsKey(ch)){
                res[i++] = ch;
                map.put(ch, map.get(ch)-1);
                if(map.get(ch) == 0) map.remove(ch);
            }
        }
        while(!map.isEmpty()){
            Character ch = map.keySet().iterator().next();
            res[i++] = ch;
            map.put(ch, map.get(ch)-1);
            if(map.get(ch) == 0) map.remove(ch);
        }
        return new String(res);
    }
}