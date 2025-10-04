// Last updated: 04/10/2025, 15:51:13
class Solution {
    int n;
    int dp[] = new int[50001];
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        n = startTime.length;
        Arrays.fill(dp,-1);
        int [][] data = new int[startTime.length][3];
        for(int i=0;i<startTime.length;i++){
            data[i][0] = startTime[i];
            data[i][1] = endTime[i];
            data[i][2] = profit[i];
        }
        Arrays.sort(data,(a,b)->Integer.compare(a[0],b[0]));
        return calculate(data,0);
    }
    public int calculate(int[][] data,int i){
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int next = getNext(data,i+1,data[i][1]);
        int taken = data[i][2] + calculate(data,next);
        int notTaken = calculate(data,i+1);
        return dp[i] = Math.max(taken,notTaken);
    }
    public int getNext(int [][] data,int l,int end){
        int r = n-1;
        int result = n+1;
        while(l<=r){
            int mid = (l+r)/2;
            if(data[mid][0]>=end){
                result = mid;
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return result;
    }
}