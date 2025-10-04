// Last updated: 04/10/2025, 15:54:51
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        return new int[]{first(nums,target),last(nums,target)};
    }
    public int first(int nums[],int target){
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int f = -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                f =  mid;
                right=mid-1;
            }
            else if(target > nums[mid]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return f;
    }
    public int last(int nums[],int target){
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int l = -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                l =  mid;
                left=mid+1;
            }
            else if(target > nums[mid]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return l;
    }
}