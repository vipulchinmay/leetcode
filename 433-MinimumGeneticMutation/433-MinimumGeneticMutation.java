// Last updated: 04/10/2025, 15:52:53
class Solution {
    char alp[] = {'A','C','G','T'};
    int count = 0;
    public int minMutation(String startGene, String endGene, String[] bank) {
        List<String> bk = new ArrayList<>(Arrays.asList(bank));
        Set<String> vis = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.add(startGene);
        vis.add(startGene);
        while(!q.isEmpty()){
            int size = q.size();
            for(int j=0;j<size;j++){
                String pop = q.poll();
                if(pop.equals(endGene)){
                    return count;
                }
                for(char ch : alp){
                    for(int i=0;i<pop.length();i++){
                        String neigh = pop.substring(0, i) + ch + pop.substring(i + 1);
                        if(!vis.contains(neigh) && bk.contains(neigh)){
                            vis.add(neigh);
                            q.add(neigh);
                        }
                    }
                }
            }
            count++;
        }
        return -1;
    }
}