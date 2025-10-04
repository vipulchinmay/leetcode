// Last updated: 04/10/2025, 15:50:40
class Solution {
    String vowels = "aeiouAEIOU";
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<n/2;i++){
            sb1.append(s.charAt(i));
        }
        for(int i=n/2;i<n;i++){
            sb2.append(s.charAt(i));
        }
        for(int i=0;i<sb1.length();i++){
            if(vowels.indexOf(sb1.charAt(i))!=-1){
                count1++;
            }
        }
        for(int i=0;i<sb2.length();i++){
            if(vowels.indexOf(sb2.charAt(i))!=-1){
                count2++;
            }
        }
        return count1 == count2;
    }
}