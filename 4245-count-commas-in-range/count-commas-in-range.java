class Solution {
    public int countCommas(int n) {
        int len = 0;
        int num = n;
        while(n > 0){
            len++;
            n /= 10;
        }
        if(len <= 3) return 0;
        return num - 999;
    }
}