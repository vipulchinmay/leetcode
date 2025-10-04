// Last updated: 04/10/2025, 15:54:59
class Solution {
public:
    vector<string> generateParenthesis(int n) {
        vector<string> ans;
        fnc(ans,n,0,0,"");
        return ans;
    }

    void fnc(vector<string>&ans,int n,int open,int close,string current_str){
        if(current_str.size() == n*2){
            ans.push_back(current_str);
            return;
        }
        if(open<n){
            fnc(ans,n,open+1,close,current_str+"(");
        }
        if(close<open){
            fnc(ans,n,open,close+1,current_str+")");
        }
    }
};