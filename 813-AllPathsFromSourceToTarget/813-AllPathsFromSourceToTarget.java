// Last updated: 04/10/2025, 15:52:02
class Solution {
    Set<List<Integer>> result = new HashSet<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> res = new ArrayList<>();
        res.add(0);
        dfs(0,graph,res);
        return new ArrayList<>(result);
    }
    public void dfs(int n,int[][] graph,List<Integer> res){
        if(n == graph.length-1){
            result.add(new ArrayList<>(res));
        }
        for(int neigh : graph[n]){
            res.add(neigh);
            dfs(neigh,graph,res);
            res.remove(res.size()-1);
        }
    }
}