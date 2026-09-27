class Solution {
    public String reverseParentheses(String s) {
        Stack<String> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == ')'){
                StringBuilder sb = new StringBuilder();
                while(!st.peek().equals("(")){
                    sb.append(st.pop());
                }
                st.pop();
                st.push(sb.reverse().toString());
            }else st.push(String.valueOf(c));
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}