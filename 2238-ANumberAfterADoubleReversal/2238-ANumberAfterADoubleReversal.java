// Last updated: 04/10/2025, 15:50:21
class Solution {
    public boolean isSameAfterReversals(int num) {
    //     if(num == 0){
    //         return true;
    //     }
    //     return isPossible(num);
    // }
    // public boolean isPossible(int n){
    //     String s = Integer.toString(n);
    //     String s1 = reverse(s);
    //     String s2 = reverse(s1);
    //     return s.equals(s2);
    // }
    // public String reverse(String s){
    //     StringBuilder sb = new StringBuilder(s);
    //     return sb.reverse().toString();
    // }
        if(num == 0){
            return true;
        }
        return num%10!=0;
    }
}