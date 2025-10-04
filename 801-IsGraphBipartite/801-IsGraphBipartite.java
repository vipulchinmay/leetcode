// Last updated: 04/10/2025, 15:52:03
class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n];
        Arrays.fill(colors,-1);
        for(int i=0;i<n;i++){
            if(colors[i] == -1){
                if(!check(i,colors,graph)){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean check(int i,int[] colors, int[][] graph){
        int n = graph.length;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        colors[i]= 0;
        while(!q.isEmpty()){
        int node = q.poll();
        for(int d:graph[node]){
                if(colors[d] == -1){
                    colors[d] = 1-colors[node];
                    q.add(d);
                }
                else if(colors[d] == colors[node]){
                    return false;
                }
            }
        }
        return true;
    }
}