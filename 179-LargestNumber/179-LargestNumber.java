// Last updated: 04/10/2025, 15:53:49
class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String s[] = new String[n];
        for(int i=0;i<n;i++){
            s[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(s,(s1,s2)->(s1+s2).compareTo(s2+s1));
        String b = "";
        for(int i = n-1;i>=0;i--){
            b+=s[i];
        }
        if(b.charAt(0) == '0'){
            return "0";
        }
        else{
            return b;
        }
    }
}