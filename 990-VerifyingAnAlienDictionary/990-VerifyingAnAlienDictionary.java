// Last updated: 04/10/2025, 15:51:41
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int dp[] = new int[26];
        for(int i=0;i<order.length();i++){
            dp[order.charAt(i)-'a'] = i;
        }
        for(int i=0;i<words.length-1;i++){
            String s1 = words[i];
            String s2 = words[i+1];
            if(!isSorted(s1,s2,dp)){
                return false;
            }
        }
        return true;
    }
    public boolean isSorted(String s1,String s2,int dp[]){
        int len = Math.min(s1.length(),s2.length());
        for(int i=0;i<len;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return dp[s1.charAt(i)-'a']<dp[s2.charAt(i)-'a'];
            }
        }
        return s1.length()<=s2.length();
    }
}