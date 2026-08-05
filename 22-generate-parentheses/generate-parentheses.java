class Solution {
    public List<String> generateParenthesis(int n) {
        return parenthesis1(n, n*2, "", 0, 0);
        // return parenthesis2(n, "", 0, 0);
    }
    static List<String> parenthesis1(int limit, int n, String p, int open, int close){
        if(n == 0){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> l = new ArrayList<>();
        if(open < limit){
            List<String> l1 = parenthesis1(limit, n-1, p + '(', open+1, close);
            l.addAll(l1);
        }
        if(open > close){
            List<String> l2 = parenthesis1(limit, n-1, p + ')', open, close+1);
            l.addAll(l2);
        }
        return l;
    }
    static List<String> parenthesis2(int limit, String p, int open, int close){
        if(open == limit && close == limit){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> l = new ArrayList<>();
        if(open < limit){
            List<String> l1 = parenthesis2(limit, p + '(', open+1, close);
            l.addAll(l1);
        }
        if(open > close){
            List<String> l2 = parenthesis2(limit, p + ')', open, close+1);
            l.addAll(l2);
        }
        return l;
    }
}