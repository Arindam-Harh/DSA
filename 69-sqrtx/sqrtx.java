class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        // int s = 0;
        // int e = x/2;
        // while(s <= e){
        //     int m = e + (s-e)/2;
        //     long sq = (long) m*m;
        //     if(sq == x) return m;
        //     else if(sq> x) e = m-1;
        //     else s = m+1;
        // }
        // return e;
        double n = x;
        double root;
        while(true){
            root = 0.5 * (n + (x/n));
            if(Math.abs(root-n) < 1) break;
            n = root;
        }
        return (int)root;
    }
}