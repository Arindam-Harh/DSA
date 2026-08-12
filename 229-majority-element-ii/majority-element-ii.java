class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        int count = 1;
        for(int i=0;i<n-1;i++){
            if(nums[i] == nums[i+1]){
                count += 1;
            }else{
                if(count*3 > n) list.add(nums[i]);
                count = 1;
            }
        }
        if(count*3 > n) list.add(nums[n-1]);
        return list;
    }
}