// Last updated: 04/10/2025, 15:55:02
class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int count = 0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]!=val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
};