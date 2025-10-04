// Last updated: 04/10/2025, 15:52:24
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(j-i+1>k){
            if(Math.abs(arr[i]-x)>Math.abs(arr[j]-x)){
                i++;
            }
            else{
                j--;
            }
        }
        for(int q=i;q<=j;q++){
            res.add(arr[q]);
        }
        return res;
    }
}