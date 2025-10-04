// Last updated: 04/10/2025, 15:51:38
class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<=9;i++){
            dfs(n-1,i,k,res);
        }
        if(n == 1){
            res.add(0);
        }
        return convert(res);
    }
    public void dfs(int n,int i,int k,List<Integer> res){
        if(n == 0){
            res.add(i);
            return;
        }
        int last = i%10;
        if(last+k<=9){
            dfs(n-1,i*10+(last+k),k,res);
        }
        if (k != 0 && last - k >= 0) {
            dfs(n - 1, i * 10 + (last - k), k, res);
        }
    }
    public int[] convert(List<Integer> res){
        int a[] = new int[res.size()];
        for(int i=0;i<res.size();i++){
            a[i] = res.get(i);
        }
        return a;
    }
}