class Solution {
    public List<String> printVertically(String s) {
        List<String> list = new ArrayList<>();
        String[] arr = s.trim().split("\\s+");
        int l = 0;
        for(String str : arr){
            l = Math.max(l, str.length());
        }
        for(int i=0;i<l;i++){
            StringBuilder sb = new StringBuilder(l);
            for(String str : arr){
                if(i < str.length()) sb.append(str.charAt(i));
                else sb.append(" ");
            }
            list.add(sb.toString().stripTrailing());
        }
        return list;
    }
}