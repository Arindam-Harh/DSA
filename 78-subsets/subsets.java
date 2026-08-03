class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // List<List<Integer>> list = new ArrayList<>();
        // subset(nums, 0,  new ArrayList<>(), list);
        List<List<Integer>> list = subsetIte(nums);
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
    static List<List<Integer>> subsetIte(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : arr){
            int n = outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}