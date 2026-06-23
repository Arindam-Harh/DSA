class Solution {
    public int rearrangeCharacters(String s, String target) {
        int arr[] = new int[26];
        int temp[] = new int[26];
        for(char c : s.toCharArray()){
            arr[c-'a']++;
        }
        int minFreq = Integer.MAX_VALUE;
        for(char c : target.toCharArray()){
            temp[c-'a']++;
        }
        for(char c : target.toCharArray()){
            minFreq = Math.min(minFreq, arr[c-'a']/temp[c-'a']);
            
        }
        return minFreq;
    }
}