class Solution {
    public int commonFactors(int a, int b) {
        int n = gcd(a, b);
        int count = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i == 0) {
                if(i == n/i) count++;
                else count += 2;
            }
        }
        return count;
    }
    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }
}