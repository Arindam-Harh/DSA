class Solution {
    public List<String> generateParenthesis(int n) {
        return parenthesis(n, "", 0, 0);
    }
    static List<String> parenthesis(int limit, String p, int open, int close){
        if(open == limit && close == limit){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> l = new ArrayList<>();
        if(open < limit){
            List<String> l1 = parenthesis(limit, p + '(', open+1, close);
            l.addAll(l1);
        }
        if(open > close){
            List<String> l2 = parenthesis(limit, p + ')', open, close+1);
            l.addAll(l2);
        }
        return l;
    }
}