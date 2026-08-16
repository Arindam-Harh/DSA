class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        int i = 0;
        int j = n-1;
        if(n%2 != 0) arr[n/2] = 0;
        while( i < j){
            arr[i++] = n;
            arr[j--] = -n;
            n--;
        }
        return arr;
    }
}