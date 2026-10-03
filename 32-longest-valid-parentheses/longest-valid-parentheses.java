class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(st.isEmpty()) st.push(i);
            else if(s.charAt(st.peek()) == '(' && c == ')') st.pop();
            else st.push(i);
        }
        if(st.isEmpty()) return s.length();
        int next = s.length() - 1;
        int curr = st.pop();
        int max = next - curr;
        next = curr;
        while(!st.isEmpty()){
            curr = st.pop();
            max = Math.max(max, next - curr - 1);
            next = curr;
        }
        curr = 0;
        max = Math.max(max, next - curr);
        return max;
    }
}