// Last updated: 04/10/2025, 15:52:43
class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int dp[][] = new int[m+1][n+1];
        for(String str : strs){
            int currm = 0;
            int currn = 0;
            for(char ch : str.toCharArray()){
                if(ch == '0'){
                    currm++;
                }
                else if( ch == '1'){
                    currn++;
                }
            }
            for(int i = m;i>=currm;i--){
                for(int j = n;j>=currn;j--){
                    dp[i][j] = Math.max(dp[i][j],dp[i-currm][j-currn]+1);
                }
            }
        }
        return dp[m][n];
    }
}