// Last updated: 04/10/2025, 15:52:38
class Solution {
    public boolean detectCapitalUse(String word) {
        if(allCapital(word) || allSmall(word) || allSmall(word.substring(1))){
            return true;
        }
        return false;
    }
    public boolean allCapital(String s){
        for(char ch : s.toCharArray()){
            if(ch <'A'||ch>'Z'){
                return false;
            }
        }
        return true;
    }
    public boolean allSmall(String s){
        for(char ch : s.toCharArray()){
            if(ch<'a'||ch>'z'){
                return false;
            }
        }
        return true;
    }
}