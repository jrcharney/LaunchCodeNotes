/**
 * Program 3.11
 * Circular-list class
 * Program 3.13
 * Circular-list class with memory allocation
 * @see program 3.8 and 3.12
 */
class CircularList {
    static class Node {
        int val;
        int next;   // Node next;   // changed to int in 3.13?
        // Node(int v){val = v;}    // removed in 3.13
    }
    static Node m[];                // added in 3.13
    static int free, max = 10000;   // added in 3.13
    
    // constructor added in 3.13
    CircularList(){
        M = new Node[max + 1];
        for(int i = 0; i < max; i++){
            M[i] = new Node();
            M[i].next = i+1;
        }
        M[max] = new Node();
        M[max].next = 0;
        free = 0;
    }
    
    Node next(Node x){
        //return x.next;    // 3.11
        return M[x.next];   // 3.13
    }
    int val(Node x){
        return x.val;
    }
    Node insert(Node x, int v){
        /*
        // 3.11
        Node t = new Node(v);
        if(x == null){
            t.next = t;
        }
        else{
            t.next = x.next;
            x.next = t;
        }
        return t;
        */
        // 3.13
        int i = free;
        free = M[free].next;
        M[i].val = v;
        if(x == null){
            M[i].next = i;
        } else {
            M[i].next = x.next;
            x.next = i;
        }
        return M[i];
    }
    void remove(Node x){
        // x.next = x.next.next;    // 3.11
        // 3.13
        int i = x.next;
        x.next = M[i].next;
        M[i].next = free;
        free = i;
    }
}
