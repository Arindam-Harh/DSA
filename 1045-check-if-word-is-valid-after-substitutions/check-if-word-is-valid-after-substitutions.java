class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == 'c'){
                if(st.size() < 2) return false;
                else if(st.peek() == 'b'){
                    st.pop();
                    if(st.peek() == 'a')  st.pop();
                    else return false;
                } else return false;
            }else st.push(c);
        }
        return st.isEmpty();
    }
}