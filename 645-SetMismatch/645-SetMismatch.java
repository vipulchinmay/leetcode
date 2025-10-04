// Last updated: 04/10/2025, 15:52:25
class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<Integer> res = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])){
                res.add(nums[i]);
            }
            set.add(nums[i]);
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                res.add(i);
                break;
            }
        }
        int a[] = res.stream().mapToInt(Integer::intValue).toArray();
        return a;
    }
}