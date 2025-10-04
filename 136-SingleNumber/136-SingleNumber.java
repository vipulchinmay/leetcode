// Last updated: 04/10/2025, 15:54:03
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int j: hm.keySet()){
            if(hm.get(j) == 1){
                return j;
            }
        }
        return 1;
    }
}