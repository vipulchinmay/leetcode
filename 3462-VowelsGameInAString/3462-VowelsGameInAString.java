// Last updated: 04/10/2025, 15:49:53
class Solution {
    public boolean doesAliceWin(String s) {
        // return s.chars().anyMatch(ch -> "aeiouAEIOU".indexOf(ch) >=0);
        Set<Character> set = new HashSet(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                return true;
            }
        }
        return false;
    }
}