// Last updated: 04/10/2025, 15:52:06
class Solution {
    public List<String> letterCasePermutation(String s) {
        LinkedList<String> lt = new LinkedList<>();
        lt.add(s);
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            if(Character.isLetter(c)){
                int size = lt.size();
                while(size-- > 0){
                    String str = lt.poll();
                    char[] chars = str.toCharArray();
                    chars[i] = Character.toLowerCase(chars[i]);
                    lt.add(String.valueOf(chars));
                    chars[i] = Character.toUpperCase(chars[i]);
                    lt.add(String.valueOf(chars));;
                }
            }
        }
        Collections.sort(lt);
        return lt;
    }
}