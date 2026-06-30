class Solution {
    public String getSmallestString(int n, int k) {
        char arr[] = new char[n];
        while(n > 0){
            if(k - (n-1) < 26){
                char ch = (char)('a' + k - n);
                k = k - (ch - 'a' + 1);
                arr[n-1] = ch;
            }else{
                arr[n-1] = 'z';
                k = k - 26;
            }
            n--;
        }
        return new String(arr);
    }
}