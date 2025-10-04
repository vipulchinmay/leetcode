// Last updated: 04/10/2025, 15:55:19
class Solution {
public:
    string convert(string s, int row) {
        int l = s.length();
        if(row == 1){
            return s;
        }
        if(row>=l){
            return s;
        }
        int delta = -1;
        int r=0;
        vector<char>res[row];
        for(auto c:s){
            res[r].push_back(c);
            if(r==0 or r==row-1){
                delta *=-1;
            }
            r+=delta;
        }
        string result = "";
        for(auto x:res){
            for(auto y:x){
                result+=y;
            }
        }
        return result;
    }
};