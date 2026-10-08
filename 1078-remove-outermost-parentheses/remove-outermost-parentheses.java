class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        int i = 0;
        int j = 1;
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> set = new HashSet<>();
        while(j < s.length()){
            if(s.charAt(i) == '(' && count == 0) count++;
            if(s.charAt(j) == ')' && count == 1) {
                set.add(i);
                set.add(j);
                count--;
                if(j < s.length() - 1) {
                    i = j+1;
                    j = i;
                }
            }else if(s.charAt(j) == '(') count++;
            else if(s.charAt(j) == ')') count--;
            j++;
        }
        for(i=0;i<s.length();i++){
            if(!set.contains(i)) sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}