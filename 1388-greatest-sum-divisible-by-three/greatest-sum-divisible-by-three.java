class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int minA = Integer.MAX_VALUE, minB = Integer.MAX_VALUE;

        int N = nums.length;

        for (int i = 0; i < N; i++) {
            int x = nums[i];
            sum += x;

            int rem = x % 3;

            if (rem == 1) {
                if (x < min1) {
                    min2 = min1;
                    min1 = x;
                } else if (x < min2) {
                    min2 = x;
                }
            } else if (rem == 2) {
                if (x < minA) {
                    minB = minA;
                    minA = x;
                } else if (x < minB) {
                    minB = x;
                }
            }
        }

        int r = sum % 3;

        if (r == 0) return sum;

        if (r == 1) {
            int remove1 = min1;
            int remove2 = (minA == Integer.MAX_VALUE || minB == Integer.MAX_VALUE)
                          ? Integer.MAX_VALUE
                          : minA + minB;
            return sum - Math.min(remove1, remove2);
        }

        int remove1 = minA;
        int remove2 = (min1 == Integer.MAX_VALUE || min2 == Integer.MAX_VALUE)
                      ? Integer.MAX_VALUE
                      : min1 + min2;

        return sum - Math.min(remove1, remove2);
    }
}