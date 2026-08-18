class Solution {
    public int minOperations(String s) {
        int n = s.length();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        boolean alt = true;
        while(sb1.length() < n){
            if(alt){
                sb1.append("1");
                sb2.append("0");
                alt = false;
            }else{
                sb1.append("0");
                sb2.append("1");
                alt = true;
            }
        }
        String str1 = sb1.toString();
        String str2 = sb2.toString();
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) != str1.charAt(i)) count1++;
            if(s.charAt(i) != str2.charAt(i)) count2++;
        }
        return Math.min(count1, count2);
    }
}