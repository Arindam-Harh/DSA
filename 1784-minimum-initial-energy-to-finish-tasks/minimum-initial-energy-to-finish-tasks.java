class Solution {
    public int minimumEffort(int[][] tasks) {
        int n = tasks.length;
        Arrays.sort(tasks, (a, b) -> Integer.compare(
                (b[1] - b[0]),
                (a[1] - a[0])));
        int ans = 0;
        int cur = 0;
        for(int i=0;i<n;i++){
            if(cur < tasks[i][1]){ // selecting the highest initial energy
                ans += tasks[i][1] - cur;
                cur = tasks[i][1];
            }
            cur -= tasks[i][0]; // Minimum energy is used
        }
        return ans;
    }
}