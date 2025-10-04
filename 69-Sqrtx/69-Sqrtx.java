// Last updated: 04/10/2025, 15:54:23
class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        long guess = x;

        while (guess * guess > x) {
            guess = (guess + x / guess) / 2;
        }

        return (int) guess;
    }
}