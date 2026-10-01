class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int n : asteroids){
            if(st.isEmpty()) st.push(n);
            else if(st.peek() < 0) st.push(n);
            else if(n > 0) st.push(n);
            else if(st.peek() == -n) st.pop();
            else {
                int b = Math.abs(n);
                boolean collision = true;
                if(st.peek() < b) {
                    while(collision){
                        if(st.peek() < 0) {
                            st.push(-b);
                            collision = false;
                        }else if(st.peek() > b) {
                            collision = false;
                        }else if(st.peek() < b){
                            st.pop();
                            if(st.isEmpty()) {
                                st.push(n);
                                collision = false;
                            }
                        }else if(st.peek() == b) {
                            st.pop();
                            collision = false;
                        }
                    }
                }else if(st.peek() == -n) {
                    st.pop();
                    collision = false;
                }
            }
        }
        if(st.size() == 0) return new int[0];
        int arr[] = new int[st.size()];
        int i = st.size()-1;
        while(!st.isEmpty()){
            arr[i--] = st.pop();
        }
        return arr;
    }
}