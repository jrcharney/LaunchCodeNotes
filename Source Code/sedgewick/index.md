# About this directory

This directory contains some code samples from Robert Sedgewick's *Algorithms in Java* 3rd edition from 2003.

I figure a review of this book, as well as applying my own spin on some of this code, would be a good review for Unit 2 which is coming soon, provided I finish Unit 1's assignments!

Many of the programs are incomplete, mostly because I didn't import anything like I should. And some of it may be obsolete because the book I'm looking at is about 17 years old.

We will update eventually. The point here was to review this book because of certain patterns that would be used.

## Division

The code is divided up by the units of each book

* Part 1: Fundamentals
* Part 2: Data Structures
* Part 3:
* Part 4:
* Part 5:

## Notes

### Part 1: Fundamentals

```java
/* Running times (in order of speed I hope)
 *  constant = 1
 *  logarithmic = lg N
 *  logarithmic = log N
 *  linear = N
 *  linearithmic = N lg N
 *  linearithmic = N log N
 *  quadratic = N^2
 *  cubic = N^3
 *  exponential = 2^N
 */
```

### Part 2: Data Structures

A **data type** is a set of values and a collection of operations on those values.

A **linked list** is a set of items where each item is part of a **node** that also contains a **link** to a node. 
A linked list is either a null link or a link to a node that contains an item and a link to a linked list.
 
```java
class Node {
    Object item;
    Node next;
    Node(Object v){
        item = v;
        next = null;
    }
}
```

An **abstract data type** (ADT) is a data type (a set of values and a collection of operations on those values) that is accessed only through an **interface**. We refer to a program that uses an ADT as a **client**, and a program that specifies the data type as an **implementation**.
 
A **pushdown stack** is an ADT that comprises two basic operations: insert (**push**) a new item, and remove (**pop**) the item that was recently inserted.
We can implement the **push** and **pop** operations for the pushdown stack ADT in constant time, using either arrays or linked lists.



## Code Snippets

> I don't think these programs were meant to run independently. They don't have a PSVM or class structure.

```java
/**
 * Program 2.1
 * Sequential Search
 * Property 2.1
 * Sequential Search examines $N$ numbers for each unsuccessful search 
 * and about $N/2$ numbers for each successful search on the average.
 * Property 2.2
 * Sequential Search in an ordered table examines $N$ numbers
 * for each search in the worst case and about $N/2$ numbers for each
 * search on the average.
 */
static int searchSeq(int a[], int v, int l, int r){
    for(int i = l; i <= r; i++){
        if(v == a[i])
            return i;
    }
    return -1;
}

/**
 * Program 2.2
 * Binary Search 
 * Note: binary search is more efficient than sequential search
 * Property 2.3.
 * Binary search never examines more than $\lfloor \lg N \rfloor + 1$ numbers.
 */
static int searchBin(int a[], int v, int l, int r){
    while(r >= l){
        int m = (l+r)/2;
        if(v == a[m])
            return m;
        if(v < a[m])
            r = m-1;
        else
            l = m+1;
    }
    return -1;
}

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
