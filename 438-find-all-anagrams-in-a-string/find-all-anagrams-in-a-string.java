class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int l = p.length();
        if(n < l) return  new ArrayList<>();
        p = sorted(p);
        List<Integer> idx = new ArrayList<>();
        for(int i=0;i<=n-l;i++){
            String str = s.substring(i, i+l);
            if(p.equals(sorted(str))) idx.add(i);
        }
        return idx;
    }
    static String sorted(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}