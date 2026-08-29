class Solution {
    public int scoreDifference(int[] nums) {
        int p1 = 0;
        int p2 = 0;
        boolean a1 = true;
        boolean a2 = false;
        int count = 0;
        for(int n : nums){
            count++;
            if(n%2 != 0){
                a1 = !a1;
                a2 = !a2;
            }
            if(count%6 == 0){
                a1 = !a1;
                a2 = !a2;
            }
            if(a1){
                p1 += n;
            }else{
                p2 += n;
            }
        }
        return p1 - p2;
    }
}