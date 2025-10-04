// Last updated: 04/10/2025, 15:50:24
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }

        List<Integer> res = new ArrayList<>();

        for (int num = 100; num <= 999; num++) {
            if (num % 2 != 0) continue; 

            int a = num / 100;
            int b = (num / 10) % 10;
            int c = num % 10;

            freq[a]--; freq[b]--; freq[c]--;
            if (freq[a] >= 0 && freq[b] >= 0 && freq[c] >= 0) {
                res.add(num);
            }
            freq[a]++; freq[b]++; freq[c]++; 
        }

        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }

        return ans;
    }
}
