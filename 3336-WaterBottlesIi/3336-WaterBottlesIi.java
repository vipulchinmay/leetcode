// Last updated: 04/10/2025, 15:49:56
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int total = numBottles;
        while(numBottles >= numExchange){
            numBottles-=numExchange;
            numExchange++;
            total++;
            numBottles+=1;
        }
        return total;
    }
}