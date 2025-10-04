// Last updated: 04/10/2025, 15:50:31
class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        int w = 3;
        int count =0;
        for(int i=0;i<=n-w;i++){
            Set<Character> set = new HashSet<>();
            boolean bool = true;
            for(int j=i;j<i+w;j++){
                if(set.contains(s.charAt(j))){
                    bool = false;
                    break;
                }
                set.add(s.charAt(j));
            }
            if(bool){
                count++;
            }
        }
        return count;
    }
}