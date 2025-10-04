// Last updated: 04/10/2025, 15:50:56
class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set= new HashSet<>();
        int seen = 1 << k;
        for(int i=0;i<=s.length()-k;i++){
            String sub = s.substring(i,i+k);
            set.add(sub);
            if(set.size() == seen){
                return true;
            }
        }    
        return false;
    }
}