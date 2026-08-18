class Solution {
    public int minOperations(String s) {
        int n = s.length();
        boolean alt = true;
        int count1 = 0;
        int count2 = 0;
        int i = 0;
        while(i < n){
            if(alt){
                if(s.charAt(i) != '0') count2++;
                if(s.charAt(i) != '1') count1++;
                alt = false;
            }else{
                if(s.charAt(i) != '1') count2++;
                if(s.charAt(i) != '0') count1++;
                alt = true;
            }
            i++;
        }
        return Math.min(count1, count2);
    }
}