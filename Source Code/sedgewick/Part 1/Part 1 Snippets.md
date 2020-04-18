# Part 1 Code Snippets: Fundamentals

[toc]
---

## Chapter 2. Principles of Algorithm Analysis

> **Property 2.1**: Sequential Search examines $N$ numbers for each unsuccessful search and about $N/2$ numbers for each successful search on the average.

> **Property 2.2**: Sequential Search in an ordered table examines $N$ numbers for each search in the worst case and about $N/2$ numbers for each search on the average.

### Program 2.1. Sequential Search

```java
/**
 * Program 2.1
 * Sequential Search
 */
static int searchSeq(int a[], int v, int l, int r){
    for(int i = l; i <= r; i++){
        if(v == a[i])
            return i;
    }
    return -1;
}
```

>  * **Property 2.3.** Binary search never examines more than $\lfloor \lg N \rfloor + 1$ numbers.

### Program 2.2. Binary Search

```java
/**
 * Program 2.2
 * Binary Search 
 * Note: binary search is more efficient than sequential search
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
```
