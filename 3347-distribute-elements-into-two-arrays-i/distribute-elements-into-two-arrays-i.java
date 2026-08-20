class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            if(arr1.isEmpty()) arr1.add(nums[i]);
            else if(!arr2.isEmpty() && arr1.get(arr1.size()-1) > arr2.get(arr2.size() - 1)) arr1.add(nums[i]);
            else if(arr2.isEmpty()) arr2.add(nums[i]);
            else arr2.add(nums[i]);
            i++;
        }
        arr1.addAll(arr2);
        for(i=0;i<nums.length;i++){
            nums[i] = arr1.get(i);
        }
        return nums;
    }
}