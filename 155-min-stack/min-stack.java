class MinStack {
    Stack<Long> st=new Stack<>();
    long mini;
    public MinStack() {
        mini=Long.MAX_VALUE;
    }
    
    public void push(int val) {
        long v=val;
        if(st.isEmpty()) 
        {
            mini=v;
            st.push(v);
        }
        else
        {
            if(v>mini) st.push(v);
            else
            {
                st.push((2*v)-mini);
                mini=v;
            }
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;
        long x=st.peek();
        st.pop();
        if(x<mini)
        {
            mini=(2*mini)-x;
        } 
    }
    
    public int top() {
        
        long x=st.peek();
        if(mini<=x) return (int)x;
        else return (int)mini;
    }
    
    public int getMin() {
        return (int)mini;
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