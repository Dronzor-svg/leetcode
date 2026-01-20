class MyStack {
    Queue<Integer> q=new ArrayDeque<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
        int s=q.size();
        for(int i=1;i<s;i++)
        {
            q.add(q.peek());
            q.poll();
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        if(q.size()>0) return false;
        else return true;
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