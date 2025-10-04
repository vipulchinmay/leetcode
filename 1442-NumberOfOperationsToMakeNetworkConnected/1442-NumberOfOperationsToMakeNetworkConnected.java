// Last updated: 04/10/2025, 15:51:05
class Solution {
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) {
            return -1;  // Not enough cables to connect all computers
        }
        disjoint obj = new disjoint(n);
        for (int[] connection : connections) {
            obj.union(connection[0], connection[1]);
        }
        int count = 0;
        for(int i =0;i<n;i++){
            if(obj.check(i)){
                count++;
            }
        }
        return count-1;
    }
}
class disjoint{
    List<Integer> parent = new ArrayList<>();
    List<Integer> rank = new ArrayList<>();
    public disjoint(int n){
        for(int i=0;i<n;i++){
            parent.add(i);
            rank.add(0);
        }
    }
    public int find(int n){
        if(n == parent.get(n)){
            return n;
        }
        int ulp = find(parent.get(n));
        parent.set(n,ulp);
        return parent.get(n);
    }
    public void union(int x,int y){
        int n = find(x);
        int m = find(y);
        if(n == m){
            return;
        }
        if(rank.get(n)>rank.get(m)){
            parent.set(m,n);
        }
        else if(rank.get(n) < rank.get(m)){
            parent.set(n,m);
        }
        else{
            parent.set(m,n);
            rank.set(n,rank.get(n)+1);
        }
    }
    public boolean check(int n){
        return n == find(n);
    }
}