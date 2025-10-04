# Last updated: 04/10/2025, 15:54:11
class Solution:
    def isPalindrome(self, s: str) -> bool:
        new_str = re.sub(r'[\W_]', '', s)
        return new_str.lower()==new_str.lower()[::-1]