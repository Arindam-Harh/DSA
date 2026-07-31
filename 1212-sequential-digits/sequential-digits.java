class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        fun(low, high, list);
        Collections.sort(list);
        return list;
    }
    static void fun(int low, int high, List<Integer> list){
        for (int start = 1; start <= 9; start++) {
           helper(start, 0, low, high, list);
        }
    }
    static void helper(int digit, int sum, int low, int high, List<Integer> list){
        if (digit > 9) return;
        int next = sum * 10 + digit;
        if (next > high) return;
        if (next >= low) list.add(next);
        helper(digit + 1, next, low, high, list);
    }
}