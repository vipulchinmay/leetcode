// Last updated: 04/10/2025, 15:53:51
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            int sum = 0;
            sum+=numbers[i]+numbers[j];
            if(sum>target){
                j--;
            }
            else if(sum<target){
                i++;
            }
            else{
                return new int[]{i+1,j+1};
            }
        }
        return new int[]{};
    }
}