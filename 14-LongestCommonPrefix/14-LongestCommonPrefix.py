# Last updated: 04/10/2025, 15:55:06
class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        s=''
        for i in range (len(strs[0])):
            for j in strs:
                if i==len(j) or j[i]!=strs[0][i]:
                    return s
            s=s+strs[0][i]
        return s
        