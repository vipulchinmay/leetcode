// Last updated: 04/10/2025, 15:50:17
class Solution {
    public String largestGoodInteger(String num) {
        String ans = "";
        for (int i = 0; i < num.length() - 2; i++) {
            char c = num.charAt(i);
            if (c == num.charAt(i + 1) && c == num.charAt(i + 2)) {
                String triple = "" + c + c + c;
                if (ans.isEmpty() || triple.compareTo(ans) > 0) {
                    ans = triple;
                }
            }
        }
        return ans;
    }
}
