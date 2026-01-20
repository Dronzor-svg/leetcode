class MyQueue {
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        int s=s1.size();
        for(int i=0;i<s;i++)
        {
            s2.push(s1.peek());
            s1.pop();
        }
        s1.push(x);
        s=s2.size();
        for(int i=0;i<s;i++)
        {
            s1.push(s2.peek());
            s2.pop();
        }
    }
    
    public int pop() {
        return s1.pop();
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        if(s1.size()>0) return false;
        else return true;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */