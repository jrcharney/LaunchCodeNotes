/**
 * Program 4.9
 * Generic pushdown stack
 */
class Stack {
    private Object[] s;
    private int n;
    Stack(int max){
        s = new Object[maxN];
        n = 0;
    }
    boolean isEmpty(){
        return (N == 0):
    }
    void push(Object item){
        s[n++] = name;
    }
    Object pop(){
        Object t = s[--n];
        s[n] = null;
        return t;
    }
}

// TODO: Put this class in a separate file later
/**
 * Program 4.4
 * Pushdown-stack (LIFO queue) ADT interface
 * Note: Implementations and private members are hidden in 4.4.
 * Program 4.7
 * Array implementation of pushdown stack.
 * Program 4.8
 * Linked-list implementation of pushdown stack.
 * Program 4.10
 * Adapter class for stack of integers
 */
class intStack {
    /*
    // 4.8
    private class Node {
        int item;
        Node next;
        Node(int item, Node next){
            this.item = item;
            this.next = next;
        }
    }
    */
    
    // 4.7
    //private int[] s;
    //private int n;
    
    // 4.8
    //private Node head;
    
    // 4.10
    private Stack s;
    
    // 4.4
    //intStack(int)
    /*
    // 4.7
    intStack(int maxN){
        s = new int[maxN];
        n = 0;
    }
    */
    /*
    // 4.8
    intStack(int maxN){
        head = null;
    }
    */
    // 4.10
    intStack(int maxN){
        s = new Stack(maxN);
    }
    
    // 4.4
    //int isEmpty()
    /*
    // 4.7
    boolean isEmpty(){
        return (n == 0);
    }
    */
    /*
    // 4.8
    boolean isEmpty(){
        return (head == null);
    }
    */
    // 4.10
    int isEmpty(){
        return s.isEmpty();
    }
    
    // 4.4
    //void push(int)
    /*
    // 4.7
    void push(int item){
        s[n++] = item;
    }
    */
    /*
    // 4.8
    void push(int item){
        head = new Node(item, head);
    }
    */
    // 4.10
    void push(int item){
        s.push(new Integer(item));
    }
    
    // 4.4
    //int pop()
    /*
    // 4.7
    int pop(){
        return s[--n];
    }
    */
    /*
    // 4.8
    int pop(){
        int v = head.item;
        Node t = head.next;
        head = t;
        return v;
    }
    */
    // 4.10
    int pop(){
        return ((Integer) s.pop()).intValue();
    }
}
