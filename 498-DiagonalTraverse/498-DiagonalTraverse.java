// Last updated: 04/10/2025, 15:52:39
class Solution {
    public static int[] findDiagonalOrder(int[][] mat) {
        if (mat.length == 0) return new int[0];
        
        int n = mat.length, m = mat[0].length;
        int[] result = new int[n * m];
        int r = 0, c = 0;
        
        for (int k = 0; k < result.length; k++) {
            result[k] = mat[r][c];
            
            if ((r + c) % 2 == 0) { 
                if (c == m - 1) r++;
                else if (r == 0) c++;
                else { r--; c++; }
            } else { 
                if (r == n - 1) c++;
                else if (c == 0) r++;
                else { r++; c--; }
            }
        }
        return result;
    }
}