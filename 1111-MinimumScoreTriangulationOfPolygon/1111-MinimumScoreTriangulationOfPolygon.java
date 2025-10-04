// Last updated: 04/10/2025, 15:51:23
class Solution {
    int memo[][] = new int[51][51];
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        for(int m[] : memo){
            Arrays.fill(m,-1);
        }
        return solve(values,0,n-1);
    }
    public int solve(int a[],int i,int j){
        if(j-i+1 < 3){
            return 0;
        }
        if(memo[i][j] != -1){
            return memo[i][j];
        }
        int result = Integer.MAX_VALUE;
        for(int k = i+1;k<j;k++){
            int area = a[i] * a[k] * a[j] + solve(a,i,k) + solve(a,k,j);
            result = Math.min(result,area);
        }
        return memo[i][j] = result;
    }
}