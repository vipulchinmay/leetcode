// Last updated: 04/10/2025, 21:27:28
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;
        int max = 0;
        while(i < j){
            int l = j - i;
            int b = Math.min(height[i],height[j]);
            int area = l * b;
            max = Math.max(max,area);
            if(height[i] > height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return max;
    }
}