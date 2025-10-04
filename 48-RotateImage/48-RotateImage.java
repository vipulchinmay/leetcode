// Last updated: 04/10/2025, 15:54:38
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++){
            reverse(matrix[i]);
        }
    }
    public void reverse(int a[]){
        int low = 0;
        int high = a.length - 1;
        while(low < high){
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
        }
    }
}