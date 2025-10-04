// Last updated: 04/10/2025, 15:50:42
class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!= word2.length()){
            return false;
        }
        Map<Character,Integer> hm1 = new HashMap<>();
        Map<Character,Integer> hm2 = new HashMap<>();
        for(char ch : word1.toCharArray()){
            hm1.put(ch,hm1.getOrDefault(ch,0)+1);
        }
        for(char ch : word2.toCharArray()){
            hm2.put(ch,hm2.getOrDefault(ch,0)+1);
        }
        if (!hm1.keySet().equals(hm2.keySet())) {
            return false;
        }
        List<Integer> v1 = new ArrayList<>(hm1.values());
        List<Integer> v2 = new ArrayList<>(hm2.values());
        Collections.sort(v1);
        Collections.sort(v2);

        return v1.equals(v2);
    }
}