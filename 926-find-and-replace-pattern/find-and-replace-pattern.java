class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        for(String s : words){
            HashMap<Character, Character> map1 = new HashMap<>();
            HashMap<Character, Character> map2 = new HashMap<>();
            boolean isMatch = true;
            for(int i=0;i<pattern.length();i++){
                if(map1.containsKey(s.charAt(i))){
                    if(map1.get(s.charAt(i))!= pattern.charAt(i)) isMatch = false;
                }else{
                    if(map2.containsKey(pattern.charAt(i))) isMatch = false;
                    map1.put(s.charAt(i), pattern.charAt(i));
                    map2.put(pattern.charAt(i), s.charAt(i));
                }
            }
            if(isMatch) list.add(s);
        }
        return list;
    }
}