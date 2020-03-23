/* Program 3.2
 * Point class implementation
 * @file Point.java
 * @class Point
 * NOTE: I added some methods.
 * page 77 (read more about this later)
 * Program 4.1
 * Point class implementation
 * NOTE: Some other programs using the point class will need to be modified!
 */
class Point {
    // set to private in 4.1
    private double x, y;
    
    // default constructor
    Point(){
        // TODO: Define this better
        x = Math.random();
        y = Math.random();
    }
    // constructor
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    // Added in 4.1
    double x(){
        return x;
    }
    
    // Added in 4.1
    double y(){
        return y;
    }
    
    double r(){
        return Math.sqrt(x*x + y*y);
    }
    double theta(){
        return Math.atan2(y,x);
    }
    // TODO: A static version of distance
    double distance(Point p){
        // 3.2
        //double dx = x - p.x;
        //double dy = y - p.y;

        // 4.1
        double dx = this.x() - p.x();
        double dy = this.y() - p.y();

        return Math.sqrt(dx*dx + dy*dy);
    }
    double distance(double x, double y){
        // 3.2
        //double dx = this.x - x;
        //double dy = this.y - y;
        
        // 4.1
        double dx = this.x() - x;
        double dy = this.y() - y;
        
        return Math.sqrt(dx*dx + dy*dy);
    }
    double angle(Point p){
        //double dx = x - p.x;
        //double dy = y - p.y;

        double dx = this.x() - p.x();
        double dy = this.y() - p.y();

        return Math.atan2(dy,dx);
    }
    double angle(double x, double y){
        //double dx = this.x - x;
        //double dy = this.y - y;

        double dx = this.x() - x;
        double dy = this.y() - y;


        return Math.atan2(dy,dx);
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}
