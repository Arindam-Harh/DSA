class Solution {
    public long countCommas(long n) {
        if( n < 1000) return 0;
        long count = 0;
        if(n >= 1_000L){
            count += (Math.min(n, 999_999L)- 999L) * 1;
        }
        if(n >= 1_000_000L){
            count += (Math.min(n, 999_999_999L) - 999_999L) * 2;
        }
        if(n >= 1_000_000_000L){
            count += (Math.min(n, 999_999_999_999L) - 999_999_999L) * 3;
        }
        if(n >= 1_000_000_000_000L){
            count += (Math.min(n, 999_999_999_999_999L) - 999_999_999_999L) * 4;
        }
        if(n >= 1_000_000_000_000_000L){
            count += (n - 999_999_999_999_999L) * 5;
        }
        return count;
    }
}