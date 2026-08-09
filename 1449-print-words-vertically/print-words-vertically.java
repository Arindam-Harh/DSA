class Solution {
    public List<String> printVertically(String s) {
        List<String> list = new ArrayList<>();
        String[] arr = s.trim().split("\\s+");
        int l = 0;
        for(String str : arr){
            l = Math.max(l, str.length());
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<l;i++){
            for(String str : arr){
                if(i < str.length()){
                    sb.append(str.charAt(i));
                }else{
                    sb.append(" ");
                }
            }
            list.add(sb.toString().stripTrailing());
            sb.setLength(0);
        }
        return list;
    }
}