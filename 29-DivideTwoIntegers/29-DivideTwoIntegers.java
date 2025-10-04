// Last updated: 04/10/2025, 15:54:55
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
           return Integer.MAX_VALUE;
        }
        return dividend / divisor;
    }
}