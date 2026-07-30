class Solution {
    public int balancedStringSplit(String s) {
        int Rcount = 0;
        int Lcount = 0;
        int str = 0;
        if (s.charAt(0) == 'R') Rcount = 1;
        else Lcount = 1;
        if (Rcount == 1) {
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == 'R') Rcount++;
                else Rcount--;

                if (Rcount == 0) str++;
            }
        }else{
            for(int i=1;i<s.length();i++){
                if(s.charAt(i) == 'L') Lcount++;
                else Lcount--;

                if(Lcount == 0) str++;
            }   
        }
        return str;
    }
}