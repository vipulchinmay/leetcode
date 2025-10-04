// Last updated: 04/10/2025, 15:52:42
class Solution {
    Set<List<Integer>> result = new HashSet<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> res = new ArrayList<>();
        backtrack(0,res,nums);
        return new ArrayList<>(result);
    }
    public void backtrack(int i,List<Integer> res,int[] nums){
        int n = nums.length;
        Set<Integer> st = new HashSet<>();
        if(res.size()>=2){
            result.add(new ArrayList<>(res));
        }
        for(int j=i;j<n;j++){
            if(res.isEmpty() || (nums[j]>=res.get(res.size()-1)) && !st.contains(nums[j])){
                st.add(nums[j]);
                res.add(nums[j]);
                backtrack(j+1,res,nums);
                res.remove(res.size()-1);
            }
        }
    }
}