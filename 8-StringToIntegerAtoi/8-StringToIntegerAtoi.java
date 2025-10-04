// Last updated: 04/10/2025, 15:55:12
class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int result = 0;
        int sign = 1;
        int n = s.length();
        int i = 0;
        if(i<n){
            if(s.charAt(i) == '-'){
                sign = -1;
                i++;
            }
            else if(s.charAt(i) == '+'){
                i++;
            }
        }
        while(i<n && Character.isDigit(s.charAt(i))){
            if(result > (Integer.MAX_VALUE - (s.charAt(i)-'0'))/10){
                return (sign == 1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            result = result*10+(s.charAt(i)-'0');
            i++;
        }
        return result*sign;
    }
}