# Lambda Calculus

> :tired_face: **TOO COMPLEX!** Well, I tried.  The more notes I took here, the more complex it became. So, let's just table this for the moment.  [Read this](https://en.wikipedia.org/wiki/Lambda_calculus).

[toc]

---

**Lambda calculus** (or **λ-calculus** (or as it will be informally called throughout this document **LC**)) is a *formal system* in *mathematical logic* for expressing computation based on function *abstraction* and *application* using variable *binding* and *substitution*.  It is a universal model of computation that can be used to simulate an *Turing machine*.  It was introduced in the 1930s by mathematician **Alonzo Church** as part of his research into the foundations of mathematics.

This document will try not to run you over with all sorts of computer science concepts, but will try to introduce them in such a way that it is relevant to JavaScript.

Lambda calculus consists of constructing *lambda terms* and performing *reduction operations* on them. in the simplest form of LC, terms are built by using only the following rules:

| Syntax                            | Name        | Description                                                  |
| --------------------------------- | ----------- | ------------------------------------------------------------ |
| $x$                               | Variable    | A character or string representing  parameter or mathematical/logical value. |
| $(\lambda x.M)$                   | Abstraction | Function definition ($M$ is a *lambda term*). The variable $x$ becomes ==bound== in the expression. |
| $(M\ N)$ (or $(M,N)$ for clarity) | Application | Applying a function to an argument. $M$ and $N$ are lambda terms. |

> :triangular_ruler: **LaTeX Note**: Spaces can look wierd in LaTeX, so for clarity, I'm going to use $(M,N)$ to describe applications instead of $(M\ N)$ since what is going on here describes separate terms anyway.

The rules in the above table can produce expressions, such as $(\lambda x . \lambda y . (\lambda z.(\lambda x . z, y),(\lambda x . z, y)),(x,y))$.  Parenthesis can be dropped if the expression is unambiguous. For some applications, terms for logical and mathematical constants and operations may be included.

The reduction operations include:

| Operation                               | Name                | Description                                                  |
| --------------------------------------- | ------------------- | ------------------------------------------------------------ |
| $(\lambda x.M[x]) \to (\lambda y.M[y])$ | $\alpha$-conversion | Renaming the bound variable in the expression. Used to avoid *name collisions*. |
| $(\lambda x.M,E) \to (M[x := E])$       | $\beta$-reduction   | Replacing the bound variable with the argument expression in the body of the abstraction. |

If *De Bruijn indexing* is used, then $\alpha$-conversion is no longer required as there will be no name collisions. If *repeated application* of the reduction steps eventually terminates, then by the *Church-Rosser theorem* it will produce a *$\beta$-normal form*.

## Explanation and application

Lambda calculus is *Turing complete*, that is, it is a universal model of computation that can be used to simulate an *Turing machine*.

It's namesake, the greek letter lambda ($\lambda$), is used in **lambda expressions** and **lambda terms** to denote *binding* a variable in a function.

Lambda calculus may by *untyped* or *typed*.  In **typed lambda calculus**, functions can be applied only if theyare capable fo accepting the given input's "type" of data. Typed lambda calculi are *weaker* than the untyped lambda calculus, which this document will be the primary subject, in the sense that ==*typed lambda calculi can express less* than the untyped calculus can, but can allow more things to be proven==; in the *simply-typed lambda calculus* it is, for example, a theorem that every evaluation strategy terminates for every simply-typed lambda term, whereas evaluation of untyped lambda terms need not terminate. One reason there are many different typed lambda calculi has been the desire to do more (of what they untyped LC can do) without giving up on the ability to prove string theorems about the calculus.

LC has applications in many different fields in mathematics, philosophy, linguistics, and computer science. LC has played an important role in the development of the *theory of programming languages*. *Functional programming languages* implement the LC. LC is also a current research topic in *category theory*.

### Typed LC

A **typed LC** is a typed *formalism* that uses the lambda symbol ($\lambda$) to denote anonymous function abstraction. In this context, types are usually object sof a syntactic nature that are assigned to lambda termsl the exact nature of a typed depends on the calculus considered. From a certan point of view, typed lambda calculi can be seen as refinedments of the *untyped LC*, but from another point of view, they can also be considered the more fundamental theory and untyped LC as special case with only one type.

Typed LCs are foundational programming languages and are based on the typed *functional programming languages* such as ML and Haskell and, more indirectly, typed *imperative programming languages*. Typed LCs can play an important role in the design of the *type systems* for programming languages; here typability ususally captures desirable properties of the program, e.g. the progam will not cause a memory access violation.

Typed LCs are closely related to *mathematical logic* and *proof theory* via the *Curry-Howard isomorphism* and they can be considered as the *internal langauge* of classes of *categories*, e.g. the simply-typed LC is the language of *Cartesian closed categories* (CCCs).

## Informal description

## Formal description

## Reduction

## Normal forms and confluence

## Encoding datatypes

## Additional programming techniques

## Computable functions and LC

## Undecidablity of equivalence

## LC and Programming Languages

### Anonymous functions

## Reduction strategies



---

## References

[^ wiki-lc ]: Wikipedia. [Lambda calculus](https://en.wikipedia.org/wiki/Lambda_calculus).

---

#Computer_science #Lambda_calculus