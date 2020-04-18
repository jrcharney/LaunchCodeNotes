# Part 2 Code Snippets: Data Structures

[toc]

---

> TODO: Go back and add and properties and definitions and program descriptions.

## Chapter 3. Elementary Data Structures

### Program 3.9

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

### Program 3.14

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

### Program 3.15

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

## Chapter 4. Abstract Data Types

### Program 4.2
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

### Program 4.3

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

## Chapter 5. Recursion and Trees

### Program 5.1

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

### Program 5.2

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

### Program 5.3

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

### Program 5.4

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

### Program 5.5

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

### Program 5.6

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

### Program 5.7

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

### Program 5.8

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

### Program 5.9

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

### Program 5.10

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

### Program 5.11

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

### Program 5.12

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

### Program 5.13

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

> 4/16/2020
> So it's been a little while since I fiddled around with these notes. But here I go again!

> **Defintion 5.1**: A **binary tree** is either an external node or internal node connected to a pair of binary trees, which are called the left subtree and the right subtree of that node.

```java
class Node {
    Item item; Node l; Node r;
    Node(Item v, Node l, Node r){
        this.item = v;
        this.l = l;
        this.r = r;
    }
}
```

> **Defintion 5.2**: An **$M$-ary tree** is either and external node or an internal node connected to an ordered sequence of $M$ threes that they are also $M$-ary trees.

> **Defintion 5.3**: A **tree** (a.k.a. **ordered tree**) is a node (called the *root*) connected to a sequence of disjoint trees. Such a sequence is called a **forest**.

> **Property 5.4**: There is a one-to-one correspondence between binary trees and ordered forests.

> **Defintion 5.4**: A **rooted tree** (a.k.a. **unordered tree**) is a node (called the *root*) connected to a multiset of rooted trees. Such a multiset is called an *unordered forest*.

> **Defintion 5.5**: A **graph** is a set of nodes with a set of edges that connect pairs of distinct nodes (with at most one edge connecting any pair of nodes).

> **Property 5.5**: A binary tree with $N$ internal nodes has $N+1$ external nodes.

> **Property 5.6**: A binary tree with $N$ internal nodes has $2N$ links: $N-1$ links to internal nodes and $N+1$ links to external nodes.

> **Defintion 5.6**: The **level** of a node in a tree is one higher than the level of its parent (with the root at level 0). The **height** of a tree is the maximum of the levels of the tree's nodes. The **path length** of a tree is the sum of the levels of all the tree's nodes. The **internal path length** of a binary tree is the sum of the levels of all the tree's internal nodes. The **external path length** of a binary tree is the sum of the levels of all the tree's external nodes.

> **Property 5.7**: The external path length of any binary tree with $N$ internal nodes is $2N$ greater than the internal path length.

> **Property 5.8**: The height of a binary tree with $N$ internal nodes is at least $lg N$ and at most $N-1$.

> **Property 5.9**: The internal path length of a binary tree with $N$ internal nodes is at least $N lg(N/4)$ and at most $N(N-1)/2$.

## Program 5.14 Recursive tree travel

The recursive method takes a link to a tree as an argument and calls `visit` with each of the nodes in the tree as argument. As is, the code implements a **preorder traversal**; if we move the call to `visit` between the recursive call, we have an **inorder traversal**; and if we move the call to `visit` after the recursive call, we have a **postorder traversal**.

```java
/**
 * Program 5.14
 * Recursive tree traversal
 */
private void traverseR(Node h){
    if(h == null) return;
    h.item.visit();
    traverseR(h.l);
    traverseR(h.r);
}
void traverse(){
    traverseR(root);
}
```

### Program 5.15 Preorder traverse (nonrecursive)

The nonrecursive stack-based method is functionally equivalent to its recursive counterpart, Program 5.14.

```java
/**
 * Program 5.15
 * Preorder traverse (norecursive)
 */
private void traverseS(Node h){
    NodeStack s = new NodeStack(max);
    s.push(h);
    while(!s.empty()){
        h = s.pop();
        h.item.visit();
        if(h.r != null) s.push(h.r);
        if(h.l != null) s.push(h.l);
    }
}
void traverseS(){
    traverseS(root);
}
```

### Program 5.6 Level-order traversal

Switiching the underlying data structure in preorder traerseal (Program 5.15) from a stack to a queue transforms the traversal into a level-order one.

