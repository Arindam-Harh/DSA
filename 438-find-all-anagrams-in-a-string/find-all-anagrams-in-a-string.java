class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int l = p.length();
        if(n < l) return  new ArrayList<>();
        List<Integer> idx = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : p.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i=0;i<l;i++){
            char c = s.charAt(i);
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        boolean isAnagram = true;
        for(var entry : map.entrySet()){
            if(!Objects.equals(map1.get(entry.getKey()), entry.getValue())){
                isAnagram = false;
            } 
        }
        if(isAnagram) idx.add(0);
        for(int i=1;i<=n-l;i++){
            isAnagram = true;
            char remove = s.charAt(i - 1);
            map1.put(remove, map1.getOrDefault(remove, 0) - 1);
            char add = s.charAt(i + l - 1);
            map1.put(add, map1.getOrDefault(add, 0) + 1);
            for(var entry : map.entrySet()){
                if(!Objects.equals(map1.get(entry.getKey()), entry.getValue())){
                    isAnagram = false;
                } 
            }
            if(isAnagram) idx.add(i);
        }
        return idx;
    }
}