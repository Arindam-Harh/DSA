class Solution {
    public String smallestPalindrome(String s) {
        if(s.length() <= 1) return s;
        int arr[] = new int[26];
        for(char c : s.toCharArray()){
            arr[c-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        String mid = "";
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            while(arr[i] >= 2){
                sb.append(ch);
                arr[i] -= 2;
            }
            if(arr[i] == 1) mid = String.valueOf(ch);
        }
        return sb.toString() + mid + sb.reverse().toString();
    }
}