// Last updated: 04/10/2025, 15:49:49
class TaskManager {
    public static class Task{
        int taskId, userId, priority;
        public Task(int userId,int taskId,int priority){
            this.userId = userId;
            this.taskId = taskId;
            this.priority = priority;
        }
    }

    public Map<Integer,Task> hm = new HashMap<>();
    public PriorityQueue<Task> pq;

    public TaskManager(List<List<Integer>> tasks) {
        pq = new PriorityQueue<>((a,b) -> {
            if(a.priority != b.priority){
                return b.priority - a.priority;
            }
            return b.taskId - a.taskId;
        });

        for(List<Integer> lt : tasks){
            int userId = lt.get(0);
            int taskId = lt.get(1);
            int priority = lt.get(2);
            Task t = new Task(userId,taskId,priority);
            hm.put(taskId,t);
            pq.offer(t);
        }
    }
    
    public void add(int userId, int taskId, int priority) {
        Task t = new Task(userId, taskId, priority);
        hm.put(taskId,t);
        pq.offer(t);
    }
    
    public void edit(int taskId, int newPriority) {
        Task old = hm.get(taskId);
        Task t = new Task(old.userId,old.taskId,newPriority);
        hm.put(taskId,t);
        pq.offer(t);
    }
    
    public void rmv(int taskId) {
        hm.remove(taskId);
    }
    
    public int execTop() {
        while(!pq.isEmpty()){
            Task t = pq.poll();
            Task valid = hm.get(t.taskId);
            if(valid!=null && valid.priority == t.priority && valid.userId == t.userId){
                hm.remove(t.taskId);
                return t.userId;
            }
        }
        return -1;
    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */