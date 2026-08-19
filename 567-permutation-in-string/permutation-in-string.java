class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int n1 = s1.length();
        int n2 = s2.length();
        boolean permute = true;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char c : s1.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for(int i=0;i<n1;i++){
            char c = s2.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        for(var entry : map1.entrySet()){
            if(!Objects.equals(map2.get(entry.getKey()), entry.getValue())){
                permute = false;
                break;
            }
        }
        if(permute) return true;
        for(int i=1;i<=n2-n1;i++){
            permute = true;
            char remove = s2.charAt(i-1);
            map2.put(remove, map2.getOrDefault(remove, 0) - 1);
            char add = s2.charAt(i+n1-1);
            map2.put(add, map2.getOrDefault(add, 0) + 1);
            for(var entry : map1.entrySet()){
                if(!Objects.equals(map2.get(entry.getKey()), entry.getValue())){
                    permute = false;
                    break;
                }
            }
            if(permute) return true;
        }
        return false;
    }
}