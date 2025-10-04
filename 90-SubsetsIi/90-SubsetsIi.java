// Last updated: 04/10/2025, 15:54:14
class Solution {
    Set<List<Integer>> result = new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        backtrack(0,res,nums);
        return new ArrayList<>(result);
    }
    public void backtrack(int start,List<Integer> res,int[] nums){
        result.add(new ArrayList<>(res));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i] == nums[i-1]){
                continue;
            }
            res.add(nums[i]);
            backtrack(i+1,res,nums);
            res.remove(res.size()-1);
        }
    }
}