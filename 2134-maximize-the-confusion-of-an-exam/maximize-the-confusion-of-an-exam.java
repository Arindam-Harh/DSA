class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int l = 0;
        int r = 0;
        int tMax = 0;
        int f = 0;
        int fMax = 0;
        int t = 0;
        int left = 0;
        while(r < answerKey.length()){
            // for consecutive FALSE
            if(answerKey.charAt(r) == 'F') f++;
            if(f > k){
                if(answerKey.charAt(l) == 'F') f--;
                l++;
            }
            if(f <= k) tMax = r - l + 1;
            // for consecutive FALSE
            if(answerKey.charAt(r) == 'T') t++;
            if(t > k){
                if(answerKey.charAt(left) == 'T') t--;
                left++;
            }
            if(t <= k) fMax = r - left + 1;
            r++;
        }
        return Math.max(fMax, tMax);
    }
}