class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum = 0;
        int windowSum = 0;
        int ans = 0;
        int value = 0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i] == 0) ans += customers[i];
        }
        if(customers.length < minutes) return 0;
        for(int i=0;i<minutes;i++){
            if(grumpy[i] == 0) windowSum += customers[i];
            sum += customers[i];
            value = Math.max(value, sum - windowSum);
        }
        for(int i=1;i+minutes<=customers.length;i++){
            if(grumpy[i+minutes-1] == 0) windowSum += customers[i+minutes-1];
            if(grumpy[i-1] == 0) windowSum -= customers[i-1];
            sum += customers[i+minutes-1] - customers[i-1];
            value = Math.max(value, sum - windowSum);
        }
        return ans + value;
    }
}