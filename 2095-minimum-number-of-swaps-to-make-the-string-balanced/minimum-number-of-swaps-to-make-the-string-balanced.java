class Solution {
    public int minSwaps(String s) {
        int imbalance = 0;
        int open = 0;
        for(char c : s.toCharArray()){
            if(c == '[') open++;
            else if(open == 0 && c == ']') imbalance++;
            else open--;
        }
        return (imbalance+1)/2;
    }
}