// Last updated: 04/10/2025, 15:49:48
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        // Arrays.sort(fruits);
        // Arrays.sort(baskets);
        boolean[] vis = new boolean[baskets.length];
        int count = 0;
        for(int i=0;i<fruits.length;i++){
            boolean placed = false;
            for(int j=0;j<baskets.length;j++){
                if(!vis[j] && baskets[j]>=fruits[i]){
                    vis[j] = true;
                    placed = true;
                    break;
                }
            }
            if(!placed){
                count++;
            }
        }
        return count;
    }
}