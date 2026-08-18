class Solution {
    public int minOperations(String s) {
        boolean alt = true;
        int count1 = 0;
        int count2 = 0;
        for(char ch : s.toCharArray()){
            if(alt){
                if(ch != '1') count1++;
                if(ch != '0') count2++;
                alt = false;
            }else{
                if(ch != '0') count1++;
                if(ch != '1') count2++;
                alt = true;
            }
        }
        return Math.min(count1, count2);
    }
}