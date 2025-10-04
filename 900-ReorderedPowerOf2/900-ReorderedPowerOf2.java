// Last updated: 04/10/2025, 15:51:50
class Solution {
    public boolean reorderedPowerOf2(int n) {
        if(n == 1){
            return true;
        }
        int target[] = count(n);
        for(int i=0;i<31;i++){
            if(ismatch(target,count(1<<i))){
                return true;
            }
        }
        return false;
    }
    public int[] count(int n){
        int[] count = new int[10];
        while(n>0){
            int r = n%10;
            count[r]++;
            n = n/10;
        }
        return count;
    }
    public boolean ismatch(int a[],int b[]){
        for(int i=0;i<10;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}