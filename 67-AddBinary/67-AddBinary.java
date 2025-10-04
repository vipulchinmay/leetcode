// Last updated: 04/10/2025, 15:54:24
class Solution {
    public String addBinary(String a, String b) {
        int n = a.length();
        int m = b.length();
        int i = n-1;
        int j = m-1;
        StringBuilder s = new StringBuilder();
        int carry = 0;
        while(i>=0||j>=0||carry>0){
            int sum = carry;
            if(i>=0){
                sum+=a.charAt(i--) - '0';
            }
            if(j>=0){
                sum+=b.charAt(j--) - '0';
            }
            s.append(sum%2);
            carry = sum/2;
        }
        return s.reverse().toString();
    }
}