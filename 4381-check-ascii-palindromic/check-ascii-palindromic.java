class Solution {

    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            sb.append(String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0'));
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}