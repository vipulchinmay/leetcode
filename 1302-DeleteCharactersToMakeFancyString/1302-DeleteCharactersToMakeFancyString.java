// Last updated: 04/10/2025, 15:51:15
class Solution {
    public String makeFancyString(String s) {
        int n = s.length();
        int count = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for(int i=1;i<n;i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
            else{
                count = 1;
            }
            if(count < 3){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }   
}