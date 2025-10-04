// Last updated: 04/10/2025, 15:50:32
class Solution {
    public boolean checkIfPangram(String sentence) {
        char ch[] = sentence.toCharArray();
        Map<Character,Integer> hm = new HashMap<>();
        for(char c : ch){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        return hm.size() == 26;
    }
}