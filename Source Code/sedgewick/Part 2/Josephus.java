/**
 * Program 3.8
 * Circular list example (Josephus problem)
 * To represent people arranged in a circle, we build a circular linked list,
 * with a link from each person to the person to the left in the circle.
 * @see JosephusY.java (Program 3.11 and 3.12)
 */
class Josephus {
    static class Node {
        int val;
        Node next;
        Node(int v){
            val = v;
        }
    }
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        Node t = new Node(1);
        Node x = t;
        for(int i = 2; i <= n; i++){
            x = (x.next = new Node(i));
        }
        x.next = t;
        while(x != x.next){
            for(int i = 1; i < m; i++){
                x = x.next;
            }
            x.next = x.next.next;
        }
        Out.println("Survivor is " + x.val);
    }
}
