// Last updated: 04/10/2025, 15:52:46
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        // int count[] = new int[26];
        // String sub = "";
        // for(int i =0;i<s.length();i++){
        //     if(count[s.charAt(i)-'a'] == 1){
        //         break;
        //     }
        //     sub+=s.charAt(i);
        //     count[s.charAt(i)-'a'] = 1;
        // }
        // return s.length()%sub.length() == 0;

        // String doubled = s + s;
        // String trimmed = doubled.substring(1, doubled.length() - 1);
        // return trimmed.contains(s);

        String sub = "";
        for (int i = 0; i < s.length() / 2; i++) {
            sub += s.charAt(i); 
            if (s.length() % sub.length() == 0) {
                StringBuilder sb = new StringBuilder();
                int repeat = s.length() / sub.length();
                for (int j = 0; j < repeat; j++) {
                    sb.append(sub);
                }
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}