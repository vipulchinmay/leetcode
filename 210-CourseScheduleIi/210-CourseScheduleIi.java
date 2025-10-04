// Last updated: 04/10/2025, 15:53:26
class Solution {
    public int[] findOrder(int n, int[][] pre) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i =0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int p[]:pre){
            adj.get(p[1]).add(p[0]);
        }
        int indegree[] = new int[n];
        for(int i=0;i<n;i++){
            for(int lt : adj.get(i)){
                indegree[lt]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        int [] a = new int[n];
        int i=0;
        while(!q.isEmpty()){
            int node = q.poll();
            a[i++] = node;
            for(int lt : adj.get(node)){
                indegree[lt]--;
                if(indegree[lt] == 0){
                    q.add(lt);
                }
            }
        }
        return i == n?a:new int[]{};
    }
}