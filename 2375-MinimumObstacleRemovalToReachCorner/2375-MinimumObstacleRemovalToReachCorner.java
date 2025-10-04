// Last updated: 04/10/2025, 15:50:13
class Solution {
    int n,m;
    int[][] directions = {{1,0},{0,1},{-1,0},{0,-1}};
    public int minimumObstacles(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        int result[][] = new int[n][m];
        for(int r[]:result){
            Arrays.fill(r,Integer.MAX_VALUE);
        }
        result[0][0] = 0;
        PriorityQueue<pair>pq = new PriorityQueue<>(Comparator.comparingInt(a->a.count));
        pq.add(new pair(0,0,0));
        while(!pq.isEmpty()){
            pair node = pq.poll();
            if(node.row == n-1 && node.col == m-1){
                return node.count;
            }
            for(int d[] : directions){
                int nr = node.row+d[0];
                int nc = node.col+d[1];
                if(nr>=0 && nr<n && nc>=0 && nc<m){
                    int newcount = node.count + grid[nr][nc];
                    if(newcount<result[nr][nc]){
                        result[nr][nc] = newcount;
                        pq.add(new pair(newcount,nr,nc));
                    }
                }
            }
        }
        return -1;
    }
    static class pair{
        int count;
        int row;
        int col;
        pair(int count,int row,int col){
            this.count = count;
            this.row = row;
            this.col = col;
        }
    }
}