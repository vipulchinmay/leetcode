// Last updated: 04/10/2025, 15:51:06
class Solution {
    int count = 0;

    public int findNumbers(int[] nums) {
        for (int n : nums) {
            int cnt = 0;
            while (n > 0) {
                int rem = n % 10;
                cnt++;
                n = n / 10;
            }
            if (cnt % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}