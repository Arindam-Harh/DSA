class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length%2 != 0) return new int[0];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int n : changed){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        int original[] = new int[changed.length/2];
        int i = 0;
        while(!map.isEmpty() ){
            int f = map.firstKey();
            int freq = map.get(f);
            if(map.containsKey(2*f)){
                if(f == 0 && freq < 2)return new int[0];
                map.put(2*f, map.get(2*f)-1);
                if(map.get(2*f) == 0) map.remove(2*f); 
                original[i++] = f;
            }else return new int[0];
            if(f == 0){
                map.put(f, freq-2);
                if(freq == 2) map.remove(f);
            } else{
                map.put(f, freq-1);
                if(freq == 1) map.remove(f);
            }
        }
        return original;
    }
}