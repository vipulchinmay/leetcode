// Last updated: 04/10/2025, 15:52:51
class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int count = 1;
        StringBuilder str = new StringBuilder("");
        str.append(chars[0]);
        if(n == 1){
            return 1;
        }
        else{
            for(int i=1;i<n;i++){
                if(chars[i-1]!=chars[i]){
                    if(count>1){
                        str.append(count+"");
                    }
                    str.append(chars[i]);
                    count = 1;
                }
                else{
                    count++;
                }
            }
            if(count>1){
                str.append(count+"");
            }
        }
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            chars[i] = c;
        }
        return str.length();
    }
}