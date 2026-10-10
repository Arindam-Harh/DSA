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
            for(int j=0;j<w.length;j++){
                if(q[i] < w[j]) res[i]++;
            }
        }
        return res;
    }
    private int countFreq(String s){
        int freq[] = new int[26];
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        for(int count : freq){
            if(count > 0) return count;
        }
        return 0;
    }
}