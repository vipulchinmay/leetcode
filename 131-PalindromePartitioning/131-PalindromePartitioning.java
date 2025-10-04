// Last updated: 04/10/2025, 15:54:06
class Solution {
    Set<List<String>> result = new HashSet<>();
    public List<List<String>> partition(String s) {
        List<String> res = new ArrayList<>();
        backtrack(0,res,s);
        return new ArrayList<>(result);
    }
    public void backtrack(int i,List<String> res,String s){
        if(i == s.length()){
            result.add(new ArrayList<>(res));
            return;
        }
        for(int j=i;j<s.length();j++){
            if(ispalindrome(s,i,j)){
                res.add(s.substring(i,j+1));
                backtrack(j+1,res,s);
                res.remove(res.size()-1);
            }
        }
    }
    public boolean ispalindrome(String s,int start,int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}