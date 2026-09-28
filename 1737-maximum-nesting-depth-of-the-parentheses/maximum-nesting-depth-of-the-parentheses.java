class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int max = 0;
        for(char c : s.toCharArray()){
            if(c == '(') st.push(c);
            else if(c == ')'){
                max = Math.max(max, st.size());
                st.pop();
            }
        }
        return max;
    }
}