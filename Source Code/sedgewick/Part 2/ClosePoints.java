/**
 * Program 3.7
 * Closest-point computation
 * @import Point.java
 * Program 3.18
 * A two-dimmensional array of lists
 * TODO: This class needs to be adjusted to work with the modified Point class as of 4.1
 */
class ClosePoints {
    // 3.18
    static class Node {
        Point p;
        Node next;
        Node(Point x, Node t){
            p = x;
            next = t;
        }
    }
    static int g, count = 0;
    static double d;
    static Node[][] grid;
    static void gridInsert(Point p){
        int gx = (int)(p.x*g)+1;
        int gy = (int)(p.y*g)+1;
        Node s, t = new Node(p,grid[x][y]);
        for(int i = gx-1; i <= gx+1; i++){
            for(int j = gy-1; j <= gy+1; j++){
                for(s = grid[i][j]; s != null; s = s.next){
                    if(s.p.distance(t.p) < d){
                        count++;
                    }
                }
            }
        }
        grid[gx][gy] = t;
    }
    
    public static void main(String[] args){
        //int count = 0;    // 3.7
        int n = Integer.parseInt(args[0]);
        int d = Double.parseDouble(args[1]);

        /*
        // 3.7
        Point[] a = new Point[n];
        for(int i = 0; i < n; i++){
            a[i] = new Point();
        }
        for(int i = 0; i < n; i++){
            for(int j = i+1; i < n; i++){
                if(a[i].distance(a[j]) < d){
                    count++;
                }
            }
        }
        */
        
        // 3.18
        // define the grid size
        g = (int)(1.0/d);
        // define the grid
        grid = new Node[g+2][g+2];
        // initialize the grid values
        for(int i=0; i < g+2; i++){
            for(int j=0; j < g+2; j++){
                g[i][j] = null;
            }
        }
        // insert points in the grid
        for(int i=0; i < n; i++){
            gridInsert(new Point());
        }

        
        Out.print(count + " pairs ");
        Out.println("closer than " + d);
    }
}
