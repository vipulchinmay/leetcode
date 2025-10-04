// Last updated: 04/10/2025, 15:54:05
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int capacity = 0;
        int total_gas = 0;
        int total_cost = 0;
        int idx = 0;
        for(int i=0;i<gas.length;i++){
            total_gas += gas[i];
            total_cost += cost[i];
            capacity += gas[i] - cost[i];
            if(capacity <0){
                idx= i+1;
                capacity = 0;
            }
        }
        if(total_gas < total_cost){
            return -1;
        }
        return idx;
    }
}