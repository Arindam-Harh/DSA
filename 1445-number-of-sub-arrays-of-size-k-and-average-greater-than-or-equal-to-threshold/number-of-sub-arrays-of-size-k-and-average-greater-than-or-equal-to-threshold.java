class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        if(sum >= threshold*k) count++;
        for(int i=1;i+k<=arr.length;i++){
            sum += arr[i+k-1] - arr[i-1];
            if(sum >= threshold*k) count++;
        }
        return count;
    }
}