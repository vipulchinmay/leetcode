# Last updated: 04/10/2025, 15:55:17
class Solution:
    def isPalindrome(self, x: int) -> bool:
        return str(x)==str(x)[::-1]