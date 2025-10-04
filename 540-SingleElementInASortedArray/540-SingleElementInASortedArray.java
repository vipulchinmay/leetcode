// Last updated: 04/10/2025, 15:52:34
class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for(int n:nums){
            if(hm.get(n) == 1){
                return n;
            }
        }
        return -1;
    }
}