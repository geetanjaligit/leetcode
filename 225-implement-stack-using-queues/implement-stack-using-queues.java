class MyStack {

    Queue <Integer>qe=new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) { //O(1)
        // qe.add(x);
        qe.add(x);
		for(int i=0;i<qe.size()-1;i++)
		{
		    qe.add(qe.remove());
		}
    }
    
    public int pop() {  //O(n)
        if(empty())
		{
			return -1;
		}
		// int count=0;
		// while(count<qe.size()-1)
		// {
		//    qe.add(qe.remove());
		//    count++;
		// }
		// return qe.remove();
        return qe.remove();

    }
    
    public int top() {   //O(n)
        
		if(empty())
		{ 
			return -1;
		}
		// int count=0;
		// while(count<qe.size()-1)
		// {
		//    qe.add(qe.remove());
		//    count++;
		// }
	    // int x= qe.peek();
		// qe.add(qe.remove());
		// return x;
        return qe.peek();
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