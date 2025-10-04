// Last updated: 04/10/2025, 15:50:00
class Solution {
    ArrayList<Character> lt = new ArrayList<>();
    Set<Character> set = new HashSet(Arrays.asList('A','E','I','O','U','a','e','i','o','u'));
    public String sortVowels(String s) {
        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                lt.add(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(lt);
        int idx = 0;
        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                sb.append(lt.get(idx++));
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}