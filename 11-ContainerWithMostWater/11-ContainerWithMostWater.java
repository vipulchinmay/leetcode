// Last updated: 04/10/2025, 15:55:09
class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int max = 0;
        while(i<j){
            int k = Math.min(height[i],height[j]);
            int area = k*(j-i);
            if(area > max){
                max = area;
            }
            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}