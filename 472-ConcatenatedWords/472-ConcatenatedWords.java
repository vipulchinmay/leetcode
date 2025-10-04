// Last updated: 04/10/2025, 15:52:44
class Solution {
    Set<String> set;
    Map<String,Boolean> hm;
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        set = new HashSet<>(Arrays.asList(words));
        int n = words.length;
        List<String> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            String w = words[i];
            if(w.isEmpty()){
                continue;
            }
            hm = new HashMap<>();
            if(solution(w,true)){
                result.add(w);
            }
        }
        return result;
    }
    public boolean solution(String s,boolean flag){
        if(!flag && set.contains(s)){
            return true;
        }
        if(hm.containsKey(s)){
            return hm.get(s);
        }
        for(int i=1;i<s.length();i++){
            String prefix = s.substring(0,i);
            String suffix = s.substring(i);
            if(set.contains(prefix) && solution(suffix,false)){
                hm.put(s,true);
                return true;
            }
        }
        hm.put(s,false);
        return false;
    }
}