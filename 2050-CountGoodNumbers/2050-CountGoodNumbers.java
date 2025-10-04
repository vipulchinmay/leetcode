// Last updated: 04/10/2025, 15:50:27
class Solution {
    int M = (int)1e9+7;
    public int countGoodNumbers(long n) {
        long even = power(5,(n+1)/2);
        long odd = power(4,(n)/2);
        return (int)((even * odd) % M);
    }
    public long power(long a,long b){
        if(b == 0){
            return 1;
        }
        long half = power(a,b/2);
        long result =  (half * half) % M;
        if(b%2 == 1){
            result = (result * a) % M;
        }
        return result;
    }
}
