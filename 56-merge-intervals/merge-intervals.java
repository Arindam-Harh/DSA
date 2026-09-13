class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return intervals;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int f = intervals[0][0];
        int s = intervals[0][1];
        int i = 1;
        while(i < intervals.length){
            if(intervals[i][0] <= s){
                while(i < intervals.length && intervals[i][0] <= s){
                    s = Math.max(s, intervals[i][1]);
                    i++;
                }
                result.add(new int[]{f, s});
            }else{
                result.add(new int[]{f, s});
            }
            if(i == intervals.length) break;
            f = intervals[i][0];
            s = intervals[i][1];
        }
        int[][] ans = result.toArray(new int[result.size()][]);
        return ans;
    }
}