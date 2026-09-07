class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = queries.length;
        int prefix[] = new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            prefix[i+1] = prefix[i] ^ arr[i];
        }
        int res[] = new int[n];
        for(int i=0;i<n;i++){
            int a = queries[i][0];
            int b = queries[i][1];
            res[i] = prefix[b+1] ^ prefix[a];
        }
        return res;
    }
}