// Last updated: 04/10/2025, 15:54:00
class Solution {
    List<String> result = new ArrayList<>();

    public List<String> wordBreak(String s, List<String> wordDict) {
        backtrack(0, s, wordDict, new StringBuilder());
        // Collections.sort(result);
        return result;
    }

    public void backtrack(int start, String s, List<String> wordDict, StringBuilder str) {
        if (start == s.length()) {
            result.add(str.toString().trim());
            return;
        }
        for (int j = start; j < s.length(); j++) {
            if (wordDict.contains(s.substring(start, j+1))) {
                int l = str.length();
                str.append((s.substring(start, j+1))).append(" ");
                backtrack(j + 1, s, wordDict, str);
                str.setLength(l);
            }
        }
    }
}