class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=9;i++){
            fun(i, n, list);
        }
        return list;
    }
    static void fun(int curr, int high,  List<Integer> list){
        dfs(curr, high, list);
    }
    static void dfs(int curr, int high, List<Integer> list){
        if(curr > high) return;
        list.add(curr);
        for(int digit=0;digit<=9;digit++){
            int next = curr*10 + digit;
            dfs(next,  high, list);
        }
    }
}