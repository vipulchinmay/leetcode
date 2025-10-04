// Last updated: 04/10/2025, 15:51:58
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            adj.add(new ArrayList<>());
        }
        int indegree[] = new int[graph.length];
        for(int i=0;i<graph.length;i++){
            for(int lt : graph[i]){
                adj.get(lt).add(i);
                indegree[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        List<Integer> result = new ArrayList<>();
        while(!q.isEmpty()){
            int node = q.poll();
            result.add(node);
            for(int lt : adj.get(node)){
                indegree[lt]--;
                if(indegree[lt] == 0){
                    q.add(lt);
                }
            }
        }
        Collections.sort(result);
        return result;
    }
}