// Last updated: 04/10/2025, 15:50:22
class Solution {
    public long getDescentPeriods(int[] prices) {
        if(prices.length == 1){
            return 1;
        }
        long curr = 1;
        long count = 1;
        for(int i=1;i<prices.length;i++){
            if(prices[i-1] - prices[i] == 1){
                curr++;
            }
            else{
                curr = 1;
            }
            count+=curr;
        }
        return count;
    }
}