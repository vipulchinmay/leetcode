// Last updated: 04/10/2025, 15:53:32
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int ad[] : prerequisites){
            adj.get(ad[0]).add(ad[1]);
        }
        int[] indegree = new int[numCourses];
        for(int i = 0;i<numCourses;i++){
            for(int lt : adj.get(i)){
                indegree[lt]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        int count = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            count++;
            for(int lt : adj.get(node)){
                indegree[lt]--;
                if(indegree[lt] == 0){
                    q.add(lt);
                }
            }
        }
        return count ==numCourses;
    }
}