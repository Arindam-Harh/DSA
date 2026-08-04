class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        for (int n : nums) {
            set.add(n);
        }
        for (int i = min; i < max; i++) {
            if (!set.contains(i))
                list.add(i);
        }
        return list;
    }
}