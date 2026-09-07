class Solution {
    public String longestDiverseString(int a, int b, int c) {
        if(a == 0 && b == 0 && c == 0) return "";
        StringBuilder sb = new StringBuilder();
        TreeMap<Character, Integer> map = new TreeMap<>();
        if(a != 0) map.put('a', a);
        if(b != 0) map.put('b', b);
        if(c != 0) map.put('c', c);
        while(!map.isEmpty()){
            char current = getHighestKey(map);
            if(sb.length() >= 2
            && sb.charAt(sb.length() - 1) == current
            && sb.charAt(sb.length() - 2) == current){
                char ch = getHighestKeyExcept(map, current);
                if (ch == '\0')   break;
                sb.append(ch);
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) map.remove(ch);
            }else{
                sb.append(current);
                map.put(current, map.get(current)-1);
                if(map.get(current) == 0) map.remove(current);
            }
        }
        return sb.toString();
    }
    private char getHighestKey(TreeMap<Character, Integer> map) {
        char max = map.firstKey();
        for(var entry : map.entrySet()){
            if(map.get(max) < entry.getValue()) max = entry.getKey();
        }
        return max;
    }
    private char getHighestKeyExcept( TreeMap<Character, Integer> map, char excluded) {
        char max = '\0';
        for (var entry : map.entrySet()) {
            char ch = entry.getKey();
            if (ch == excluded) continue;
            if (max == '\0'|| entry.getValue() > map.get(max)) max = ch;
        }
        return max;
    }
}