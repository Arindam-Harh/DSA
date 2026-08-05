class Solution {
    public String getPermutation(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        StringBuilder sb = new StringBuilder();
        k--;
        int fact = factorial(n-1);
        while(!list.isEmpty()){
            int index = k / fact;
            k = k % fact;
            sb.append(list.get(index));
            list.remove(index);
            if (list.isEmpty()) break;
            fact = fact / list.size();
            n--;
        }
        return sb.toString();
    }
    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}


// Reference :

    // int s = 0;
    // index = 1;
    // while (s < k) {
    //     s += fact;
    //     index++;
    // }