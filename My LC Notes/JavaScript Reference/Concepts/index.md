# Concepts

[toc]

---

> :warning: 🧪 **WARNING! HIGHLY EXPERIMENTAL** This directory was supposed to be a place to dive into some deeper subjects. But due to time constrains, and the fact that my audience (you) would be intimidated by a lot of the stuff. Most of this content is either deprecated or should be considered experimental and not ready to be taken word for word.

## Lambda Calculus

**Lambda Calculus** -- Aren't these just the two most terrifying words you can read? I would have gone with "income taxes", "domestic terrorism", or "root canal". But nooooo. "Math is scary". And you'd be right...for once.  I wanted to explain this in LaTeX, UML, and Pseudocode. But alas, time is working against us. And I must return to the course material.

## Arrow Functions

**Arrow Functions** -- There's likely going to be a better article written somewhere eventually. Intially, I was told arrow functions, which are syntactically compact anonymous functions couldn't be lambdas becauss anonymous functions don't hanve names attached to them...but then I read all this stuff in Lambda Calculus that pretty much says the exact opposite and says "yeah, that's OK".

Here's why that's OK.

Let's consider this example from the Lisp programming language.

```lisp
(lambda (x) (* x x))
```

This function creates a "square" function (you know, $y = x^2$) which can be expressed as a lambda expression with the code example above. This expression evaluates to a first-class function. The symbol `lambda` creates an anonymous function, given the list of parameter names, `(x)` --just an single argument in this case, and as an expression that is evaluated as the body of the function, `(* x x)`. For this reason, anonymous functions are sumtimes called lambda expressions.

For example, JavaScript and many ohter imperative langauges have long supported passing *subprograms* as *arguments* to other sub programs through the mechanism of *function pointers*. However, function pointers are not a sufficient condtion for functions to be first-class datatypes, because a function is a first class datatype if and only if new instances of the function can be created at run-time. This runtime creation of functions is supported in JavaScript and more recently in C++ (as of C++11) and C# (as "delegates")

> That still looks like support for the argument that arrow functions and anonymous functions CAN be lambdas