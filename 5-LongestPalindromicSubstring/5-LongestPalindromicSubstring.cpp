// Last updated: 04/10/2025, 15:55:20
class Solution {
public:
    int check(string s,int p1,int p2, int &st,int &en){
        int count = 0;
        if(p1 == p2){
            count++;
            p1--;
            p2++;            
        }
        while(p1>=0 and p2<s.length()){
            if(s[p1]!=s[p2]){
                st = p1+1;
                en = p2-1;
                return count;
            }
            else{
                p1--;
                p2++;
                count+=2;
            }
        }
        st = p1+1;
        en = p2-1;
        return count;
    }
    string longestPalindrome(string s) {
        int st = -1;
        int en = -1;
        int len = 0;
        int ps = -1;
        int pe = -1;
        for(int i = 0;i<s.length();i++){
            int x = check(s,i,i,st,en);
            if(x>len){
                len = x;
                ps = st;
                pe = en;
            }
            int y = check(s,i,i+1,st,en);
            if(y>len){
                len = y;
                ps = st;
                pe = en;
            }
        }
        return s.substr(ps,pe-ps+1);
    }
};