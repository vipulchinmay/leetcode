// Last updated: 04/10/2025, 15:50:01
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        backtrack(res,nums,k,0);
        return result.size();
    }
    public void backtrack(List<Integer> res,int[] a,int k, int start){
        if(res.size()>0){
            result.add(new ArrayList<>(res));
        }
        for(int i=start;i<a.length;i++){
            boolean valid = true;
            for(int n:res){
                if(Math.abs(n-a[i]) == k){
                    valid = false;
                    break;
                }
            }
            if(valid){
                res.add(a[i]);
                backtrack(res,a,k,i+1);
                res.remove(res.size()-1);
            }
        }
    }
}