// Last updated: 04/10/2025, 15:52:13
class Solution {
;    public int networkDelayTime(int[][] times, int n, int k) {
        List<int[]>[] lt = new ArrayList[n+1];
        for(int i=1;i<=n;i++){
            lt[i] = new ArrayList<>();
        }
        for(int e[] : times){
            lt[e[0]].add(new int[]{e[1],e[2]});
        }
        int result[] = new int[n+1];
        Arrays.fill(result,Integer.MAX_VALUE);
        result[k] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a->a[1]));
        pq.add(new int[]{k,0});
        boolean[] visited = new boolean[n+1];
        while(!pq.isEmpty()){
            int[] node = pq.poll();
            if(visited[node[0]]){
                continue;
            }
            visited[node[0]] = true;
            for(int e[]:lt[node[0]]){
                int next = e[0];
                int newtime =node[1]+e[1];
                if(!visited[next] && newtime < result[next]){
                    result[next] = newtime;
                    pq.add(new int[]{next,newtime});
                }
            }
        }
        int max = 0;
        for(int i=1;i<=n;i++){
            if(result[i] == Integer.MAX_VALUE){
                return -1;
            }
            max = Math.max(max,result[i]);
        }
        return max;

    }
}