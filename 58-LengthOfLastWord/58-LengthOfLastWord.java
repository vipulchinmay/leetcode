// Last updated: 04/10/2025, 15:54:31
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int n = s.length();
        int count = 0;
        for(int i = n-1;i>=0;i--){
            if(s.charAt(i) == ' '){
                break;
            }
            else{
                count++;
            }
        }
        return count;
        
    }
}