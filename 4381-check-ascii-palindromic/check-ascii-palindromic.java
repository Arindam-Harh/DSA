class Solution {
    public boolean isPalindromic(String s) {
        int n = s.length();
        int f = 0;
        int l = n-1;
        while(f <= l){
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            int c1 = (int)s.charAt(f);
            int c2 = (int)s.charAt(l);
            for(int i=1;i<=8;i++){
                sb1.append(c1%2);
                sb2.append(c2%2);
                c1 /= 2;
                c2 /= 2;
            }
            if(!sb1.toString().equals(sb2.reverse().toString())) return false;
            f++;l--;
        }
        return true;
    }
}