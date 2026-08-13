class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        combinations(1, new ArrayList<>(), n, k, ans);
        return ans;
    }
    static void combinations(int start, List<Integer> p, int n, int k, List<List<Integer>> ans){
        if(n < 0) return;
        if(p.size() == k){
            if(n == 0) ans.add(new ArrayList<>(p));
            return;
        }
        for(int i=start;i<=9;i++){
            p.add(i);
            combinations(i+1, p, n-i, k, ans);
            p.remove(p.size()-1);
        }
    }
}