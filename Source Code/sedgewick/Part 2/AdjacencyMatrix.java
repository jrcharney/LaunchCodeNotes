/**
 * Program 3.16
 * Adjacency-matrix graph representation
 */
class AdjacencyMatrix {
    public static void main(String[] args){
        int v = Integer.parseInt(args[0]);      // vertices (points)
        int e = Integer.parseInt(args[1]);      // edges (paths)
        // declare the square matrix
        boolean adj[][] = new boolean[v][v];
        // define the values for each cell in the square matrix
        for(int i = 0; i < v; i++){
            for(int j = 0; j < v; j++){
                adj[i][i] = false;
            }
        }
        // set each diagonal value in the square matrix 
        for(int i = 0; i < v; i++){
            adj[i][i] = true;
        }
        // ask for values
        for(In.init(); !In.empty(); ){
            int i = In.getInt();
            int j = In.getInt();
            adj[i][j] = true;
            adj[j][i] = true;
        }
    }
}
