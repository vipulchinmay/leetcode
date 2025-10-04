// Last updated: 04/10/2025, 15:53:54
class MinStack {
    Stack<Integer> st;
    Stack<Integer> min;
    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        if(st.size() == 0 || min.peek()>=val){
            min.push(val);
        }
        st.push(val);
    }
    
    public void pop() {
        int e1 = st.pop();
        int e2 = min.peek();
        if(e1 == e2){
            min.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */