// Last updated: 04/10/2025, 15:50:39
class Solution {
    int result = Integer.MAX_VALUE;
    public int minimumTimeRequired(int[] jobs, int k) {
        int workers[] = new int[k];
        Arrays.sort(jobs);
        reverse(jobs);
        backtrack(jobs,0,workers,0,k);
        return result;
    }
    public void backtrack(int[] jobs,int start,int[] workers,int max,int k){
        if(max>=result){
            return;
        }
        if(start == jobs.length){
            result = max;
            return;
        }
        for(int i=0;i<k;i++){
            if(i>0 && workers[i] == workers[i-1]){
                continue;
            }
            workers[i]+=jobs[start];
            backtrack(jobs,start+1,workers,Math.max(max,workers[i]),k);
            workers[i]-=jobs[start];
        }
    }
    public void reverse(int a[]){
        int i = 0;
        int j = a.length-1;
        while(i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
}