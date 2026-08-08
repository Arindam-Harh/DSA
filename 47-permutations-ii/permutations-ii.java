class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        fun(new ArrayList<>(), list, ans);
        return ans;
    }
    static void fun(List<Integer> p, List<Integer> up, List<List<Integer>> ans){
        if(up.isEmpty()){
            ans.add(new ArrayList<>(p));
            return;
        }
        int e = up.get(0);
        for(int i=0;i<=p.size();i++){
            if(i > 0 && e == p.get(i-1)) break;
            List<Integer> newList = new ArrayList<>(p);
            newList.add(i, e);
            fun(newList, up.subList(1, up.size()), ans);
        } 
    }
}