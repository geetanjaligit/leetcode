class MinStack {

    Stack<Integer>st=new Stack<>();
    Stack<Integer>min=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.size()==0){
           st.push(val);
           min.push(val);
        }
        else
        {
            st.push(val);
            if(val>min.peek())
               min.push(min.peek());
            else
               min.push(val);
        }
    }
    
    public void pop() {
        if(st.size()>0){
           st.pop();
           min.pop();
        }
        else
          return;
    }
    
    public int top() {
        if(st.size()>0)
           return st.peek();
        else
           return -1;
    }
    
    public int getMin() {
        if(st.size()>0){
           return min.peek();
        }
        else
          return -1;
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