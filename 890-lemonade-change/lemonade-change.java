class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(int n : bills){
            if(n == 5) five++;
            else if(n == 10){
                ten++;
                if(five >= 1) five--;
                else return false;
            }else{
                if(ten >= 1 && five >=1){
                    five--;
                    ten--;
                }else if(five >= 3){
                    five -= 3;
                }else return false;
            }
        }
        return true;
    }
}