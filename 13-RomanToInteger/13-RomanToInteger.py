# Last updated: 04/10/2025, 15:55:11
class Solution:
    def romanToInt(self, s: str) -> int:
        roman={
            'I':1,
            'V':5,
            'X':10,
            'L':50,
            'C':100,
            'D':500,
            'M':1000,
        }
        n=0
        for i in range (len(s)-1):
            if (roman[s[i]]<roman[s[i+1]]):
                n=n-roman[s[i]]
            else:
                n=n+roman[s[i]]
        return n+roman[s[-1]]
