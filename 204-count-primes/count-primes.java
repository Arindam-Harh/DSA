class Solution {
    public int countPrimes(int n) {
        if(n <= 2) return 0;
        int[] isPrime = new int[n];
        for(int i=0;i<n;i++) isPrime[i] = 1;
        isPrime[0] = 0;
        isPrime[1] = 0;
        for(int i=2;i*i<n;i++){
            if(isPrime[i] == 1){
                for(int j=i*i;j<n;j+=i){
                    isPrime[j] = 0;
                }
            }
        }
        int primeCount = 0;
        for(int i=0;i<n;i++){
            if(isPrime[i] == 1) primeCount++;
        }
        return primeCount;
    }
}