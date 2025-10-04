// Last updated: 04/10/2025, 15:51:22
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            pq.add(i);
        }
        while(pq.size()>1){
            int max = pq.remove();
            int smax = pq.remove();
            int newstone = max-smax;
            if(newstone!=0){
                pq.add(newstone);
            }
        }
        if(pq.size() == 0){
            return 0;
        }
        else{
            return pq.remove();
        }
    }
}