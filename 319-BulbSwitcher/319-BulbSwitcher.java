// Last updated: 04/10/2025, 15:53:05
class Solution {
    public int bulbSwitch(int n) {
        int count = 0;
        int i = 1;
        while(i*i<=n){
            count+=1;
            i++;
        }
        return count;
    }
}