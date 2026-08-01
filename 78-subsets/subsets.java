class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        subset(nums, 0,  new ArrayList<>(), list);
        return list;
    }
    static void subset(int[] arr,int i, List<Integer> curr, List<List<Integer>> list){
        if(i == arr.length){
            list.add(new ArrayList<>(curr));
            return;
        }
        subset(arr, i+1, curr, list);
        curr.add(arr[i]);
        subset(arr, i+1, curr, list);
        curr.remove(curr.size() - 1);
    }
}