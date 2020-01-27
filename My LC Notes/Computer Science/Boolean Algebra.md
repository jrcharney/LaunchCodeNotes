# Boolean Algebra

[toc]

---

## Introduction

**Boolean algebra** is the branch of algebra in which the value of the variables a the truth values `true` and `false`, usually denoted 1 and 0, respecitively. Instead of elementary algebra where the value of the variables are numbers, and the prime operations are addition and multiplication, the main operations of Boolean algebra are **conjunction** (Logical AND) denoted as $\and$, **disjunction** (Logical OR) denoted as $\or$, and **negation** (Logical NOT) denoted as $\neg$.  There's like an entire article on Wikipedia I could (and really don't want to) plagarize on [Boolean Algebra](https://en.wikipedia.org/wiki/Boolean_algebra). So let's get down the brass tax.

## Operations

### Basic operations

The basic operations of Boolean algebra are conjunction, disjunction, and negation.

* **Logical AND** (`&&`) or conjunction, denoted $x \and y$ (or $x \text{AND} y$ or $Kxy$), satisfies $x \and y = 1$ if $x = y = 1$, and $x \and y = 0$ otherwise.
* **Logical OR** (`||`) or disjunction, denoted $x \or y$ (or $x \text{OR} y$ or $Axy$), satisfies $x \or y = 0$ if $x = y = 0$, and $x \or y = 1$ otherwise.
* **Logical NOT** (`!`) or negation, denoted $\neg x$ (or $\text{NOT} x$ , $Nx$, $!x$, or $\overline{x}$), satisifies $\neg x = 0$ if $x = 1$, and $\neg x = 1$ if $x = 0$.

The values of $x \and y$, $x \or y$, and $\neg x$ can be expressed by tabulating their values with **truth tables**.
$$
\begin{array}{|c c|c c|c|c|}
x & y & \neg x & \neg y & x \and y & x \or y\\
\hline 
0 & 0 & 1 & 1 & 0 & 0 \\
0 & 1 & 1 & 0 & 0 & 1 \\
1 & 0 & 0 & 1 & 0 & 1 \\
1 & 1 & 0 & 0 & 1 & 1 \\
\end{array}
$$

> :information_source: **NOTE**: The negation table is generally much smaller, but I like to stretch it out to match the the output of the other operations. There's a neat trick I like to show with this that will be useful later.

If the truth values 0 and 1 are interpreted as integers, these operations may be express with the ordinary operations of arhtmetic, or by the minimum and maxmimum functions.
$$
\begin{aligned}
x \and y &=& x \cdot y &=& \min(x,y) \\
x \or y &=& x + y - x \cdot y &=& \max(x,y) \\
\neg x &=& 1 - x
\end{aligned}
$$
You may have noticed something different about the $x \or y$ part, like why there is a $-xy$ in $x + y - xy$. And it has to do with one of our secondary operations which we will get to shortly.

### De Morgan's Laws

One might consider that only negation and one of the two operations are basic because the following identities that allow one to define conjunction in terms of negation and the disjunction, and vice versa. We can show this using **De Morgan's Laws**.
$$
\begin{aligned}
x \and y &=& \neg(\neg x \or \neg y) \\
x \or y &=& \neg(\neg x \and \neg y) \\
\end{aligned}
$$
With a truth table, we can prove these operations
$$
\begin{array}{|c c|c c|c c|c c|c c|c c|}
x 
& y 
& \neg x 
& \neg y 
& x \and y 
& x \or y

& \neg(x \and y)
& \neg(x \or y)

& \neg x \or \neg y
& \neg x \and \neg y

& \neg(\neg x \or \neg y)
& \neg(\neg x \and \neg y)


\\
\hline 
0 & 0 & 1 & 1 & 0 & 0 & 1 & 1 & 1 & 1 & 0 & 0\\
0 & 1 & 1 & 0 & 0 & 1 & 1 & 0 & 1 & 0 & 0 & 1\\
1 & 0 & 0 & 1 & 0 & 1 & 1 & 0 & 1 & 0 & 0 & 1\\
1 & 1 & 0 & 0 & 1 & 1 & 0 & 0 & 0 & 0 & 1 & 1\\
\end{array}
$$
We can also prove this algebraicly
$$
\begin{aligned}
x \and y &=& \underline{\neg(\neg x \or \neg y)}  && \text{Given}\\
&=& \underline{\neg\neg x} \and \underline{\neg\neg y} \\
&=& x \and y && \blacksquare
\end{aligned}
$$
The proof for the other rule can be made by swapping all the $\and$s and $\or$s.

### Secondary operations

The three rules back in the Basic Operation section are refered to as basic operation, meaning that they can be taken as a basis for other Boolean operations that can be built upon from them by **composition**, the manner in which operations are combined or compounded. Regular algebra fans may recall that term *composition* from this expression $(f \circ g)(x) = f(g(x))$.

Her's just a few of those secondary operations.

> :reminder_ribbon: **TODO**: Compile the full list!

$$
\begin{aligned}
x \rightarrow y &=& \neg x \or y &&&& \text{Material Implication} \\
x \oplus y &=& (x \or y) \and \neg(x \and y) &=& (x \and \neg y) \or (\neg x \and y) && \text{Exclusive OR} \\
x \equiv y &=& \neg(x \oplus y) &=& (x \and y) \or (\neg x \and \neg y) && \text{Equivalence}
\end{aligned}
$$

* The first operation **material implication**, denoted as $x \rightarrow y$ or $Cxy$.
* The second operation **exclusive OR**, denoted as $x \oplus y$, $x \veebar y$, or $Jxy$, is also known as **exclusive disjunction** or **XOR**, only outputs true when both inputs differ.
* The third operation **equivalence**, denoted as $x \equiv y$, $x \leftrightarrow y$, or $Exy$, is the negation of XOR known as **logical biconditional**, which outputs true only when the two inputs are the same.

$$
\begin{array}{|c c|c c c|}
x & y 
& x \rightarrow y
& x \oplus y
& x \equiv y
\\
\hline 
0 & 0 & 1 & 0 & 1\\
0 & 1 & 0 & 1 & 0\\
1 & 0 & 1 & 1 & 0\\
1 & 1 & 1 & 0 & 1\\
\end{array}
$$

OK, that seems like a lot of stuff, why don't we organize these things better.

### :star: Logical Connectives

The best way to describe all these operator is by a name that is used in the field of logic. Each local operator is also known as a **logical connective**.  There are 16 of these, which will be useful for using another tool later in this index.
$$
\begin{array}{l r | c c c c | l }
\text{Sym.} & 
\text{Function} &
a & b & c & d & 
\text{Bochenski Func.}
\\
\hline
\bot & \text{Contradiction/Falsity} & 0 & 0 & 0 & 0 & Opq = 0\\
\and & \text{Logical Conjunction} & 0 & 0 & 0 & 1 & Kpq = p \and q\\
\nrightarrow & \text{Material nonimplication} & 0 & 0 & 1 & 0 & Lpq \\
P & \text{Antecedent projection} &  0 & 0 & 1 & 1 & Ipq = p\\
\nleftarrow & \text{Converse nonimplication} &  0 & 1 & 0 & 0 & Mpq \\
Q & \text{Consequent projection} &  0 & 1 & 0 & 1 & Hpq = q\\
\oplus & \text{Exclusive disjunction} &  0 & 1 & 1 & 0 & Jpq \\
\or & \text{Logical disjunction} &  0 & 1 & 1 & 1 & Apq = p \or q\\
\downarrow & \text{Joint denial} &  1 & 0 & 0 & 0 &Xpq \\
\equiv & \text{Biconditional/Equivalence} &  1 & 0 & 0 & 1 & Epq\\
\overline{Q} & \text{Consequent negation} &  1 & 0 & 1 & 0 & Gpq = Nq = \neg q\\
\leftarrow & \text{Converse implication} &  1 & 0 & 1 & 1 & Bpq \\
\overline{P} & \text{Antecedent negation} &  1 & 1 & 0 & 0 &Fpq = Np = \neg p\\
\rightarrow & \text{Material implication} & 1 & 1 & 0 & 1 & Cpq\\
\uparrow & \text{Alternative denial} & 1 & 1 & 1 & 0 & Dpq\\
\top & \text{Tautology/Truth} & 1 & 1 & 1 & 1 & Vpq = 1
\end{array}
$$

### :star: Operator precedence

The basic and secondary operators have an **order of operations**, or **operator precedence**. The operations are from 5 (highest) to 1 (lowest).
$$
\begin{array}{c|c}
\text{Precedence} & \text{Operator} \\
\hline
5 & \neg \\
4 & \and \\
3 & \or \\
2 & \rightarrow \\
1 & \equiv, \oplus
\end{array}
$$






## Laws

A **law** of Boolean algebra is an *identity* where a **boolean term** is defined as an expression built up from variables and the constants 0 and 1 using the operations $\and$, $\or$, and $\neg$. The concept can be extended to terms involving other boolean operations such as $\oplus$, $\rightarrow$, and $\equiv$, but such extensions are unnecessary for the purpose to which the laws are put. Such purposes include the defintion of a Boolean algebra as any model of Boolean laws, and as a means for deriving new laws from old laws.

There are two kinds of laws:

* Monotone laws which include
  * Associativity
  * Commutativity
  * Distributivity
  * Identity
  * Annihilation
  * Idempotence
  * Absorption
* Nonmonotone laws
  * Complementation
  * Double negation
  * De Morgan's Law

### :star: The 19 Laws of Boolean Algebra

When aksed to study the laws of boolean algebra, there are 19 law you must know!
$$
\begin{aligned}
\text{Associativity of } \or: && x \or (y \or z) &=& (x \or y) \or z \\
\text{Associativity of } \and: && x \and (y \and z) &=& (x \and y) \and z\\
\text{Commutativity of } \or: && x \or y &=& y \or x\\
\text{Commutativity of } \and: && x \and y &=& y \and x \\
\text{Distributivity of } \and \text{ over } \or: && x \and (y \or z) &=& (x \and y) \or (x \and z) \\
\text{Distributivity of } \or \text{ over } \and: && x \or (y \and z) &=& (x \or y) \and (x \or z)\\
\text{Identity for } \or: && x \or 0 &=& x \\
\text{Identity for } \and: && x \and 1 &=& x \\
\text{Annihilator for } \or: && x \or 1 &=& 1 \\
\text{Annihilator for } \and: && x \and 0 &=& 0 \\
\text{Idempotence of } \or: && x \or x &=& x \\
\text{Idempotence of } \and: && x \and x &=& x \\
\text{Absorption of } \and \text{ over } \or: && x \and (x \or y) &=& x \\
\text{Absorption of } \or \text{ over } \and: && x \or (x \and y) &=& x \\
\text{De Morgan's Law for } \and: && x \and y &=& \neg (\neg x \or \neg y) \\
\text{De Morgan's Law for } \or: && x \or y &=& \neg (\neg x \and \neg y) \\
\text{Complement of } \and: && x \and \neg x &=& 0 \\
\text{Complement of } \or: && x \or \neg x &=& 1\\
\text{Double negation}: && \neg(\neg x)&=&x
\end{aligned}
$$


## Karnaugh Maps

A **Karnaugh Map** allows us the ability to turn our truth tables into charts that can help us write out forumlas, but you probably won't use this as much. 

This chart shows how the bits of hexadecimal digits are organized. The chart on the left shows the chart with header and  on the right without the header.
$$
\begin{aligned}

\begin{array}{c c|c|c|c|c|}
& & cd & cd & cd & cd\\
& & 00 & 01 & 11 & 10\\
\hline 
ab & 00 & 0 & 1 & 3 & 2 \\ \hline 
ab & 01 & 4 & 5 & 7 & 6 \\ \hline 
ab & 11 & C & D & F & E \\ \hline 
ab & 10 & 8 & 9 & B & A \\ \hline 
\end{array}

&&=&&

\begin{array}{|c|c|c|c|}
\hline 
0 & 1 & 3 & 2 \\ \hline 
4 & 5 & 7 & 6 \\ \hline 
C & D & F & E \\ \hline 
8 & 9 & B & A \\ \hline 
\end{array}

\end{aligned}
$$
Eariler I had said there was a way to identify the 16 operators truths. A K-Map can help.
$$
\begin{array}{|c|c|c|c|}
\hline 
\bot & \and & P & \nrightarrow \\ \hline 
\nleftarrow & Q & \or & \oplus \\ \hline 
\overline{P} & \rightarrow & \top & \uparrow \\ \hline 
\downarrow & \equiv & \leftarrow & \overline{Q} \\ \hline 
\end{array}
$$


---

## References

[^ ba ]: [Boolean Algebra](https://en.wikipedia.org/wiki/Boolean_algebra)
[^ pc ]: [Propositional calculus](https://en.wikipedia.org/wiki/Propositional_calculus)
[^ sc ]: [Sequent calculus](https://en.wikipedia.org/wiki/Sequent_calculus)
[^ lc ]: [Logical connective](https://en.wikipedia.org/wiki/Logical_connective)
[^ km ]: [Karnaugh map](https://en.wikipedia.org/wiki/Karnaugh_map)
[^ jmb ]: [Jozef Maria Bochenski](https://en.wikipedia.org/wiki/J%C3%B3zef_Maria_Boche%C5%84ski)



---

#Computer_Science

