class Solution {
    public String frequencySort(String s) {
        char[] temp = s.toCharArray();
        Character[] arr = new Character[temp.length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
        int freq[] = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }
        Arrays.sort(arr, (a, b) -> {
            if (freq[b] != freq[a]) {
                return freq[b] - freq[a];
            }
            return a - b;
        });
        for (Character ch : arr) {
            sb.append(ch);
        }
        return sb.toString();
    }
}