class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int n : nums){
            int count = 2;
            int res = n + 1;
            for(int i=2;i*i<=n;i++){
                if(n%i == 0) {
                    if(n/i == i){
                        res += i;
                        count++;
                    }else{
                        res += i + n/i;
                        count += 2;
                    }
                }
            }
            if(count == 4) sum += res;
        }
        return sum;
    }
}