// Last updated: 04/10/2025, 15:51:43
class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        int n = strs.length;
        int m = strs[0].length();
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                if(strs[j].charAt(i)<strs[j-1].charAt(i)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}