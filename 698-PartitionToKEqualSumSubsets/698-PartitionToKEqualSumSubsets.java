// Last updated: 04/10/2025, 15:52:19
class Solution {
    Set<List<Integer>> result = new HashSet<>();
    int n;
    public boolean canPartitionKSubsets(int[] nums, int k) {
        n = nums.length;
        int sum = 0;
        for(int i : nums){
            sum+=i;
        }
        if(sum %k != 0){
            return false;
        }
        boolean[] used = new boolean[n];
        return backtrack(0,nums,used,k,Math.abs(sum/k),0);
        
    }
    public boolean backtrack(int start,int[] nums,boolean used[],int k,int sum,int current){
        if(k == 1){
            return true;
        }
        if(current == sum){
            return backtrack(0,nums,used,k-1,sum,0);
        }
        for(int i=start;i<nums.length;i++){
            if(!used[i] && current <= sum){
                used[i] = true;
                if(backtrack(i+1,nums,used,k,sum,current+nums[i])){
                    return true;
                }
                used[i] = false;
            }
        }
        return false;
    }
}