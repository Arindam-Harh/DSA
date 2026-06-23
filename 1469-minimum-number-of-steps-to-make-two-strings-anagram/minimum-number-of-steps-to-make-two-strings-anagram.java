class Solution {
    public int minSteps(String s, String t) {
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for(int i=0;i<s.length();i++){
            freq1[s.charAt(i)-'a']++;
            freq2[t.charAt(i)-'a']++;
        }
        int steps = 0;
        for(int i=0;i<26;i++){
            steps += Math.abs(freq1[i] - freq2[i]);
        }
        return steps/2;
    }
}