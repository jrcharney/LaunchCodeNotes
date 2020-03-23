/**
 * @import Point.java
 */
class LabeledPoint extends Point {
    String id;
    void label(String name){id = name;}
    public String toString(){
        //return name + "("+x+","+y+")";
        return name + "("+super.x()+","+super.y()+")";  // This should call x and y from Point
    }
}
