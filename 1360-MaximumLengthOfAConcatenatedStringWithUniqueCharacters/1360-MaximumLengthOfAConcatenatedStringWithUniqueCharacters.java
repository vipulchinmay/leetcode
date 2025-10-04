// Last updated: 04/10/2025, 15:51:11
class Solution {
    public int maxLength(List<String> arr) {
        String temp = "";
        int n = arr.size();
        return calculate(0,arr,temp,n);
    }
    public int calculate(int i,List<String> s, String temp,int n){
        if(i == n){
            return temp.length();
        }
        int ans = 0;
        // include
        if(isUnique(temp + s.get(i))){
            ans = Math.max(ans, calculate(i + 1, s, temp + s.get(i), n));
        }
        // exclude
        ans = Math.max(ans, calculate(i + 1, s, temp, n));
        return ans;
    }
    public boolean isUnique(String s){
        boolean[] visited = new boolean[26];
        for (char c : s.toCharArray()) {
            if (visited[c - 'a']) {
                return false; 
            }
            visited[c - 'a'] = true; 
        }
        return true; 
    }
}