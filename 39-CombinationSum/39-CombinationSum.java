// Last updated: 04/10/2025, 15:54:46
class Solution {
    Set<List<Integer>> result = new HashSet<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> res = new ArrayList<>();
        backtrack(candidates,res,target,0);
        return new ArrayList<>(result);
    }
    public void backtrack(int[] a,List<Integer> res, int t,int start){
        if(t == 0){
            result.add(new ArrayList<>(res));
            return;
        }
        if(t<0){
            return;
        }
        for(int i=start;i<a.length;i++){
            res.add(a[i]);
            backtrack(a,res,t-a[i],i);
            res.remove(res.size()-1);
        }
    }
}