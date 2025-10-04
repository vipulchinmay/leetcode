// Last updated: 04/10/2025, 15:54:26
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int dg[] = new int[n+1];
        dg[0] = 1;
        return  dg;
    }
}