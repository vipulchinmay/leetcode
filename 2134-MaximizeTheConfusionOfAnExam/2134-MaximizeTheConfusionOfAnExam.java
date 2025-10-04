// Last updated: 04/10/2025, 15:50:26
class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n = answerKey.length();
        int l=0;
        int c=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = answerKey.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            int max = Math.max(hm.getOrDefault('T',0),hm.getOrDefault('F',0));
            int w = i-l+1;
            int change = w-max;
            if(change > k){
                char left = answerKey.charAt(l);
                hm.put(left,hm.get(left)-1);
                l++;
            }
            c = Math.max(c,i-l+1);
        }
        return c;
    }
}