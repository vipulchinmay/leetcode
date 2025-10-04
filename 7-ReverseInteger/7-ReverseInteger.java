// Last updated: 04/10/2025, 15:55:16
class Solution {
    public int reverse(int n) {
        int res = 0;
        while (n != 0) {
            int digit = n % 10;
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && digit < -8)) return 0;

            res = res * 10 + digit;
            n /= 10;
        }
        return res;
    }
}
