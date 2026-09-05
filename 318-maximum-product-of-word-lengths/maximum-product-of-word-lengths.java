class Solution {
    public int maxProduct(String[] words) {
        int res = 0;
        for(int i=0;i<words.length-1;i++){
            boolean a[] = new boolean[26];
            for(char c : words[i].toCharArray()){
                a[c-'a'] = true;
            }
            for(int j=i+1;j<words.length;j++){
                boolean common = false;
                for(char c : words[j].toCharArray()){
                    if(a[c-'a'] == true) {
                        common = true;
                        break;
                    }
                }
                if(!common) res = Math.max(res, words[i].length() * words[j].length());
            }
        }
        return res;
    }
}