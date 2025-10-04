// Last updated: 04/10/2025, 15:54:40
class Solution {
    Set<List<Integer>> result = new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> res = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];
        backtrack(res,vis,nums);
        return new ArrayList<>(result);
    }
    public void backtrack(List<Integer> res,boolean[] vis,int[] nums){
        if(nums.length == 0){
            return;
        }
        if(res.size() == nums.length){
            result.add(new ArrayList<>(res));
            return;
        }
        for(int i=0;i<nums.length;i++){
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