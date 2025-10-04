// Last updated: 04/10/2025, 15:54:18
class Solution {
    Set<List<Integer>> result = new HashSet<>();
    //result.add();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> res = new ArrayList<>();
        backtrack(0,res,nums);
        return new ArrayList<>(result);
    }
    public void backtrack(int start, List<Integer> res,int[] nums){
        result.add(new ArrayList<>(res));
        for(int i=start;i<nums.length;i++){
            res.add(nums[i]);
            backtrack(i+1,res,nums);
            res.remove(res.size()-1);
        }
    }
}