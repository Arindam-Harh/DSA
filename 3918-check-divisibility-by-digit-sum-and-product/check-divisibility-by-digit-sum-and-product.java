class Solution {
    public boolean checkDivisibility(int n) {
        long sum = 0;
        long mult = 1;
        long num = n;
        while(n > 0){
            int r = n % 10;
            sum += r;
            mult *= r;
            n /= 10;
        }
        return num % (sum + mult) == 0;
    }
}