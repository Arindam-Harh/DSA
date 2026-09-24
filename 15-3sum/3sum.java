class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int l = i+1;
            int r = nums.length-1;
            while(l < r){
            List<Integer> list = new ArrayList<>();
            int sum = nums[i] + nums[l] + nums[r];
            if(sum == 0){
                list.add(nums[i]);
                list.add(nums[l]);
                list.add(nums[r]);
                l++;r--;
                ans.add(list);
                // if(!set.contains(list)) ans.add(list);
                // set.add(list);
                while(l < r && nums[l] == nums[l - 1]){
                    l++;
                }
                while(l < r && nums[r] == nums[r + 1]){
                    r--;
                }
            }else if(sum < 0){
                l++;
            }else {
                r--;
            }
        }
        }
        return ans;
    }
}