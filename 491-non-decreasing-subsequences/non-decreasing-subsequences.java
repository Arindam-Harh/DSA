class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        permute(0, new ArrayList<>(), nums, set);
        return new ArrayList<>(set);
    }
    static void permute(int start, List<Integer> p,int[] nums,HashSet<List<Integer>> set){
        if(start == nums.length){
            if(p.size() < 2) return;
            set.add(new ArrayList<>(p));
            return;
        }
        if (p.size() >= 2) set.add(new ArrayList<>(p));
        for(int i=start;i<nums.length;i++){
            int e = nums[i];
            if(p.size() > 0 && p.get(p.size()-1) > e) continue;
            p.add(e);
            permute(i+1, p, nums, set);
            p.remove(p.size()-1);
        }
        
    }
}