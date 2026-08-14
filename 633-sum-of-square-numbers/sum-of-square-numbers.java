class Solution {
    public boolean judgeSquareSum(int c) {
        long low = 0;
        long high = (long) Math.sqrt(c);
        while(low <= high){
            if((low*low + high*high) > c) high--;
            else if((low*low + high*high) < c) low++;
            else if((low*low + high*high) == c) return true;
        }
        return false;
    }
}