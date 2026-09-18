class Solution {
    public String customSortString(String order, String s) {
        char res[] = new char[s.length()];
        int arr[] = new int[26];
        int i = 0;
        for(char ch : s.toCharArray()){
            arr[ch-'a']++;
        }
        for(char ch : order.toCharArray()){
            while(arr[ch-'a'] > 0){
                res[i++] = ch;
                arr[ch-'a']--;
            }
        }
        for(int j=0;j<26;j++){
            while(arr[j] > 0){
                res[i++] = (char)(j + 'a');
                arr[j]--;
            }
        }
        return new String(res);
    }
}