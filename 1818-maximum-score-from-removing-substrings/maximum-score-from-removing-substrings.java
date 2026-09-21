class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> st = new Stack<>();
        char a = 'a';
        char b = 'b';
        if(x < y) {
            a = 'b';
            b = 'a';
        }
        int max = Math.max(x, y);
        int min = Math.min(x, y);
        int score = 0;
        for(char c : s.toCharArray()){
            if(st.isEmpty()) st.push(c);
            else if(st.peek() == a && c == b){
                st.pop();
                score += max;
            }else st.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        s = sb.reverse().toString();
        for(char c : s.toCharArray()){
            if(st.isEmpty()) st.push(c);
            else if(st.peek() == b && c == a){
                st.pop();
                score += min;
            }else st.push(c);
        }
        return score;
    }
}