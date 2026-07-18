class Solution {
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int findGCD(int[] nums) {
        int a = nums[0];
        int b = nums[0];
        for(int n : nums){
            if(n > b) b = n;
            if(n < a) a = n;
        }
        return gcd(a, b);
    }
}