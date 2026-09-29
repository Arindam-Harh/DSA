class Solution {
    public int maxVowels(String s, int k) {
        int max = 0;
        int count = 0;
        for(int i=0;i<k;i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') count++;
        }
        max = Math.max(count, max);
        for(int i=1;i+k<=s.length();i++){
            char c1 = s.charAt(i-1);
            char c2 = s.charAt(i+k-1);
            if(c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') count--;
            if(c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u') count++;
            max = Math.max(count, max);
        }
        return max;
    }
}