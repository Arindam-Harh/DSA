class Solution {
    static final int MOD = 1_000_000_007;
    public int countHomogenous(String s) {
        long count = 1;
        long ans = 0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1)) count++;
            else {
                ans = (ans + count*(count+1)/2) % MOD;
                count = 1;
            }
        }
        ans = (ans + count*(count+1)/2) % MOD;
        return (int) ans;
    }
}