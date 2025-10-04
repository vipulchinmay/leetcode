// Last updated: 04/10/2025, 15:54:13
class Solution {
    List<String> res = new ArrayList<>();
    int n;
    public List<String> restoreIpAddresses(String s) {
        n = s.length();
        if(n>12){
            return new ArrayList<>();
        }
        String curr = "";
        backtrack(s,0,0,curr);
        return res;
    }
    public void backtrack(String s,int idx,int parts,String curr){
        if(idx == n && parts == 4){
            res.add(curr.substring(0,curr.length()-1));
            return;
        }
        if(parts>=4){
            return;
        }
        if(idx+1<=n){
        backtrack(s,idx+1,parts+1,curr+s.substring(idx,idx+1)+".");
        }
        if(idx+2<=n && isvalid(s.substring(idx,idx+2))){
        backtrack(s,idx+2,parts+1,curr+s.substring(idx,idx+2)+".");
        }
        if(idx+3<=n && isvalid(s.substring(idx,idx+3))){
        backtrack(s,idx+3,parts+1,curr+s.substring(idx,idx+3)+".");
        }
    }
    public boolean isvalid(String s){
        if(s.length()>1 && s.charAt(0) == '0'){
            return false;
        }
        int m = Integer.parseInt(s);
        return m>=0 && m<=255;
    }
}