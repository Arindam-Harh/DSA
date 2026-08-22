class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int remaining = 0;
        int total = 0;
        for(int roll : rolls) total += roll;
        remaining = mean*(rolls.length + n) - total;
        if(remaining < n || remaining > 6*n) return new int[0];
        int[] res = new int[n];
        for(int i=0;i<res.length;i++){
            res[i] = (int) Math.ceil(remaining/n);
            remaining -= res[i];
            n--;
        }
        return res;
    }
}