class Solution {
    public char findTheDifference(String s, String t) {
        int i = 0;
        int j = 0;
        int c = 0;
        while (i < s.length() || j < t.length()) {
            int c1 = i < s.length() ? s.charAt(i++) - 'a' : 0;
            int c2 = j < t.length() ? t.charAt(j++) - 'a' : 0;
            c = c ^ c1 ^ c2;
        }
        return (char) (c + 'a');
    }
}