// Last updated: 04/10/2025, 15:54:41
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int k = nums.length;
        boolean[] vis = new boolean[k];
        backtrack(res,vis,nums);
        return new ArrayList<>(result);
    }
    public void backtrack(List<Integer> res,boolean[] vis,int[] nums){
        int n = nums.length;
        if(res.size() == n){
            result.add(new ArrayList<>(res));
            return;
        }
        for(int i=0;i<n;i++){
            if(vis[i]){
                continue;
            }
            vis[i] = true;
            res.add(nums[i]);
            backtrack(res,vis,nums);
            res.remove(res.size()-1);
            backtrack(res,vis,nums);
            vis[i] = false;
        }
    }
}