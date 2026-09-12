class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();
        int j = 0;
        while(j < s.length()){
            char c = s.charAt(j);
            int max = s.lastIndexOf(c) + 1;
            for(int i=j;i<max;i++){
                if(c != s.charAt(i)){
                    max = Math.max(max, s.lastIndexOf(s.charAt(i))+1);
                }
            }
            list.add(max-j);
            j = max;
        }
        return list;
    }
}