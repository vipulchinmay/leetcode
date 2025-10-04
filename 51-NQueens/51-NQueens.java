// Last updated: 04/10/2025, 15:54:36
class Solution {
    Set<List<String>> result = new HashSet<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(char[] r : board){
            Arrays.fill(r,'.');
        }
        backtrack(0,board,n);
        return new ArrayList<>(result);
    }
    public void backtrack(int start,char[][] board,int n){
        if(start == n){
            result.add(construct(board));
            return;
        }
        for(int i=0;i<n;i++){
            if(isSafe(board,start,i,n)){
                board[start][i] = 'Q';
                backtrack(start+1,board,n);
                board[start][i] = '.';
            }
        }
    }
    public boolean isSafe(char[][] board,int row,int col,int n){
        for(int i=0;i<row;i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        for(int i = row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;

    }
    public List<String> construct(char[][] board){
        List<String> lt = new ArrayList<>();
        for(char r[] : board){
            lt.add(new String(r));
        }
        return lt;
    }
}