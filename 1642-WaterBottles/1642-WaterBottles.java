// Last updated: 04/10/2025, 15:50:52
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int result = numBottles;
        while(numBottles >= numExchange){
            int rem = numBottles / numExchange;
            result += rem;
            numBottles =  rem + (numBottles % numExchange);
        }
        return result;
    }
}