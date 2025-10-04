// Last updated: 04/10/2025, 15:53:35
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n != m){
            return false;
        }
        HashMap<Character,Character> hm = new HashMap<>();
        HashMap<Character,Character> hm2 = new HashMap<>();
        
        for(int i=0;i<n;i++){
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            if(hm.containsKey(s1)){
                if(hm.get(s1)!=t1){
                    return false;
                }
            }
            else{
                hm.put(s1,t1);
            }

            if(hm2.containsKey(t1)){
                if(hm2.get(t1)!=s1){
                    return false;
                }
            }
            else{
                hm2.put(t1,s1);
            }
        }
        return true;
    }
}