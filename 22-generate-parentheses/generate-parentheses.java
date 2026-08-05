class Solution {
    public List<String> generateParenthesis(int n) {
        return parenthesis(n, n*2, "", 0, 0);
    }
    static List<String> parenthesis(int limit, int n, String p, int open, int close){
        if(n == 0){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> l = new ArrayList();
        if(open < limit){
            List<String> l1 = parenthesis(limit, n-1, p + '(', open+1, close);
            l.addAll(l1);
        }
        if(open > close){
            List<String> l2 = parenthesis(limit, n-1, p + ')', open, close+1);
            l.addAll(l2);
        }
        return l;
    }
}