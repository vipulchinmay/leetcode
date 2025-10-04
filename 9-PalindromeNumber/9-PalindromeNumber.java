// Last updated: 04/10/2025, 15:55:14
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int m = x;
        int n = 0;
        while(x>0){
            int d = x%10;
            n = n*10 + d;
            x = x/10;
        }
        return n == m;
    }
}