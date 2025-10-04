// Last updated: 04/10/2025, 15:54:19
class Solution {
    Set<List<Integer>> result = new HashSet<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> res = new ArrayList<>();
        backtrack(1,n,k,res);
        return new ArrayList<>(result);
    }
    public void backtrack(int i,int n,int k,List<Integer> res){
        if(k==0){
            result.add(new ArrayList<>(res));
            return;
        }
        if(i>n){
            return;
        }
        res.add(i);
        backtrack(i+1,n,k-1,res);
        res.remove(res.size()-1);
        backtrack(i+1,n,k,res);
    }
}