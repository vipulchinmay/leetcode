// Last updated: 04/10/2025, 15:50:58
class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int max = -1;
        for(int n: arr){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for(int n : arr){
            if(hm.get(n) == n){
                max = Math.max(max,n);
            }
        }
        return max;
    }
}