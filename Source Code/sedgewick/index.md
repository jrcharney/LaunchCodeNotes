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

I created some code snippet files because, I don't think these programs were meant to run independently. They don't have a PSVM or class structure.
