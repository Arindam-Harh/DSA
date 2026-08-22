class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        int s = 0;
        int e = x/2;
        while(s <= e){
            int m = (s + e)/2;
            if((long)m*m == x){
                return m;
            }else if((long)m*m > x){
                e = m-1;
            }else{
                s = m+1;
            }
        }
        return e;
    }
}