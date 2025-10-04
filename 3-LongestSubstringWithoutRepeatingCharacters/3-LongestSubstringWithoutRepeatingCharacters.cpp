// Last updated: 04/10/2025, 15:55:22
class Solution {
public:
    int lengthOfLongestSubstring(string s) {
    vector<int>dict(256,-1);
    int maxlen = 0;
    int start = -1;
    for(int i =0;i<s.size();i++){
        if(dict[s[i]]>start){
            start =dict[s[i]];
        }
        dict[s[i]] = i;
        maxlen = max(maxlen,i-start);
    }
    return maxlen;
    }
};