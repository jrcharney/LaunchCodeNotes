# Part 3 Code Snippets: Sorting

## Chapter 6: Elementary Sorting Methods

### Program 6.1. Example of array sort with driver program

This program illustrates our conventions for implementing basic array sorts. The `main` method is a driver that initializes an array of `double`s with random values, calls a `sort` method to sort that array then prints out the ordered results.

The `sort` method hers is a version of insertion sort. It uses the method `less` (compare two items), `exch` (echange two items), and `compExch` (compare two items and exchange them if necessary to make the second not less than the first).

We can use this code to sort arrays of any primative numeric type simple by replacing `double` with the type name everywhere. With an appropriate implementation of `less`, we can sort arrays of tiems with any reference type.

> See [ArraySortBasic.java](ArraySortBasic.java)

> **Defintion 6.1**: A sorting method is said to be **stable** if it preserves the relative order of items with duplicated keys in the file.

### Program 6.2: Item interface

Any class of items to be sorted must include a method that gives an object from the calss to the capabilities to determine when it is less than another object from the class, or not.

```java
/**
 * Program 6.2.
 * Item interface
 */
interface ITEM {
    boolean less(ITEM v);
}
```

## Chapter 7: Quicksort

## Chapter 8: Merging and Mergesort

## Chapter 9: Priority Queues and Heapsort

## Chapter 10: Radix Sorting

## Chapter 11: Special-Purpose Sorting Methods
