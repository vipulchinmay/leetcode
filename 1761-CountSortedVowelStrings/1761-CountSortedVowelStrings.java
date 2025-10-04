// Last updated: 04/10/2025, 15:50:44
class Solution {
    int count = 0;
    String[] alpha = {"a","e","i","o","u"};
    public int countVowelStrings(int n) {
        backtrack(0,n);
        return count;
    }
    public void backtrack(int start,int k){
        if(k == 0){
            count++;
            return;
        }
        for(int i=start;i<alpha.length;i++){
            backtrack(i,k-1);
        }
    }
}