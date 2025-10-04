// Last updated: 04/10/2025, 15:52:48
class Solution {
    public String frequencySort(String s) {
        char ch[] = s.toCharArray();
        Map<Character,Integer> mp = new HashMap<>();
        for(char c : ch){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character,Integer>> lt = new ArrayList<>(mp.entrySet());
        lt.sort((a,b)-> b.getValue().compareTo(a.getValue()));
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : lt){
            char c = entry.getKey();
            int freq = entry.getValue();
            for(int i=0;i<freq;i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}