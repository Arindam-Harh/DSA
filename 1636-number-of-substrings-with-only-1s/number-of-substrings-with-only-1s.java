class Solution {
    static final int MOD = 1_000_000_007;
    public int numSub(String s) {
        long count = 0;
        long ans = 0;
        for(char ch : s.toCharArray()){
            if(ch == '1') count++;
            else {
                ans = (ans + count*(count+1)/2) % MOD;
                count = 0;
            }
        }
        return (int) (ans + count*(count+1)/2) % MOD;
    }
}