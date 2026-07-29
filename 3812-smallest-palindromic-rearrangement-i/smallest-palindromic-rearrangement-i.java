class Solution {
    public String smallestPalindrome(String s) {
        if(s.length() <= 1) return s;
        int arr[] = new int[26];
        for(char c : s.toCharArray()){
            arr[c-'a']++;
        }
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String mid = "";
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            while(arr[i] >= 2){
                sb1.append(ch);
                arr[i]--;
                sb2.append(ch);
                arr[i]--;
            }
            if(arr[i] == 1) mid = String.valueOf(ch);
        }
        return sb1.toString() + mid + sb2.reverse().toString();
    }
}