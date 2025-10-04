// Last updated: 04/10/2025, 15:51:30
class Solution {
    public boolean equationsPossible(String[] equations) {
        DSU obj = new DSU();
        List<String> lt = new ArrayList<>();
        for(String s : equations){
            if(s.charAt(1) == '='){
                obj.union(s.charAt(0)-'a',s.charAt(3)-'a');
            }
            else{
                lt.add(s);
            }
        }
        for(String s : lt){
            if(obj.find(s.charAt(0)-'a') == obj.find(s.charAt(3)-'a')){
                return false;
            }
        }
        return true;
    }
}
class DSU{
    int parent[];
    DSU(){
        parent = new int[26];
        for(int i=0;i<26;i++){
            parent[i] = i;
        }
    }
    public int find(int x){
        if(parent[x]!=x){
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    public void union(int x,int y){
        int xr = find(x);
        int yr = find(y);
        if(xr == yr){
            return;
        }
        if(yr>xr){
            parent[yr] = xr;
        }
        else{
            parent[xr] = yr;
        }
    }
}