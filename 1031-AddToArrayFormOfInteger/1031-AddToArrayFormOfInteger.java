// Last updated: 04/10/2025, 15:51:31
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int p = num.length-1;
        int c=0;
        while(p>=0 || k>0){
            int n = 0;
            if(p>=0){
                n = num[p];
            }
            int rem = k%10;
            int sum = rem + n + c;
            int d = sum%10;
            c = sum / 10;
            list.add(d);
            p--;
            k = k/10;
        }
        if(c>0){
            list.add(c);
        }
        Collections.reverse(list);
        return list;
    }
}