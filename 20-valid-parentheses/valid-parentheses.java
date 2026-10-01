class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        String opening = "({[";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (opening.indexOf(ch) != -1) {
                st.push(ch);
            } else {
                if (st.size() == 0)
                    return false;
                char top = st.peek();
                if (ch == ')' && top == '(' || ch == '}' && top == '{' || ch == ']' && top == '[') {
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.size() == 0;
        
    }
}