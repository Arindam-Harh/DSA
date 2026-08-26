class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] arr = new String[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
            arr[i] = String.valueOf(nums[i]);
        }
        if(sum == 0) return "0";
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if((arr[j]+arr[j+1]).compareTo(arr[j+1]+arr[j]) < 0){
                    String t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String s : arr){
            sb.append(s);
        }
        return sb.toString();
    }
}