class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] arr = sentence.split(" ");
        dictionary.sort((a, b) -> a.length() - b.length());
        for(int i=0;i<arr.length;i++){
            for(String s : dictionary){
                int j = 0;
                boolean temp = true;
                while(j < s.length() && j < arr[i].length()){
                    if(s.charAt(j) != arr[i].charAt(j)){
                        temp = false;
                        break;
                    }
                    j++;
                }
                if(temp && s.length() <= arr[i].length()) {
                    arr[i] = s;
                    break;
                }
            }
        }
        String str = String.join(" ", arr);
        return str;
    }
}