class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0;
        int res = 0;
        for(String str : bank){
            int count = 0;
            for(char ch : str.toCharArray()){
                if(ch == '1') count++;
            }
            if(count == 0) continue;
            res += prev * count;
            prev = count;
        }
        return res;
    }
}