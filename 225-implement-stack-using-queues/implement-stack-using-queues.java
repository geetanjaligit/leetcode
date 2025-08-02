class MyStack {

    Queue <Integer>qe=new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        qe.add(x);
    }
    
    public int pop() {
        if(empty())
		{
			return -1;
		}
		int count=0;
		while(count<qe.size()-1)
		{
		   qe.add(qe.remove());
		   count++;
		}
		return qe.remove();
    }
    
    public int top() {
        
		if(empty())
		{ 
			return -1;
		}
		int count=0;
		while(count<qe.size()-1)
		{
		   qe.add(qe.remove());
		   count++;
		}
	    int x= qe.peek();
		qe.add(qe.remove());
		return x;
    }
    
    public boolean empty() {
        if(qe.size()==0)
          return true;
        return false;
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