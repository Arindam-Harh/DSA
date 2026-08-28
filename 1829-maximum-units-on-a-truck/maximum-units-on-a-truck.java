class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int res = 0;
        int i = 0;
        while(truckSize > 0 && i < boxTypes.length){
            if(boxTypes[i][0] > 0){
                res += boxTypes[i][1];
                truckSize--;
                boxTypes[i][0]--;
            }else{
                i++;
            }
        }
        return res;
    }
}