// Last updated: 04/10/2025, 15:50:09
class Solution {
    public String decodeMessage(String key, String message) {
        String text = key.replace(" ","");
        HashMap<Character,Character> map = new HashMap<>();
        char c = 'a';
        for(int i=0;i<text.length();i++){
            if(!map.containsKey(text.charAt(i))){
                map.put(text.charAt(i),c++);
            }    
        }
        String code = "";
        for(int i=0;i<message.length();i++){
            if(message.charAt(i) == ' '){
                code+=" ";
            }
            else{
                code+=map.get(message.charAt(i));
            }
        }
        return code;
    }
}