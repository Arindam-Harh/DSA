class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(nums[0]);
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(nums[1]);
        int i = 2;
        while(i < nums.length){
            if(arr1.get(arr1.size()-1) > arr2.get(arr2.size()-1)) arr1.add(nums[i]);
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