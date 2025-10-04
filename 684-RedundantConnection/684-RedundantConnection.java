// Last updated: 04/10/2025, 15:52:22
class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        DSU obj = new DSU();
        List<Integer> list = new ArrayList<>();
        for(int[]e : edges){
            if(!obj.union(e[0],e[1])){
                return e;
            }
        }
        return new int[]{0};
    }
}
class DSU{
    int parent[];
    int n = 1001;
    DSU(){
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
        if(xr<yr){
            parent[yr] = xr;
        }
        else{
            parent[xr] = yr;
        }
        return true;
    }
}