class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<Integer>();
        combinations(1, list, n, k, ans);
        return ans;
    }
    static void combinations(int start, List<Integer> p, int n, int size, List<List<Integer>> ans){
        if(p.size() == size ){
            List<Integer> list = new ArrayList<>(p);
            ans.add(list);
            return;
        }
        if(start <= n){
            for(int i=start;i<=n;i++){
                p.add(i);
                combinations(i+1, p, n, size, ans);
                p.remove(p.size()-1);
            }
        }
    }
}