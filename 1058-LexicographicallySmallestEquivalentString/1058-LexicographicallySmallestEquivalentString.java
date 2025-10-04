// Last updated: 04/10/2025, 15:51:28
class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        DSU obj = new DSU();
        StringBuilder sb = new StringBuilder(baseStr);
        for(int i=0;i<s1.length();i++){
            obj.union(s1.charAt(i)-'a',s2.charAt(i)-'a');
        }
        for(int i=0;i<sb.length();i++){
            sb.setCharAt(i,(char)('a'+obj.find(baseStr.charAt(i)-'a')));
        }
        return sb.toString();
    }
}
class DSU{
    int parent[];
    DSU(){
        parent = new int[26];
        for(int i=0;i<26;i++){
            parent[i] = i;
        }
    }
    public int find(int i){
        if(parent[i] != i){
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }
    public void union(int x,int y){
        int rx = find(x);
        int ry = find(y);
        if(rx == ry){
            return;
        }
        if(rx<ry){
            parent[ry] = rx;
        }
        else{
            parent[rx] = ry;
        }
    }
}