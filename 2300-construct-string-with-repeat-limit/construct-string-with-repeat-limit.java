class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        StringBuilder sb = new StringBuilder();
        Character largest = map.lastKey();
        int rl = repeatLimit;
        while(!map.isEmpty()){
            if(repeatLimit > 0 && map.get(largest) > 0){
                sb.append(largest);
                repeatLimit--;
                map.put(largest, map.get(largest)-1);
            }
            if(repeatLimit == 0 && map.get(largest) > 0){
                Character next = map.lowerKey(largest);
                if(next == null) break;
                sb.append(next);
                map.put(next, map.get(next)-1);
                if(map.get(next) == 0){
                    map.remove(next);
                }
                repeatLimit = rl;
            }
            if(map.get(largest) == 0){
                map.remove(largest);
                if(map.isEmpty()) break;
                largest = map.lastKey();
                repeatLimit = rl;
            }
        } 
        return sb.toString();
    }
}