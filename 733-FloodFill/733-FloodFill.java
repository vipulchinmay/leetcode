// Last updated: 04/10/2025, 15:52:15
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        int a = image[sr][sc];
        boolean[][] visited = new boolean[n][m];
        if(a!=color){
            dfs(sr,sc,visited,image,color,a);
        }
        return image;
    }
    public void dfs(int i,int j,boolean[][] visited,int[][] image,int color,int a){
        int n = image.length;
        int m = image[0].length;
        if(i<0  || j<0 || i>=n || j>=m || visited[i][j] || image[i][j]!=a){
            return;
        }
        visited[i][j] = true;
        image[i][j] = color;
        dfs(i+1,j,visited,image,color,a);
        dfs(i,j+1,visited,image,color,a);
        dfs(i-1,j,visited,image,color,a);
        dfs(i,j-1,visited,image,color,a);
    }
}