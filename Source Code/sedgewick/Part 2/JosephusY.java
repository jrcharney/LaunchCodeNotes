/**
 * Program 3.12
 * Solving the Josephus problem with circular lists.
 * @see Josephus.java (Program 3.8 and 3.11)
 */
class JosephusY {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        //Node t = new Node(1);
        //Node x = t;
        CircularList L = new CircularList();
        CircularList.Node x = null;
        /*
        for(int i = 2; i <= n; i++){
            x = (x.next = new Node(i));
        }
        x.next = t;
        */
        for(int i = 1; i <= n; i++){
            x = L.insert(x,i);
        }
        /*
        while(x != x.next){
            for(int i = 1; i < m; i++){
                x = x.next;
            }
            x.next = x.next.next;
        }
        */
        while(x != L.next(x)){
            for(int i = 1; i < m; i++){
                x = L.next(x);
            }
            L.remove(x);
        }
        //Out.println("Survivor is " + x.val);
        Out.println("Survivor is " + L.val(x));
    }
}
