// Last updated: 04/10/2025, 15:53:12
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int i =0;
        List<Integer> res = new ArrayList<>();
        for(int k:nums){
            res.add(k);
        }
        for( i=0;i<=n;i++){
            if(!res.contains(i)){
                return i;
            }
        }
        return -1;

    }
}