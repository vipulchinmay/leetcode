// Last updated: 04/10/2025, 15:49:58
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n = dimensions.length;
        int m = dimensions[0].length;
        int max = 0;
        int maxarea = 0;
        for(int i=0;i<n;i++){
            int l = dimensions[i][0];
            int b = dimensions[i][1];
            int diagonal = l*l + b*b;
            int a = l*b;
            if(diagonal > max){
                max = diagonal;
                maxarea = a;
            }
            else if( diagonal == max){
                maxarea = Math.max(maxarea,a);
            }
        }
        return maxarea;
    }
}