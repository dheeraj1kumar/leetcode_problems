class MyStack {
  Queue<Integer> q = new LinkedList<Integer>();
    
    // Push element x onto stack.
    public void push(int x) {
        q.add(x);
    }

    // Removes the element on top of the stack.
    public int pop() {
        int size = q.size();
        for(int i = 1; i < size; i++)
            q.add(q.remove());
     return   q.remove();
    }

    // Get the top element.
    public int top() {
        int size = q.size();
        for(int i = 1; i < size; i++)
            q.add(q.remove());
        int ret = q.remove();
        q.add(ret);
        return ret;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q.isEmpty(); 
        
    }
}




/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */