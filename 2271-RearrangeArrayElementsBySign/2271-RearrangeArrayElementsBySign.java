// Last updated: 04/10/2025, 15:50:20
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int a[] = new int[n];
        int i=0;
        int j = 1;
        for(int k = 0;k<n;k++){
            if(nums[k]>=0){
                a[i] = nums[k];
                i+=2;
            }
            else{
                a[j] = nums[k];
                j+=2;
            }
        }
        return a;
    }
}