class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1 > n2) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char c : s1.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for(int i=0;i<n1;i++){
            char c = s2.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        if(map1.equals(map2)) return true;
        for(int i=1;i<=n2-n1;i++){
            char remove = s2.charAt(i-1);
            if(map2.get(remove) == 1) map2.remove(remove);
            else map2.put(remove, map2.get(remove) - 1);
            char add = s2.charAt(i+n1-1);
            map2.put(add, map2.getOrDefault(add, 0) + 1);
            if(map1.equals(map2)) return true;
        }
        return false;
    }
}