// Last updated: 04/10/2025, 15:53:56
class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int n:nums){
            min = Math.min(min,n);
        }
        return min;
    }
}