// Last updated: 04/10/2025, 15:54:43
class Solution {
    public int firstMissingPositive(int[] nums) {
        TreeSet<Integer> ts = new TreeSet<>();
        for(int n : nums){
            if(n>0){
                ts.add(n);
            }
        }
        int missing = 1;
        for(int n : ts){
            if(missing == n){
                missing++;
            }
            else if(n>missing){
                break;
            }
        }
        return missing;
    }
}