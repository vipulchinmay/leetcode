// Last updated: 04/10/2025, 15:50:03
class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int nc = 0;
        int pc = 0;
        for(int i:nums){
            if(i<0){
                nc++;
            }
            else if(i>0){
                pc++;
            }
        }
        return Math.max(nc,pc);
    }
}