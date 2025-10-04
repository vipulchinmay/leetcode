// Last updated: 04/10/2025, 15:52:54
class Solution {
    public int findMaximumXOR(int[] nums) {
        Trie obj = new Trie();
        int max = Integer.MIN_VALUE;
        for(int n: nums){
            obj.insert(n);
        }
        for(int n: nums){
            max = Math.max(max,obj.getMax(n));
        }
        return max;
    }
}
class Trie{
    private static Node root;
    public Trie(){
        root = new Node();
    }
    public static void insert(int num){
        Node node = root;
        for(int i=31;i>=0;i--){
            int bit = (num >> i)&1;
            if(!node.containsKey(bit)){
                node.put(bit,new Node());
            }
            node = node.get(bit);
        }
    }
    public static int getMax(int num){
        Node node = root;
        int max = 0;
        for(int i=31;i>=0;i--){
            int bit = (num >> i)&1;
            if(node.containsKey(1-bit)){
                max = max|(1<<i);
                node = node.get(1-bit);
            }
            else{
                node = node.get(bit);
            }
        }
        return max;
    }
}
class Node{
    Node links[] = new Node[2];
    public Node(){

    }
    boolean containsKey(int ch){
        return links[ch]!=null;
    }
    void put(int ch,Node node){
        links[ch] = node;
    }
    Node get(int ch){
        return links[ch];
    }
}