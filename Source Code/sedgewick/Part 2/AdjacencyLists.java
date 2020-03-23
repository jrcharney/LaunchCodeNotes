/**
 * Program 3.17
 * Adjacency-lists graph representation
 */
class AdjacencyLists {
    static class Node {
        int v;
        Node next;
        Node(int v, Node t){
            this.v = v;
            next = t;
        }
    }
    public static void main(String[] args){
        int v = Integer.parseInt(args[0]);      // vertices (points)
        int e = Integer.parseInt(args[1]);      // edges (paths)
        Node adj[] = new Node[v];
        for(int i = 0; i < v; i++){
            adj[i] = null;
        }
        // ask for values
        for(In.init(); !In.empty(); ){
            int i = In.getInt();
            int j = In.getInt();
            adj[j] = new Node(i, adj[j]);
            adj[i] = new Node(j, adj[i]);
        }
    }    
}
