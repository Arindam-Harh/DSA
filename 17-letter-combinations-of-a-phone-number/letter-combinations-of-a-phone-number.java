class Solution {
    public List<String> letterCombinations(String digits) {
        String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        return combinations("", digits, map);
    }
    static List<String> combinations(String p, String up, String[] map){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();
        int digit = up.charAt(0) -'0';
        String s = map[digit];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            ans.addAll(combinations(p + ch, up.substring(1), map));
        }
        return ans;
    }
}