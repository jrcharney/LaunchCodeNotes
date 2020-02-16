# Arrow Functions

[toc]

---

Arrow functions have become the unsung heroes of ES6 going forward.

Syntactically compact, any



## Anonymous Functions are NOT Lambdas

> :boxing_glove: **SUBJECTIVE** - Wether or not an anonymous function can be considered a lambda is subjective. So I've decided to make another document to try to explain what lambda is by defintion of lambda calculus.

Arrow functions are an alternative, syntactically compact form, of anonymous functions, but they are not *lambdas*. While there is a lot of anonymous function happenings in the field of lambda calculus, and in JavaScript, the idea that an anonymous function is a lambda is definitively incorrect.

==A **lambda** is a *function expression used as data*.==

You may have been using lambda's the whole time, you just didn't know it, or when it was presented with the slightly less intimindating name **callback**.

```js
let nerds = ['Lewis', 'Gilbert', 'Poindexter', 'Wormser', 'Booger', 'Lamar', 'Takashi'];

let sdren = nerds.map(function reverse(nerd){
    return nerd.split('').reverse().join('');
});
```

`reverse`, on line 3 of the above example, is a lambda, but it is not anonymous.  If that is the case, then we can rewrite that example, such that line `reverse` on line 7 below is also a lambda since it is the name of a function we defined and that function defined *with a name* such that when it is called in `map`, like in the example above and below, it is used as an argument which provides data for that function to work

```js
let nerds = ['Lewis', 'Gilbert', 'Poindexter', 'Wormser', 'Booger', 'Lamar', 'Takashi'];

function reverse(nerd){
    return nerd.split('').reverse().join('');
};

let sdren = nerds.map(reverse);
```

Let's try to think of what a lambda is mathematically with the defintion of a composite function:
$$
\begin{aligned}
z &= h(x) \\
&= (f \circ g)(x)\\ &= f(g(x)) \\
&= f(\lambda) && \because \lambda=g(x)
\end{aligned}
$$
If our defintion of a lambda is a named function expression used as data, then let us entertain the idea that a lambda is a function used as an argument, for which we already have a name for something like that: callback. However, this call back must be in the form of a named function, not an anonymous function.

Thus, in a composite function, $f$ is our `.map` function, and $g$ is our `reverse` function. The data used in $g$ is processed by $f$ to produce the output that is part of $z$.

Still confused?

Let's try to explain this again, especially since our $f$, `map` is a function of an array.

In the examples above, the argument we used in `reverse` to describe what was being processed was `nerd`. That `nerd` is part of a collection (array) of `nerds`, such that our function $f$ applies function $g$  (`reverse`) on each `nerd`.

Think of the `map` function as a `for` loop but in a more comprehensive form. If `map` wasn't defined as part of the Array class, it probably would be defined like this.

```js
function map(inputArray,callback){
    let outputArray = [];
    for(let i = 0; i < inputArray.length; i++){
        outputArray[i] = callback(inputArray[i]);
    }
	return outputArray;    
}
```

While the defintion of the `map` function in the Array class is a little more complex than that, this should provide a simple explaination as to how lambdas (a.k.a. callbacks) fit into our understanding.

So why can't anonymous functions be lambdas?

Let's consider rewriting our `reverse` function from eariler.

```js
let jocks = function(nerd){
    return reverse(nerd);
};
```

Hold up! We can attach a name to this anonymous function. 

```js
let jocks = function alphaBetas(nerd){
    return reverse(nerd);
}
```

Our lamba in this case is `alphaBetas`. `jocks` is just an ***alias*** of `alphaBetas`. If we wrote our function as an arrow function...

```js
let jocks = nerd => reverse(nerd);
```

or even...

```js
let jocks = (nerd) => {return reverse(nerd);}
```

We still don't have a lambda because `jocks` is just the alias of a anonymous function that it represents.





---

## References

[^ mdn-af ]: MDN. [Arrow Functions](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Functions/Arrow_functions).
[^ lyh ]: [Learn You a Haskell for Great Good!](http://learnyouahaskell.com/).



---

#JavaScript