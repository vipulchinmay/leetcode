// Last updated: 04/10/2025, 15:50:50
class Solution {
    public String makeGood(String s) {
        int n = s.length();
        if(n == 1){
            return s;
        }
        int i = 1;
        StringBuilder sb = new StringBuilder(s);
        while(i<sb.length()){
            char c = sb.charAt(i-1);
            char ch = sb.charAt(i);
            if(Math.abs(ch - c) == 32){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i-1);
                if(i>1){
                    i--;
                }
            }
            else{
                i++;
            }
        }
        return sb.toString();
    }
}