// Last updated: 04/10/2025, 15:53:15
class Solution {
    public int addDigits(int num) {
        if(num < 10){
            return num;
        }
        int r = calculate(num);
        return r;
    }
    public int calculate(int num){
        int sum = 0;
        while(num>0){
            int r = num%10;
            sum+=r;
            num = num/10;
        }
        return sum<10?sum:calculate(sum);
    }
}