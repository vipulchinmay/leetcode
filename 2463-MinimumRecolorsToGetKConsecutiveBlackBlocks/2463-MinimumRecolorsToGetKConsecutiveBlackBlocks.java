// Last updated: 04/10/2025, 15:50:06
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int wc = 0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i) == 'W'){
                wc+=1;
            }
        }
        int min = wc;
        for(int i=k;i<n;i++){
            if(blocks.charAt(i-k) == 'W'){
                wc-=1;
            }
            if(blocks.charAt(i) == 'W'){
                wc+=1;
            }
            min = Math.min(min,wc);
        }
        return min;
    }
}