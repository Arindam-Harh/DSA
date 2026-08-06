class Solution {
    public List<String> validStrings(int n) {
        return strings("", n);
    }
    static List<String> strings(String p, int n){
        if(n == 0){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();
        if(p.isEmpty() || p.charAt(p.length()-1) != '0'){
            ans.addAll(strings(p + '0', n-1));
        }
        ans.addAll(strings(p + '1', n-1));
        return ans;
    }
}