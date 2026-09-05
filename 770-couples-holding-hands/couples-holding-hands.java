class Solution {
    public int minSwapsCouples(int[] row) {
        int n = row.length;
        int swap = 0;
        for(int i=0;i<n-2;i+=2){
            int partner = row[i]^1;
            if(row[i+1] != partner){
                for(int j=i+1;j<n;j++){
                    if(row[j] == partner){
                        swap++;
                        int temp = row[i+1];
                        row[i+1] = row[j];
                        row[j] = temp;
                        break;
                    }
                }
            }
        }
        return swap;
    }
}