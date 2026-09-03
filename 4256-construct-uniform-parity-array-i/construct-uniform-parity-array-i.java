class Solution {
    public boolean uniformArray(int[] nums1) {
        // logic : we have any two cases
        // 1. either all values are even or odd in that case we dont have do anything
        // 2. if the array contains both even and odd, then we can make odd by subtracting even or odd. Therefore, the array can be made always uniform by making all the elements odd.
        // so the answer will always be true.
        return true;
    }
}