// Last updated: 04/10/2025, 15:52:36
class Solution {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int diff = Math.abs(nums[i]-nums[j]);
                if(diff == k && !check(q,nums[i],nums[j])){
                    q.add(new int[]{nums[i],nums[j]});
                }
            }
        }
        return q.size();
    }
    public boolean check(Queue<int[]> q,int n,int m){
        for(int a[]:q){
            if((a[0] == n && a[1] == m) || (a[0] == m && a[1] == n)){
                return true;
            }
        }
        return false;
    }
}