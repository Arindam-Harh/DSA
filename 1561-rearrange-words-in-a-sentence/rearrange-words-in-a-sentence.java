class Solution {
    public String arrangeWords(String text) {
        String[] s = text.split(" ");
        Arrays.sort(s, (a, b) -> Integer.compare(a.length(), b.length()));
        for(int i=0;i<s.length;i++){
            if(i == 0) s[i] = Character.toUpperCase(s[i].charAt(0)) + s[i].substring(1);       
            else s[i] = Character.toLowerCase(s[i].charAt(0)) + s[i].substring(1);
        }
        return String.join(" ", s);
    }
}