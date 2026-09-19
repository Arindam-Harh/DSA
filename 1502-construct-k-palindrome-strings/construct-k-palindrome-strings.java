class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() == k) return true;
        if(s.length() < k) return false;
        int arr[] = new int[26];
        Arrays.fill(arr, -1);
        for(char c : s.toCharArray()){
            arr[c-'a'] = arr[c-'a'] == -1 ? 1 : arr[c-'a']+1;
        }
        int odd = 0;
        int even = 0;
        for(int i=0;i<26;i++){
            if(arr[i] != -1) {
                if(arr[i]%2 == 0) even++;
                else{
                    if(arr[i] >= 3) even += arr[i]/2;
                    odd++;
                }
            }
        }
        if(odd > k) return false;
        return true;
    }
}