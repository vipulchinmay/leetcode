// Last updated: 04/10/2025, 15:52:18
class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<List<String>> result = new ArrayList<>();
        int n = accounts.size();
        disjoint obj = new disjoint(n);
        Map<String,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=1;j<accounts.get(i).size();j++){
                if(hm.containsKey(accounts.get(i).get(j)) == false){
                    hm.put(accounts.get(i).get(j), i);
                }
                else{
                    obj.union(i,hm.get(accounts.get(i).get(j)));
                }
            }
        }
        Map<Integer, TreeSet<String>> tree = new HashMap<>();
        for(int i = 0;i<n;i++){
            int a = obj.find(i);
            if(!tree.containsKey(a)){
                tree.put(a,new TreeSet<>());
            }
            List<String> account = accounts.get(i);
            for(int j =1;j<account.size();j++){
                tree.get(a).add(account.get(j));
            }
        }
        for(int i : tree.keySet()){
            List<String> merged = new ArrayList<>();
            merged.add(accounts.get(i).get(0)); // Add name
            merged.addAll(tree.get(i));
            result.add(merged);
        }
        return result;
    }
}
class disjoint{
    List<Integer> parent = new ArrayList<>();
    List<Integer> rank = new ArrayList<>();
    public disjoint(int n){
        for(int i=0;i<n;i++){
            parent.add(i);
            rank.add(0);
        }
    }
    public int find(int n){
        if(n == parent.get(n)){
            return n;
        }
        int ulp = find(parent.get(n));
        parent.set(n,ulp);
        return parent.get(n);
    }
    public void union(int x,int y){
        int n = find(x);
        int m = find(y);
        if(n == m){
            return;
        }
        if(rank.get(n) > rank.get(m)){
            parent.set(m,n);
        }
        else if(rank.get(n) < rank.get(m)){
            parent.set(n,m);
        }
        else{
            parent.set(n,m);
            rank.set(n,rank.get(n)+1);
        }
    }
}