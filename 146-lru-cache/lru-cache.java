class LRUCache {

    class Node{
        int key,val;
        Node next;
        Node prev;
        Node(int k,int v)
        {
            this.key=k;
            this.val=v;
        }
    }
    Node head=new Node(-1,-1);
    Node tail=new Node(-1,-1);
    HashMap<Integer, Node> cache;
    private int capacity;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.cache = new HashMap<>();
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!cache.containsKey(key))
        {
            return -1;
        }
        Node ansNode=cache.get(key);
        int ans=ansNode.val;
        cache.remove(key);
        remove(ansNode);
        insertNextAtHead(ansNode);
        cache.put(key,ansNode);
        return ans;
    }
    public void insertNextAtHead(Node newNode)
    {
        Node oldNext=head.next;
        head.next=newNode;
        newNode.prev=head;
        oldNext.prev=newNode;
        newNode.next=oldNext;
    }
    public void remove(Node oldNode)
    {
       Node prevNode=oldNode.prev;
       Node nextNode=oldNode.next;
       prevNode.next=nextNode;
       nextNode.prev=prevNode;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key))
        {
            remove(cache.get(key));
            cache.remove(key);
        }
        //capacity reached
        if(cache.size()==capacity)
        {
            cache.remove(tail.prev.key);
            remove(tail.prev);
        }
        Node newNode=new Node(key,value);
        insertNextAtHead(newNode);
        cache.put(key,newNode);
    }
}


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */