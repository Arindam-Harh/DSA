class Solution {
    public List<Integer> grayCode(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        codes("", n, list, false);
        return list;
    }
    static void codes(String s, int n, List<Integer> list, boolean reverse){
        if(n == 0){
            int x = Integer.parseInt(s, 2);
            list.add(x);
            return;
        }
        if(!reverse){
            codes(s+"0", n-1, list, false);
            codes(s+"1", n-1, list, true);
        }else{
            codes(s+"1", n-1, list, false);
            codes(s+"0", n-1, list, true);
        }
    }
}