// Last updated: 04/10/2025, 15:50:47
class Solution {
    int result = 0;
    public int maximumRequests(int n, int[][] requests) {
        int[] sample = new int[n];
        Arrays.fill(sample,0);
        backtrack(0,0,n,sample,requests);
        return result;
    }
    public void backtrack(int i,int count,int n,int[] sample,int[][] requests){
        if(i==requests.length){
            boolean allzeros = true;
            for(int k:sample){
                if(k!=0){
                    allzeros = false;
                    break;
                }
            }
            if(allzeros){
                result = Math.max(result,count);
            }
            return;
        }
        int from = requests[i][0];
        int to = requests[i][1];
        sample[from]--;
        sample[to]++;
        backtrack(i+1,count+1,n,sample,requests);
        sample[from]++;
        sample[to]--;
        backtrack(i+1,count,n,sample,requests);
    }
}