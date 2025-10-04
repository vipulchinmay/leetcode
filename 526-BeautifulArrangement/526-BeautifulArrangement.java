// Last updated: 04/10/2025, 15:52:37
class Solution {
    int count = 0;
    public int countArrangement(int n) {
        boolean[] used = new boolean[n+1];
        calculate(1,n,used);
        return count;
    }
    public void calculate(int pos,int n,boolean[] used){
        if(pos > n){
            count++;
            return;
        }
        for(int i=1;i<=n;i++){
            if (!used[i] && (i % pos == 0 || pos % i == 0)) {
                used[i] = true;
                calculate(pos + 1, n, used);
                used[i] = false;
            }
        }
    }
}