// Last updated: 04/10/2025, 15:55:26
class Solution {
public:
    vector<int> twoSum(vector<int>&nums,int target){
        /*
        vector<int> result;
        for(auto i=nums.begin();i!=nums.end();++i){
            auto j=find(i+1,nums.end(),target-*i);
            if(j!=nums.end()){
                result.push_back(i-nums.begin());
                result.push_back(j-nums.begin());
                break;
            }
        }
        return result;
        */
        map<int,int> a;
        for(int i=0;i<nums.size();i++){
            int num = nums[i];
            int cmpl = target-num;
            auto j = a.find(cmpl);
            if(j!=a.end()){
                return {j->second,i};
            }
            a[num] = i;
        }
        return {};
    }
};
