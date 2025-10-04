// Last updated: 04/10/2025, 15:49:51
class Solution {
    Set<Character> set = new HashSet<>(Arrays.asList('A','E','I','O','U','a','e','i','o','u'));
    public int maxFreqSum(String s) {
        int maxv = 0;
        int maxc = 0;
        Map<Character,Integer> hm = new HashMap<>();
        for(char ch : s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(char ch : hm.keySet()){
            if(set.contains(ch)){
                maxv = Math.max(maxv,hm.get(ch));
            }
            else{
                maxc = Math.max(maxc,hm.get(ch));
            }
        }
        return maxv+maxc;
    }
}