// Last updated: 04/10/2025, 15:50:10
class Solution {
    public int countAsterisks(String s) {

        String output = s.replaceAll("\\|.*?\\|", "");
        int count = 0;
        for(char ch : output.toCharArray()){
            if(ch == '*'){
                count++;
            }
        }
        return count;
    }
}