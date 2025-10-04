// Last updated: 04/10/2025, 15:51:18
class Solution {
    public int tribonacci(int n) {
        if(n == 0){
            return 0;
        }
        else if(n == 1 || n == 2){
            return 1;
        }
        else{
            int i=0;
            int j = 1;
            int k = 1;
            for(int m=1;m<=n;m++){
                int f = i+j+k;
                i = j;
                j = k;
                k = f;
            }
            return i;
        }
    }
}