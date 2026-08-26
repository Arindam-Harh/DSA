class Solution {
    public long smallestNumber(long num) {
        if(num == 0) return 0;
        List<Long> list = new ArrayList<>();
        char sig = '+';
        if(num < 0){
            sig = '-';
            num = -num;
        }
        while(num > 0){
            long r = num % 10;
            list.add(r);
            num /= 10;
        }
        long sum = 0;
        if(sig == '-'){
            Collections.sort(list, Collections.reverseOrder());
            for(int i=0;i<list.size();i++){
                sum = sum*10 + list.get(i);
            }
            sum = -sum;
        }else{
            Collections.sort(list);
            int i = 0;
            int zero = 0;
            while(list.get(i) == 0){
                zero++;
                i++;
            }
            sum = list.get(i);
            while(zero != 0){
                sum = sum*10 + 0;
                zero--;
            }
            for(int j=i+1;j<list.size();j++){
                sum = sum*10 + list.get(j);
            }
        }
        return sum;
    }
}