class Solution {
    public List<String> letterCasePermutation(String s) {
        return permutations("", s);
    }
    static List<String> permutations(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        if(Character.isLetter(ch)){
            List<String> l1 = permutations(p + Character.toLowerCase(ch), up.substring(1));
            List<String> l2 = permutations(p + Character.toUpperCase(ch), up.substring(1));
            l1.addAll(l2);
            return l1;
        }
        return permutations(p + ch, up.substring(1));
    }
}