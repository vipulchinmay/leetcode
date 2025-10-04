// Last updated: 04/10/2025, 15:54:48
class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == '.'){
                    for(char k='1';k<='9';k++){
                        if(isValid(board,i,j,k)){
                            board[i][j] = k;
                            if(solve(board) == true){
                                return true;
                            }
                            else{
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValid(char[][] board,int i,int j, char k){
        for(int z=0;z<9;z++){
            if(board[z][j] == k){
                return false;
            }
            if(board[i][z] == k){
                return false;
            }
            if(board[3*(i/3)+z/3][3*(j/3)+z%3] == k){
                return false;
            }
        }
        return true;
    }
}