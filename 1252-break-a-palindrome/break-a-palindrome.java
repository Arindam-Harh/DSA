class Solution {
    public String breakPalindrome(String palindrome) {
        int n = palindrome.length();
        if(n <= 1) return "";
        char[] res = palindrome.toCharArray();
        for(int i=0;i<n;i++){
            if(i == n/2 && i != n-1) continue;
            if(res[i] != 'a'){
                res[i] = 'a';
                break;
            }
            if(i == n-1) res[i] = 'b';
        }
        return new String(res);
    }
}