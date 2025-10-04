// Last updated: 04/10/2025, 15:49:57
class Solution {
    public int minimumPushes(String word) {
        int total = 0;
        int group = 0;
        int presses = 1;
        for(int i=0;i<word.length();i++){
            total += presses;
            group++;
            if(group == 8){
                presses++;
                group = 0;
            }
        }
        return total;
    }
}