/**
 * Program 3.10
 * List insert sort
 */
class ListSortExample {
    static class Node {
        int val;
        Node next;
        Node(int v, Node t){
            val = v;
            next = t;
        }
    }
    static Node create(){
        Node a = new Node(0, null);
        for(In.init(); !In.empty(); ){
            anext = new Node(In.getInt(), a.next);      // NOTE: I think you are prompted for an integer here.
        }
        return a;
    }
    static Node sort(Node a){
        Node t, u, x, b = new Node(0,null);
        while(a.next != null){
            t = a.next;
            u = t.next;
            a.next = u;
            for(x = b; x.next != null; x = x.next){
                if(x.next.val > t.val) break;
            }
            t.next = x.next;
            x.next = t;
        }
        return b;
    }
    static void print(Node h){
        for(Node t = h.next; t != null; t = t.next){
            Out.println(t.val + "");
        }
    }
    public static void main(String[] args){
        print(sort(create()));
    }
}
