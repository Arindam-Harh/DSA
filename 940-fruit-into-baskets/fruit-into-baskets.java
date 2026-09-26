class Solution {
    public int totalFruit(int[] fruits) {
        if(fruits.length <= 1) return fruits.length;
        int freq[][] = new int[2][2];
        int j = 0;
        freq[0][0] = fruits[0];
        freq[0][1]++;
        while(j+1 < fruits.length && fruits[j] == fruits[j+1]){
            freq[0][0] = fruits[0];
            freq[0][1]++;
            j++;
        }
        if(j < fruits.length-1){
            freq[1][0] = fruits[j+1];
            freq[1][1] = 1;
        }else return freq[0][1];
        int count = freq[0][1] + freq[1][1];
        int maxCount = count;
        int last = 1;
        int lastFruit = freq[1][0];
        for(int i=j+2;i<fruits.length;i++){
            int e = fruits[i];
            if(e == freq[0][0] || e == freq[1][0]) {
                if(e == freq[0][0]) freq[0][1]++;
                else freq[1][1]++;
                if(e == lastFruit) last++;
                else{
                    lastFruit = e;
                    last = 1;
                }
                count++;
                maxCount = Math.max(count, maxCount);
            }else {
                count = last + 1;
                if (freq[0][0] == lastFruit) {
                    freq[0][1] = last;
                    freq[1][0] = e;
                    freq[1][1] = 1;
                } else {
                    freq[1][1] = last;
                    freq[0][0] = e;
                    freq[0][1] = 1;
                }
                lastFruit = e;
                last = 1;
            }
        }
        return maxCount;
    }
}