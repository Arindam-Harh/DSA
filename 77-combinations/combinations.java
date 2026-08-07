class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        combinations(1, new ArrayList<>(), n, k, ans);
        return ans;
    }
    static void combinations(int start, List<Integer> p, int n, int size, List<List<Integer>> ans){
        if(p.size() == size ){
            List<Integer> list = new ArrayList<>(p);
            ans.add(list);
            return;
        }
        for(int i=start;i<=n;i++){
            p.add(i);
            combinations(i+1, p, n, size, ans);
            p.remove(p.size()-1);
        }
    }
}