// Last updated: 04/10/2025, 15:50:28
class Solution {
    int directions[][] = {{1,0},{0,1},{-1,0},{0,-1}};
    int n,m;
    public int minCost(int maxTime, int[][] edges, int[] passingFees) {
        n = passingFees.length;
        List<int[]>[]list = new ArrayList[n];
        for(int i=0;i<n;i++){
            list[i] = new ArrayList<>();
        }
        for(int e[]:edges){
            list[e[0]].add(new int[]{e[1],e[2]});
            list[e[1]].add(new int[]{e[0],e[2]});
        }
        int result[][] = new int[n][maxTime+1];
        for(int r[]: result){
            Arrays.fill(r,Integer.MAX_VALUE);
        }
        result[0][0] = passingFees[0];
        PriorityQueue<pair> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.cost));
        pq.add(new pair(passingFees[0],0,0));
        while(!pq.isEmpty()){
            pair curr = pq.poll();
            if(curr.node == n-1){
                return curr.cost;
            }
            for(int e[]:list[curr.node]){
                int newNd = e[0];
                int newtime = curr.time + e[1];
                if(newtime<=maxTime){
                    int newcost = curr.cost+passingFees[newNd];
                    if(newcost < result[newNd][newtime]){
                        result[newNd][newtime] = newcost;
                        pq.add(new pair(newcost,newtime,newNd));
                    }
                }
            }
        }
        return -1;
    }
    static class pair{
        int cost;
        int time;
        int node;
        pair(int cost,int time,int node){
            this.cost = cost;
            this.time = time;
            this.node = node;
        }
    }
}