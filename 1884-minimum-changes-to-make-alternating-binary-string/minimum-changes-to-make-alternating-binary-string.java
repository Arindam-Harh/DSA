class Solution {
    public int minOperations(String s) {
        boolean alt = true;
        int count1 = 0;
        int count2 = 0;
        int i = 0;
        while(i < s.length()){
            if(alt){
                if(s.charAt(i) != '1') count1++;
                if(s.charAt(i) != '0') count2++;
                alt = false;
            }else{
                if(s.charAt(i) != '0') count1++;
                if(s.charAt(i) != '1') count2++;
                alt = true;
            }
            i++;
        }
        return Math.min(count1, count2);
    }
}