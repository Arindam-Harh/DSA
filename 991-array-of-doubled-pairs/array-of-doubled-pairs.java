class Solution {
    public boolean canReorderDoubled(int[] arr) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int n : arr){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        while(!map.isEmpty()){
            int f = map.firstKey();
            int freq = map.get(f);
            if(f < 0){
                if(f%2 != 0) return false;
                if(map.containsKey(f/2)){
                    map.put(f/2, map.get(f/2)-1);
                    if(map.get(f/2) == 0) map.remove(f/2);
                }else return false;
            }else{
                if(map.containsKey(f*2)){
                    map.put(f*2, map.get(f*2)-1);
                    if(map.get(f*2) == 0) map.remove(f*2);
                }else return false;
            }
            if(freq == 1) map.remove(f);
            else map.put(f, freq-1);
        }
        return true;
    }
}