```java
/**
 * Program 5.16
 * Level-order traversal
 */
private void traverseQ(Node h){
    NodeQueue q = new NodeQueue(max);
    q.put(h);
    while(!q.empty()){
        h = q.get();
        h.item.visit();
        if(h.l != null) q.put(h.l);
        if(h.r != null) q.put(h.r);
    }
}
void traverseQ(){
    traverseQ(root);
}
```

### Program 5.17 Computation of tree parameters

We can use simple recursive methods such as these to learn basic structural properties of trees.

```java
/**
 * Program 5.17
 * Computation of tree parameters
 */
private static int count(Node n){
    if(h == null) return 0;
    return count(h.l) + count(h.r) + 1;
}
int count(){
    return count(root);
}
private static int height(Node n){
    if(h == null) return -1;
    int u = height(h.l), v = height(h.r);
    return (u > v) ? u+1 : v+1;
}
int height(){
    return height(root):
}
```

### Program 5.18 Quick tree-print method

This recursive program keeps track f the tree height and uses that information for indentation in printing out a representation of the tree that we can use to debug tree-processing programs. It assumes that items in nodes are of type `Item`.

```java
/**
 * Program 5.18
 * Quick tree-print method
 */
static void printnode(Item x, int h){
    for(int i = 0; i < h; i++)
        Out.print("    ");
    Out.println("["+x+"]");
}
private static void showR(Node t, int h){
    if(t == null){
        printnode(null,h);
        return;
    }
    showR(t.r,h+1);
    printnode(t.item,h);
    showR(t.l,h+1)
}
void show(){
    showR(root,0);
}
```

### Program 5.19 Construction of a tournament

This recursive method divises an array `a[l],...,a[r]` into two parts `a[l],...,a[m]` and `a[m+1],...,a[r]`, builds tournaments for two parts (recursively), and makes a tournament for the who array by setting links in a new node to the recursively built tournaments and setting its value to the larger of the values in the roots of the two recursively built tournaments.

```java
/**
 * Program 5.19
 * Construction of a tournament
 */
static class Node {
    double val;
    Node l;
    Node r;
    Node(double v, Node l, Node r){
        this.val = v;
        this.l = l;
        this.r = r;
    }
}
static Node max(double a[], int l, int r){
    int m = (l+r)/2;
    Node x = new Node(a[m],null,null);
    if(l == r) return x;
    x.l = max(a,l,m);
    x.r = max(a,m+1,r);
    double u = x.l.val, v = x.r.val;
    x.val = (u > v) ? u : v;
    return x;
}
```

### Program 5.20. Construction of a parse tree

To build a parse tree instead of just evaluating a prefix expression, we could use this recursive method instead of the `eval` method in Program 5.4. For simplicity, this code assumes that operands are single characters and the `Node` class is defined like the one in Program 5.19, but with a `char` field for its data. Each call of the recursive method creates a new node with the next character from the input as the token. If the token is an operand, we return the ndw node; if it is an operator, we set the left and right pointers to the tree built (recursively) for the two arguments.

```java
/**
 * Program 5.20
 * Construction of a parse tree
 */
static Node parse(){
    char t = a[i++];
    Node x = new Node(t);
    if((t=='+') || (t=='*')){
        x.l = parse();
        x.r = parse();
    }
    return x;
}
```

### Program 5.21. Depth-first search

To visit all the notes connected to nod $k$ in a graph, we mark it as *visited*, then (recursively) visit all the unvisited nodes on $k$'s adjaceny list.

```java
/**
 * Program 5.21
 * Depth-first search
 */
private void dfs(int k){
    visit(k);
    visited[k] = true;
    for(Node t = adj[k]; t != null; t = t.next){
        if(!visited[t.v]){
            dfs(t.v);
        }
    }
}
```

> **Property 5.10**: Depth-first search requires time proportional to $V+E$ in a graph with $V$ vertices and $E$ edges, using adjacency lists representation.

### Program 5.22. Breath-first search

To visit the nodes connected to node $k$ in a graph, we put $k$ onto a FIFO queue, then enter into a loop where we get the next node from the queue, and, if it has not been visited, visit it and push all the unvisited notes on its adjacency list, continuing until the queue is empty.

```java
void bfs(int k){
    intQUEUE q = new intQUEUE(V*V)l
    q.put(k);
    while(!q.empty()){
        if(!visited[k = q.get()]){
            Node t;
            visit(k);
            visited[k] = true;
            for(t = adj[k]; t != null; t = t.next){
                if(!visited[t.v]){
                    q.put(t.v);
                }
            }
        }
    }
}
```
