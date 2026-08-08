class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        sum(0, new ArrayList<>(), target, candidates, ans);
        return ans;
    }
    static void sum(int start, List<Integer> p, int t, int[] c, List<List<Integer>> ans){
        if(t == 0){
            List<Integer> list = new ArrayList<>(p);
            ans.add(list);
            return;
        }
        for(int i=start;i<c.length;i++){
            if(t >= c[i]){
                p.add(c[i]);
                sum(i, p, t-c[i], c, ans);
                p.remove(p.size()-1);
            }
        }
    }
}