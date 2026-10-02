class Solution {
    public int longestContinuousSubstring(String s) {
        int count = 1;
        int maxCount = 1;
        char prev = s.charAt(0);
        for(int i=1;i<s.length();i++){
            char curr = s.charAt(i);
            if((char)(prev+1) == curr){
                count++;
                maxCount = Math.max(count, maxCount);
            }else count = 1;
            prev = curr;
        }
        return maxCount;
    }
}