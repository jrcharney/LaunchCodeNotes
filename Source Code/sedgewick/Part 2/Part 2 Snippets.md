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

## Program 5.1

```java
/**
 * Program 5.1 
 * Factorial function (recursive implementation)
 */
static int factorial(int n){
    if(n == 0) return 1;
    return n * factorial(n-1);
}
```

Of course, I like to do it like this

```java
static int factorial(int n){
    return (n == 0) ? 1 : (n * factorial(n-1));
}
```

## Program 5.2

```java
/**
 * Program 5.2
 * A questionable recursive program
 */
static int puzzle(int n){
    if(n == 1) return 1;
    if(n % 2 == 0){
        puzzle(n/2);
    }else{
        puzzle(3*n+1)
    }
}
```

## Program 5.3

```java
/**
 * Program 5.3
 * Euclid's algorithm
 */
static int gcd(int m, int n){
    if(n == 0)
        return m;
    return gcd(n, m % n);
}
```

## Program 5.4

```java
/*
 * Program 5.4
 * Recursive program to evaluate prefix expressions
 */
static char[] a;
static int i;
static int eval(){
    int x = 0;
    while(a[i] == ' ') i++;
    if(a[i] == '+'){
        i++;
        return eval() + eval();
    }
    if(a[i] == '*'){
        i++;
        return eval() * eval();

    }
    while((a[i] >= '0') && (a[i] <= '9')){
        x = 10*x + (a[i++] - '0');
    }
    return x;
}
```

## Program 5.5

```java
/**
 * Program 5.5
 * Examples of recursive functions for linked lists
 */
int count(Node h){
    if(h == null) return 0;
    return 1 + count(h.next);
}
void traverse(Node h){
    if(h == null) return;
    h.item.visit();
    traverse(h.next);
}
void traverseR(Node h){
    if(h == null) return;
    traverseR(h.next);
    h.item.visit();
}
Node remove(Node h, Item v){
    if(h == null) return null;
    if(eq(h.item,v)) return remove(h.item,v);
    h.next = remove(h.next, v);
    return h;
}
```

## Program 5.6

```java
/**
 * Program 5.6
 * Divide-and-conquer to find the maximum
 */
static double max(double a[], int l, int r){
    if(l == r) return a[l];
    int m = (l+r)/2;
    double u = max(a,l,m);
    double v = max(a,m+1,r);
    return (u > v) ? u : v;
}
```

## Program 5.7

```java
/**
 * Program 5.7
 * Solution to the towers of Hanoi
 */
static void hanoi(int n, int d){
    if(n == 0) return;
    hanoi(n-1,-d);
    shift(n,d);
    hanoi(n-1,-d);
}
```

## Program 5.8

```java
/**
 * Program 5.8
 * Divide and conquer to draw a ruler
 */
static void rule(int l, int r, int h){
    int m = (l + r)/2;
    if(h > 0){
        rule(l, m, h - 1);
        mark(m, h);
        rule(m, r, h - 1);
    }
}
```

## Program 5.9

```java
/**
 * Program 5.9
 * Nonrecursive program to draw a ruler
 */
static void rule(int l, int r, int h){
    for(int t = 1, j = 1; t <= h; j+=j t++){
        for(int i = 0; l+j+i <= r; i += j+j ){  // NOTE: Addition is used here because multiplication can take longer.
            mark(l+j+i, t);
        }
    }
}
```

## Program 5.10

```java
/**
 * Program 5.10
 * Fibonacci numbers (recursive implementation)
 */
static int fibonacci(int i){
    if(i < 1) return 0;
    if(i == 1) return 1;
    return fibonacci(i-1) + fibonacci(i-2);
}
```

## Program 5.11

```java
/**
 * Program 5.11
 * Fibonacci numbers (dynamic programming)
 */
static final int maxN = 47;
static int knownF[] = new int[maxN];
static int fibonacci(int i){
    if(knownF[i] != 0) return knownF[i];
    int t = i;
    if(i < 0) return 0;
    if(i > 1) t = fibonacci(i-1) + fibonacci(i-2);
    return knownF[i] = t;
}
```

## Program 5.12

> Note: This one was poorly written

```java
/**
 * Program 5.12
 * Knapsack problem (recursive implementation)
 */
// This code assumes we have the following class
static class Item {
    int size;
    int val;
}

// It also assumes we have a array of n items of type Item.

static int knap(int cap){
    int i, space, max, t;
    for(i = 0, max = 0; i < n; i++){
        if((space = cap-items[i].size) >= 0){
            if((t = knap(space) + items[i].val) > max){
                max = t;
            }
        }
    }
    return max;
}
```

## Program 5.13

> Note: This one was also poorly written

```java
/**
 * Program 5.13
 * Knapsack problem (dynamic programming)
 */
static int knap(int m){
    int i, space, max, maxI = 0, t;
    if(maxKnown[m] != unknown){     // TODO: What is the vaoue of unknown...aside from being unknown.
        return maxKnown[m];
    }
    for(i = 0, max = 0; i < n; i++){
        if((space = m - items[i].size) >= 0){
            if((t = knap(space) + items[i].val) > max){
                max = t;
                maxI = i;
            }
        }
    }
    maxKnown[m] = max;
    itemKnown[m] = items[maxI];
    return max;
}
```