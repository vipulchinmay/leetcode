// Last updated: 04/10/2025, 15:53:23
class Solution {
    Set<List<Integer>> result = new HashSet<>(); 
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> res = new ArrayList<>();
        backtrack(k,n,res,1);
        return new ArrayList<>(result);
    }
    public void backtrack(int k,int n,List<Integer> res,int start){
        if(n == 0){
            if(res.size()==k){
                Collections.sort(res);
                result.add(new ArrayList<>(res));
            }
            return;
        }
        if(n<0){
            return;
        }
        for(int i=start;i<=9;i++){
            if(!res.contains(i)){
                res.add(i);
                backtrack(k,n-i,res,i+1);
                res.remove(res.size()-1);
            }
        }
    }
}