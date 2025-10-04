// Last updated: 04/10/2025, 15:54:17
class Solution {
    int n;
    int m;
    public boolean exist(char[][] board, String word) {
        n = board.length;
        m = board[0].length;
        boolean[][] vis = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == word.charAt(0)){
                    if(dfs(0,i,j,board,vis,word)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean dfs(int start,int i,int j,char board[][],boolean vis[][],String word){
        if(start == word.length()){
            return true;
        }
        if(i<0 || i>=n || j<0 || j>=m || vis[i][j] || board[i][j]!=word.charAt(start)){
            return false;
        }
        vis[i][j] = true;
        boolean result = dfs(start+1,i+1,j,board,vis,word) ||
        dfs(start+1,i,j+1,board,vis,word) ||
        dfs(start+1,i-1,j,board,vis,word) ||
        dfs(start+1,i,j-1,board,vis,word);
        vis[i][j] = false;
        return result;
    }
}