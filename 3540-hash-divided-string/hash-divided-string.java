class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i+=k){
            String str = s.substring(i, i+k);
            int val = process(str);
            char ch = (char) ('a' + val);
            sb.append(ch);
        }
        return sb.toString();
    }
    static int process(String s){
        int v = 0;
        for(int i=0;i<s.length();i++){
            v += s.charAt(i) - 'a';
        }
        return v%26;
    }
}