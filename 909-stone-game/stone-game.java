class Solution {
    public boolean stoneGame(int[] piles) {
        int alice = 0;
        int bob = 0;
        int start = 0;
        int end = piles.length - 1;
        while(start <= end){
            if(piles[start] > piles[end]){
                alice += piles[start++];
            }else{
                alice += piles[end--];
            }
            if(piles[start] <= piles[end]){
                bob += piles[start++];
            }else{
                bob += piles[end--];
            }
        }
        return alice > bob;
    }
}