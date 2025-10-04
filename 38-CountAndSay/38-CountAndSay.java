// Last updated: 04/10/2025, 15:54:47
class Solution {
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        String s = countAndSay(n-1);
        String res = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int count = 1;
            while(i < s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            res += Integer.toString(count) + ch;
        }
        return res;
    }
}