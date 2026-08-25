class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums) set.add(n);
        int i=1;
        while(i <= set.size()){
            if(!set.contains(i*k)) break;
            i++;
        }
        return i*k;
    }
}