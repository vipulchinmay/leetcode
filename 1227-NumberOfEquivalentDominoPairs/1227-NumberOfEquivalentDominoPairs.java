// Last updated: 04/10/2025, 15:51:19
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int n = dominoes.length;
        int count = 0;
        for(int i = 0;i<n;i++){
            int x = dominoes[i][0];
            int y = dominoes[i][1];
            for(int j = i+1;j<n;j++){
                int x1 = dominoes[j][0];
                int y1 = dominoes[j][1];
                if((x == x1 && y == y1) || (x == y1 && y == x1)){
                    count++;
                }
            }
        }
        return count;
    }
}