// Last updated: 04/10/2025, 15:51:10
class Solution {
    int result=0;
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        Map<Character,Integer> hm = new HashMap<>();
        for(char c:letters){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        backtrack(words,hm,score,0,0);
        return result;
    }
    public void backtrack(String[] words,Map<Character,Integer> hm,int[] scores,int start, int current){
        if(start == words.length){
            result = Math.max(result,current);
            return;
        }
        backtrack(words,hm,scores,start+1,current);
        String w = words[start];
        Map<Character,Integer> hmf = new HashMap<>(hm);
        int temp=0;
        boolean valid = true;
        for(char ch : w.toCharArray()){
            hmf.put(ch,hmf.getOrDefault(ch,0)-1);
            if(hmf.get(ch)<0){
                valid = false;
                break;
            }
            temp += scores[ch-'a'];
        }
        if(valid){
            backtrack(words,hmf,scores,start+1,current+temp);
        }
    }
}