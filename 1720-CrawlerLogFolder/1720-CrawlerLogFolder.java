// Last updated: 04/10/2025, 15:50:48
class Solution {
    public int minOperations(String[] logs) {
        int depth = 0;
        for (String log : logs) {
            if (log.equals("../")) {
                if (depth > 0) depth--;
            } else if (!log.equals("./")) {
                depth++;
            }
        }
        return depth;
    }
}