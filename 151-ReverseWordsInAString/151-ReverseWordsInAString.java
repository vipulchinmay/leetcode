// Last updated: 04/10/2025, 15:53:59
class Solution {
    public String reverseWords(String s) {
        String words[] = s.split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]+" ");
        }
        return sb.toString().trim();
    }
}