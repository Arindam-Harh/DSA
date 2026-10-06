class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (st.size() == 0 || c == '(') {
                st.push(c);
            } else {
                if (st.size() > 0 && st.peek() == '(')  st.pop();
                else st.push(c);
            }
        }
        return st.size();
    }
}