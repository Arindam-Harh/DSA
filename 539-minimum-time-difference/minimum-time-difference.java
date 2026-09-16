class Solution {
    public int findMinDifference(List<String> timePoints) {
        int minutes[] = new int[timePoints.size()];
        int j = 0;
        for(String s : timePoints){
            minutes[j++] = convertToDecimal(s);
        }
        Arrays.sort(minutes);
        int n = minutes.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(i+1 == n){
                min = Math.min(1440 - minutes[i] + minutes[0], min);
            }else min = Math.min(min, Math.abs(minutes[(i+1)%n]-minutes[i]));
        }
        return min;
    }
    private int convertToDecimal(String s){
        String[] str = s.split(":");
        int i = Integer.parseInt(str[0]);
        int p = Integer.parseInt(str[1]);
        return i*60 + p;
    }
}