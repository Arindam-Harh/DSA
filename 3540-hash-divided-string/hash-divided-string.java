class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i+=k){
            String str = s.substring(i, i+k);
            sb.append((char)('a' + process(str)));
        }
        return sb.toString();
    }
    static int process(String s){
        int v = 0;
        for(char ch : s.toCharArray()){
            v += ch - 'a';
        }
        return v%26;
    }
}