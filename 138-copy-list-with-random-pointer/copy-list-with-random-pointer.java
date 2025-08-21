/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        //deep copy (step 1)
        Node t1=head;
        Node h=new Node(-1);
        Node t2=h;
        while(t1!=null)
        {
            Node newNode =new Node(t1.val);
            t2.next=newNode;
            t2=t2.next;
            t1=t1.next;
        }
        t2.next=null;

        //make alternate connection(step 2)
        t1=head;
        t2=h.next;
        Node h3=new Node(-1);
        Node t=h3;

        while(t2!=null && t1!=null)
        {
            t.next=t1;
            t1=t1.next;
            t=t.next;
            t.next=t2;
            t2=t2.next;
            t=t.next;
        }
        t=h3;
        t2=h.next;
        t1=head;

        //Assigning random pointer (step 3)
        
        while(t1!=null)
        {
            if(t1.random==null)
            {
                t2.random=null;
            }
            else{
                t2.random=t1.random.next;
            }
            t1=t2.next;
            if(t1!=null)
            {
            t2=t1.next;
            }
            
        }
        t1=head;
        t2=h.next;
        t=h3;

        //Separate the list (step 4)

        while(t1!=null)
        {
            t1.next=t2.next;
            t1=t1.next;
            if(t1==null)
              break;
            t2.next=t1.next;
            if(t2.next==null)
              break;
            t2=t2.next;
        }
        return h.next;
    }
}