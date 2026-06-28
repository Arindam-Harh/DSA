class Solution {
    public int maximumSwap(int num) {
        int arr[] = new int[10];
        int n = num;
        int k = 0;
        while (n > 0) {
            int r = n % 10;
            arr[k++] = r;
            n /= 10;
        }
        int left = 0;
        int right = k - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        int rightSwap = k - 1;
        int leftSwap = k - 1;
        int maxIndex = k-1;
        for(int i=k-2;i>=0;i--){
            if(arr[maxIndex] < arr[i]){
                maxIndex = i;
            }
            if(arr[i] < arr[maxIndex]){
                leftSwap = i;
                rightSwap = maxIndex;
            }
        }
        int t = arr[rightSwap];
        arr[rightSwap] = arr[leftSwap];
        arr[leftSwap] = t;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum * 10 + arr[i];
        }
        return sum;
    }
}