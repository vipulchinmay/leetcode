// Last updated: 04/10/2025, 15:50:49
class Solution {
    int max = 0;
    public int maxUniqueSplit(String s) {
        Set<String> set = new HashSet<>();
        int current = 0;
        backtrack(0,current,set,s);
        return max;
    }
    public void backtrack(int start,int current,Set<String> set,String s){
        if(start == s.length()){
            max = Math.max(max,current);
            return;
        }
        for(int i=start+1;i<=s.length();i++){
            String sub = s.substring(start,i);
            if(!set.contains(sub)){
                set.add(sub);
                backtrack(i,current+1,set,s);
                set.remove(sub);
            }
        }
    }
}