// Last updated: 04/10/2025, 15:54:35
class Solution {
    Set<List<String>> result = new HashSet<>();
    public int totalNQueens(int n) {
        char[][] bd = new char[n][n];
        for(char r[] : bd){
            Arrays.fill(r,'.');
        }
        backtrack(0,bd,n);
        return result.size();
    }
    public void backtrack(int r,char[][] bd,int n){
        if(r == n){
            result.add(construct(bd));
            return;
        }
        for(int cl = 0;cl<n;cl++){
            if(isSafe(bd,r,cl,n)){
                bd[r][cl] = 'Q';
                backtrack(r+1,bd,n);
                bd[r][cl] = '.';
            }
        }
    }
    public boolean isSafe(char[][] bd,int r,int c,int n){
        for(int i=0;i<r;i++){
            if(bd[i][c] == 'Q'){
                return false;
            }
        }
        for(int i=r-1,j=c-1;i>=0 && j>=0;i--,j--){
            if(bd[i][j] == 'Q'){
                return false;
            }
        }
        for(int i=r-1,j=c+1;i>=0 && j<n;i--,j++){
            if(bd[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public List<String> construct(char[][] bd){
        List<String> lt = new ArrayList<>();
        for(char[] r:bd){
            lt.add(new String(r));
        }
        return lt;
    }
}