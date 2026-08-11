class Solution {
    public int findSpecialInteger(int[] arr) {
        if(arr.length <= 3) return arr[0];
        int count = 1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]) count += 1;
            if(count * 4 > arr.length) return arr[i];
            if(arr[i] != arr[i+1]) count = 1;
        }
        return 0;
    }
}