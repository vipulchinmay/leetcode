// Last updated: 04/10/2025, 15:52:20
class Solution {
    public int[] findRedundantDirectedConnection(int[][] edges) {
        int n = edges.length;
        int[] parent = new int[n + 1];
        int[] cand1 = null, cand2 = null;
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            if (parent[v] == 0) {
                parent[v] = u;
            } else {
                cand1 = new int[]{parent[v], v}; 
                cand2 = new int[]{u, v};
                edge[1] = 0;
            }
        }
        DSU dsu = new DSU(n + 1);
        for (int[] edge : edges) {
            if (edge[1] == 0) continue; 
            int u = edge[0], v = edge[1];
            if (!dsu.union(u, v)) {
                if (cand1 != null) return cand1;
                return edge;
            }
        }
        return cand2;
    }
}
class DSU{
    int parent[];
    DSU(int n){
        parent = new int[n];
        for(int i=0;i<n;i++){
            parent[i] = i;
        }
    }
    public int find(int x){
        if(parent[x]!=x){
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    public boolean union(int x,int y){
        int xr = find(x);
        int yr = find(y);
        if(xr == yr){
            return false;
        }
        if(yr>xr){
            parent[yr] = xr;
        }
        else{
            parent[xr] = yr;
        }
        return true;
    }
}