// Last updated: 04/10/2025, 15:53:07
class Solution {
    public String removeDuplicateLetters(String s) {
        int n = s.length();
        int count[] = new int[26];
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            int idx = (int)(c-'a');
            count[idx] = i;
        }
        boolean present[] = new boolean[26];
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            int idx = (int)(ch-'a');
            if(present[idx] == false){
                while(st.size()>0 && st.peek()>ch && count[(int)(st.peek()-'a')]>i){
                    present[(int)(st.peek()-'a')] = false;
                    st.pop();
                }
                st.push(ch);
                present[idx] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}