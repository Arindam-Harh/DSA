class Solution {
    public String arrangeWords(String text) {
        String[] s = text.split(" ");
        int n = s.length;
        HashMap<Integer, String> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i, s[i]);
        }
        int arr[][] = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = i;
            arr[i][1] = s[i].length();
        }
        Arrays.sort(arr, (a, b) ->  Integer.compare(a[1], b[1]));
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            String t = map.get(arr[i][0]);
            if(i == 0) t = Character.toUpperCase(t.charAt(0)) + t.substring(1);
            else t = Character.toLowerCase(t.charAt(0)) + t.substring(1);
            sb.append(t).append(" ");
        }
        return sb.toString().trim();
    }
}