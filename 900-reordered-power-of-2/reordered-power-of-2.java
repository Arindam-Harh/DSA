class Solution {
    public boolean reorderedPowerOf2(int n) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        while(n > 0){
            int r = n%10;
            list.add(r);
            n /= 10;
        }
        fun(new ArrayList<>(), list, ans);
        for(int i=0;i<ans.size();i++){
            n = ans.get(i);
            if(n > 0 && (n & (n - 1)) == 0) return true;
        }
        return false;
    }
    static void fun(List<Integer> p, List<Integer> up, List<Integer> ans){
        if(up.isEmpty()){
            if(p.get(0) != 0) ans.add(toNumber(p));
            return;
        }
        int e = up.get(0);
        for(int i=0;i<=p.size();i++){
            List<Integer> newList = new ArrayList<>(p);
            newList.add(i, e);
            fun(newList, up.subList(1, up.size()), ans);
        } 
    }
    static int toNumber(List<Integer> list) {
        int num = 0;
        for (int x : list) {
            num = num * 10 + x;
        }
        return num;
    }
}