// Last updated: 04/10/2025, 15:53:27
class Solution {
    int n,m;
    boolean[][] vis;
    Set<String> res = new HashSet<>();
    int directions[][] = {{1,0},{0,1},{-1,0},{0,-1}};
    Trie obj = new Trie();
    public List<String> findWords(char[][] board, String[] words) {
        n = board.length;
        m = board[0].length;
        vis = new boolean[n][m];
        for(String w : words){
            obj.insert(w);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(obj.root.containsKey(board[i][j])){
                    dfs(i, j, Trie.root.get(board[i][j]), board, "" + board[i][j]);
                }
            }
        }
        return new ArrayList<>(res);
    }

    public void dfs(int i,int j,Node node,char[][] board,String str){
        if(node.flag){
            res.add(str);
            node.flag = false;
        }
        vis[i][j] = true;
        for(int d[] : directions){
            int nr = i+d[0];
            int nc = j+d[1];
            if(nr>=0 && nr<n && nc>=0 && nc<m && !vis[nr][nc]){
                char ch = board[nr][nc];
                if(node.containsKey(ch)){
                    dfs(nr,nc,node.get(ch),board,str+ch);
                }
            }
        }
        vis[i][j] = false;
    }
}
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
    Node get(char ch){
        return links[ch-'a'];
    }
    void setFlag(){
        flag = true;
    }
}
class Trie{
    public static Node root;
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
}