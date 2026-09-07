class Solution {
    static long low = Long.MIN_VALUE;
    public int thirdMax(int[] nums) {
        long one = low;
        long two = low;
        long three = low;
        int count = 0;
        for(int n : nums){
            if(n == one || n == two || n == three) continue;
            count++;
            if(one < n) {
                three = two;
                two = one;
                one = n;
            }else if(two < n){
                three = two;
                two = n;
            }else if(three < n){
                three = n;
            }
        }
        if(count < 3) return (int) one;
        return (int) three;
    }
}