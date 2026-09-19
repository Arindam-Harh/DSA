class Solution {
    public int minSetSize(int[] arr) {
        int l = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : arr){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        int m = map.size();
        if(m == 1) return 1;
        int a[][] = new int[m][2];
        int i = 0;
        for(var entry : map.entrySet()){
            a[i][0] = entry.getKey();
            a[i][1] = entry.getValue();
            i++;
        }
        Arrays.sort(a, (x, y) -> Integer.compare(x[1], y[1]));
        int j = m-1;
        int count = 0;
        while(j > 0){
            l -= a[j--][1];
            count++;
            if(l <= arr.length/2) return count;
        }
        return -1;
    }
}