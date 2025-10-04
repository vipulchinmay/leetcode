// Last updated: 04/10/2025, 15:54:02
class Node{
    Node links[] = new Node[26];
    boolean flag = false;
    public Node(){

    }
    boolean containsKey(char ch){
        return links[ch-'a']!=null;
    }
    void put(char ch,Node node){
        links[ch-'a'] = node;
    }
    boolean isEnd(){
        return flag;
    }
    void setFlag(){
        flag = true;
    }
    Node get(char ch){
        return links[ch-'a'];
    }
}
class Trie{
    private static Node root;
    public Trie(){
        root = new Node();
    }
    public static void insert(String word){
        Node node = root;
        for(int i=0;i<word.length();i++){
            if(!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i),new Node());
            }
            node = node.get(word.charAt(i));
        }
        node.setFlag();
    }
    public static boolean contains(String word){
        Node node = root;
        for(int i=0;i<word.length();i++){
            if(!node.containsKey(word.charAt(i))){
                return false;
            }
            node = node.get(word.charAt(i));
        }
        return node.isEnd();
    }
    public static boolean checkPrefix(String word,int start,int end){
        Node node = root;
        for(int i=start;i<end;i++){
            if(!node.containsKey(word.charAt(i))){
                return false;
            }
            node = node.get(word.charAt(i));
        }
        return node.isEnd();
    }
}
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Trie obj = new Trie();
        for(String word : wordDict){
            obj.insert(word);
        }
        int n = s.length();
        boolean word[] = new boolean[n+1];
        word[0] = true;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                if(word[j] && obj.checkPrefix(s,j,i)){
                    word[i] = true;
                    break;
                }
            }
        }
        return word[n];
    }
}