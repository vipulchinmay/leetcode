// Last updated: 04/10/2025, 15:51:07
class Solution {
    int result = Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        int children[] = new int[k];
        backtrack(0,k,children,cookies);
        return result;
    }
    public void backtrack(int i,int k,int children[],int cookies[]){
        if(i>=cookies.length){
            int unfairness = 0;
            for(int n:children){
                unfairness = Math.max(unfairness,n);
            }
            result = Math.min(result,unfairness);
            return;
        }
        int cookie = cookies[i];
        for(int j=0;j<k;j++){
            children[j]+=cookie;
            backtrack(i+1,k,children,cookies);
            children[j]-=cookie;
        }
    }
}