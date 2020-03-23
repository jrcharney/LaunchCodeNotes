/**
 * Program 4.15
 * FIFO queue ADT interface
 * Note: For Program 4.15, implementations and private members are hidden. 
 * @see Stack.java for LIFO
 * Program 4.16
 * FIFO queue linked-list implementation
 * Program 4.17
 * FIFO queue array implementation
 * Program 4.23
 * Cloneable queue ADT interface
 * @see SimulateQueues.java
 * Note: For Program 4.23, implementations and private members are hidden. 
 * But we're not going to do that.
 * The only thing we will add in 4.23 is that intQueue has the Cloneable interface
 * Program 4.24
 * Linked-list implementation of a cloneable queue
 * Basically we add the clone method from 4.23.
 */
class intQueue implements Cloneable {
    /*
    // 4.15
    intQueue(int)
    int empty()
    void put(int)
    int get()
    */
    /*
    // 4.23
    intQueue(int)
    public Object clone()
    boolean empty()
    void put(int)
    int get()
    */

    /*
    // 4.16
    private class Node {
        int item;
        Node next;
        Node(int item, Node next){
            this.item = item;
            this.next = null;
        }
    }
    private Node head, tail;
    */
    // 4.17
    private int[] q;
    private int n;
    private int head, tail;

    /*
    // 4.16
    intQueue(int max){
        head = null;
        tail = null;
    }
    */
    // 4.17
    intQueue(int maxN){
        n = maxN + 1;
        q = new int[n];
        head = n;
        tail = 0;
    }

    // 4.24
    public Object clone(){
        intQueue q = new intQueue(0);
        for(Node t = head; t != null; t = t.next)
            q.put(t.item);
        return q;
    }

    /*
    // 4.16
    boolean empty(){
        return (head == null);
    }
    */
    // 4.17
    boolean empty(){
        return (head % n == tail);
    }

    /*
    // 4.16
    void put(int item){
        Node t = tail;
        tail = new Node(item);
        if(empty()){
            head = tail;
        } else {
            t.next = tail;
        }
    }
    */
    // 4.17
    void put(int item){
        q[tail++] = item;
        tail = tail % n;
    }

    /*
    // 4.16
    int get(){
        int v = head.item;
        Node t = head.next;
        head = t;
        return v;
    }
    */
    int get(){
        head = head % n;
        return q[head++];
    }

}
