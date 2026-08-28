class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        int[] available = new int[n];
        for(int i=0;i<n;i++){
            available[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(available);
        for(int i=0;i<n && additionalRocks>0;i++){
            if(additionalRocks >= available[i]){
                additionalRocks -= available[i];
                available[i] = 0;
            }else break;
        }
        int count = 0;
        for(int i=0;i<n;i++){
            if(available[i] == 0) count++;
        }
        return count;
    }
}