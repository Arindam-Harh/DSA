class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        map.put(s.charAt(l), l);
        int maxCount = 1;
        for(int i=1;i<s.length();i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, i);
            }else{
                int prev = map.get(ch);
                l = Math.max(l, prev+1);
                map.put(ch, i);
            }
            maxCount = Math.max(maxCount, i-l+1);
        }
        return maxCount;
    }
}