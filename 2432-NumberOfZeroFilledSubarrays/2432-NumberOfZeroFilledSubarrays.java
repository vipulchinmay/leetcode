// Last updated: 04/10/2025, 15:50:07
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long consecutive = 0;
        for(int n : nums){
            if(n == 0){
                consecutive++;
                count+=consecutive;
            }
            else{
                consecutive = 0;
            }
        }
        return count;
    }
}