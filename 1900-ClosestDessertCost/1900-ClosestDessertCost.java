// Last updated: 04/10/2025, 15:50:36
class Solution {
    int result;
    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        result = baseCosts[0];
        for(int base:baseCosts){
            backtrack(toppingCosts,base,0,target);
        }
        return result;
    }
    public void backtrack(int[] top,int base,int start,int target){
        if((Math.abs(target-base)<Math.abs(target-result))|| Math.abs(target-base) == Math.abs(target-result) && base<result ){
            result = base;
        }
        if(start == top.length){
            return;
        }
        backtrack(top,base,start+1,target);
        backtrack(top,base+top[start],start+1,target);
        backtrack(top,base+2*top[start],start+1,target);
    }
}