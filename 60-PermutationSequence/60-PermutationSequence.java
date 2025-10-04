// Last updated: 04/10/2025, 15:54:29
class Solution {
    List<String> result = new ArrayList<>();
    char alp[] = {'1','2','3','4','5','6','7','8','9'};
    public String getPermutation(int n, int k) {
        boolean vis[] = new boolean[9];
        backtrack("",n,k,vis);
        return result.get(k-1);
    }
    public void backtrack(String s,int n,int k,boolean vis[]){
        if(s.length() == n){
            if (result.size() >= k) return;
            result.add(s);
            return;
        }
        for(int i=0;i<n;i++){
            if(!vis[i]){
                vis[i] = true;
                backtrack(s+alp[i],n,k,vis);
                vis[i] = false;
            }
        }
    }
}