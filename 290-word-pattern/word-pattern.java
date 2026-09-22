class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        String[] str = s.split(" ");
        if(pattern.length() != str.length) return false;
        for(int i=0;i<pattern.length();i++){
            if(map1.containsKey(pattern.charAt(i))){
                if(!map1.get(pattern.charAt(i)).equals(str[i])) return false;
            }else{
                if(map2.containsKey(str[i])) return false;
                map1.put(pattern.charAt(i), str[i]);
                map2.put(str[i], pattern.charAt(i));
            }
        }
        return true;
    }
}