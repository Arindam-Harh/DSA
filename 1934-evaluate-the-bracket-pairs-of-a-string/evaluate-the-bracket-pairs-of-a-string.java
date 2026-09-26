class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        boolean isBraket = false;
        HashMap<String, String> map = new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '(') isBraket = true;
            else sb.append(c);
            if(isBraket){
                StringBuilder sub = new StringBuilder();
                i++;
                while(isBraket){
                    if(s.charAt(i) == ')') {
                        isBraket = false;
                        break;
                    }
                    sub.append(s.charAt(i));
                    i++;
                }
                String str = "?";
                if(map.containsKey(sub.toString())) str = map.get(sub.toString());
                sb.append(str);
            }
        }
        return sb.toString();
    }
}