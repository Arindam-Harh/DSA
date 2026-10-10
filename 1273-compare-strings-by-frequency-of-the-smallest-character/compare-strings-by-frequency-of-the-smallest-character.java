class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int q[] = new int[queries.length];
        int w[] = new int[words.length];
        for(int i=0;i<queries.length;i++){
            q[i] = countFreq(queries[i]);
        }
        for(int i=0;i<words.length;i++){
            w[i] = countFreq(words[i]);
        }
        int res[] = new int[q.length];
        for(int i=0;i<q.length;i++){
            int count = 0;
            for(int j=0;j<w.length;j++){
                if(q[i] < w[j]) count++;
            }
            res[i] = count;
        }
        return res;
    }
    private int countFreq(String s){
        if(s.length() <= 1) return s.length();
        int freq[] = new int[26];
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i] >= 1) return freq[i];
        }
        return -1;
    }
}