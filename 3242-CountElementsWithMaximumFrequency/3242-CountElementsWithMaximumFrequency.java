// Last updated: 04/10/2025, 15:49:59
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count = 0;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i : nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int max = 0;
        for(int k : hm.keySet()){
            max = Integer.max(max,hm.get(k));
        }
        for(int k : nums){
            if(hm.get(k) == max){
                count++;
            }
        }
        return count;
    }
}