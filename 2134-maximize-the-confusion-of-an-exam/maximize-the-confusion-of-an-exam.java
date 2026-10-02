class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int l = 0;
        int r = 0;
        int tMax = 0;
        int f = 0;
        int fMax = 0;
        int t = 0;
        while(r < answerKey.length()){
            if(answerKey.charAt(r) == 'F') f++;
            if(f > k){
                if(answerKey.charAt(l) == 'F') f--;
                l++;
            }
            if(f <= k) tMax = Math.max(r - l + 1, tMax);
            r++;
        }
        r = 0;
        l = 0;
        while(r < answerKey.length()){
            if(answerKey.charAt(r) == 'T') t++;
            if(t > k){
                if(answerKey.charAt(l) == 'T') t--;
                l++;
            }
            if(t <= k) fMax = Math.max(r - l + 1, fMax);
            r++;
        }
        return Math.max(fMax, tMax);
    }
}