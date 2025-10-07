// Last updated: 07/10/2025, 21:52:31
class Solution {
    int a2[];
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        List<Integer> lt = new ArrayList<>();
        Map<Integer,Integer> mp = new HashMap<>();
        int res[] = new int[n];
        for(int i=0;i<n;i++){
            if(rains[i] == 0){
                lt.add(i);
                res[i] = 1;
            }
            else{
                if(mp.containsKey(rains[i])){
                    int idx = mp.get(rains[i]);
                    int j = -1;
                    for(int k=0;k<lt.size();k++){
                        if(lt.get(k) > idx){
                            j = lt.get(k);
                            lt.remove(k);
                            break;
                        }
                    }
                    if(j == -1){
                        return new int[]{};
                    }
                    res[j] = rains[i];
                }
                mp.put(rains[i],i);
                res[i] = -1;
            }
        }
        return res;
    }
}