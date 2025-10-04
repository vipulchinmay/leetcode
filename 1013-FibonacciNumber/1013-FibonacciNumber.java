// Last updated: 04/10/2025, 15:51:36
class Solution {
    public int fib(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
}