# Part 2 Code Snippets

## Program 3.9

```java
/**
 * Program 3.9
 * List reversal
 */
static Node reverse(Node x){
    Node t, y = x, r = null;
    while(y != null){
        t = y.next;
        y.next = r;
        r = y;
        y = t;
    }
    return r;
}
```

## Program 3.14

```java
/**
 * Program 3.14
 * String Search
 */
static int countMatches(String p, String s){
    int count = 0, m = p.length(), n = s.length();
    if(m > n){
        return 0;
    }
    for(int i = 0; i < n; i++){
        int j;
        for(j = 0;j < m; j++){
            if(s.charAt(i+j) != p.charAt(j)) break;
        }
        if(j == p.length()){
            count++;
        }
    }
    return count;
}
```

## Program 3.15

```java
/**
 * Program 3.15
 * Manipulating strings
 */
static String squeeze(String s){
    char[] a = s.toCharArray();
    int n = 1;
    for(int i = 1; i < a.length; i++){
        a[n] = a[i];
        if(a[n] != ' ') n++;
        else if(a[n-1] != ' ') n++;
    }
    return new String(a, 0, n);
}
```

## Program 4.2
```java
/**
 * Program 4.2
 * Point class (alternative implementation)
 */
class PointPolar {
    private double r, theta;
    PointPolar(){
        double x = Math.random();
        double y = Math.random();
        this = new PointPolar(x,y);
    }
    PointPolar(double x, double y){
        r     = Math.sqrt(x*x + y*y);
        theta = Math.atan2(y,x);
    }
    double r(){return r;}
    double theta(){return theta;}
    double x(){return r*Math.cos(theta);}
    double y(){return r*Math.sin(theta);}
    double distance(PointPolar p){
        double dx = x() - p.x();
        double dy = y() - p.y();
        return Math.sqrt(dx*dx + dy*dy);
    }
    public String toString(){
        return "("+x()+","+y()+")";
    }
}
```

## Program 4.3

```java
/**
 * Program 4.3
 * Point ADT Interface
 * Note: In 4.3, implementations and private members are hidden.
 */
class PointADT {
    PointADT();
    PointADT(double,double);
    double x();
    double y();
    double r();
    double theta();
    double distance(PointADT);
    public String toString();
}
```
