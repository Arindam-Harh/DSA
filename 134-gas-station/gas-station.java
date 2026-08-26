class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int idx = 0;
        int count = 0;
        int balance = 0;
        for(int i=0;i<n;i++){
            balance += gas[i] - cost[i];
            if(balance < 0){
                balance = 0;
                idx = i + 1;
            }
        }
        int total = 0;
        if(idx == n) return -1;
        while(count < n ){
            total += gas[idx] - cost[idx];
            int next = (idx+1)%n;
            if(total < 0) return -1;
            idx = next;
            count++;
        }
        return idx;
    }
}