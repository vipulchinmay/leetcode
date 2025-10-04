// Last updated: 04/10/2025, 15:51:55
class Solution {
    public int numFriendRequests(int[] ages) {
        int[] count = new int[121];
        for (int age : ages){
            count[age]++;
        }

        int total = 0;
        for (int a = 1; a <= 120; a++) {
            if (count[a] == 0){
                continue;
            }
            for (int b = 1; b <= 120; b++) {
                if (count[b] == 0){
                    continue;
                }
                if (b <= 0.5 * a + 7){
                    continue;
                }
                if (b > a){
                    continue;
                }
                if (b > 100 && a < 100){
                    continue;
                }
                total += count[a] * count[b];
                if (a == b){
                    total -= count[a]; 
                }
            }
        }
        return total;
    }
}
