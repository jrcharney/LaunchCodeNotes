# for-of Loops and maps: And why you should be using them!

[toc]

---

## Introduction

In this document, we will go over a new (well ES6 "new") control structure called the **`for-of` loop** and why you should use it. 

## PHP has something similar called foreach

PHP is a language that, until Node.js made the scene, the language for doing backend (server-side) web development.

One of the constructs it has is the `foreach` loop, which were used with `array` types. Arrays in PHP are treated like a combination of both Objects and Arrays in JavaScript. Arrays in PHP can be defined with keys (like JavaScript Objects) or without keys (like JavaScript Arrays), but the definiton of what an object is in PHP is that an `object` is an instance of a `class` because PHP is an Object-Oriented Programming Language. 

As such, Objects (by the defintion we use to describe an `Object` as a data structure in JavaScript) in PHP are iterable because they are Arrays with key-value pairs. In JavaScript, Objects are NOT iterable, but can be converted into Arrays which are iterable.

In PHP, the `foreach` construct can *map* across each key-value property (if there are keys) or each value (if there are not keys).

```php
$arr = array(1, 2, 3, 4);
foreach($arr as &$value){	// &$value = call-by-reference
    $value = $value * 2;
}	// $arr is now array(2, 4, 6, 8)
unset($value);				// break the reference with the last element

$arr = array ("one" => 1, "two" => 2, "three" => 3, "four" => 4);
foreach($arr as $key => $value){
    $value = $value * 2;
    echo "{$key} times two is {$value}";
    // TODO: How do I return this?
}
```

In JavaScript, we don' t need to worry about all those technical terms like "call-by-reference". At least not with the point that I'm trying to make in this document.

## Javascript also has forEach...but you don't want to use it.

JavaScript has a `forEach` function in the Array class, but you really **shouldn't** use it.

```js
let arr = [1, 2, 3, 4];
arr.forEach(function(value){
    value = value * 2;
    return value;
});	// arr is now [2, 4, 6, 8]

let obj = { "one": 1, "two": 2, "three": 3, "four": 4 };
Object.entries(obj).forEach(function([key,value]){
    value = value * 2;
    console.log(`${key} times two is ${value}`);
    // TODO: How do I return this?
});
```

While JavaScript's `forEach` is a new feature that is one of the [higher-order functions](https://en.wikipedia.org/wiki/Higher-order_function), you don't want to use it because **IT IS INCREDIBLY SLOW!**[^jspef-for-vs-foreach].

In addition, the `.map()` function could do a way faster job.

```js
Object.entires(obj).map(function([key,value]){
    value = value * 2;
    console.log(`${key} times two is ${value}`);
    // TODO: How do I return this?
});
```

Not to mention, that capital "E" in `forEach` that you are likely to typo even if you've had your morning coffee after a good night's rest such that your brain is wired at its best. You will still make that wretched typo!

For this reason, `forEach` is a terrible way to iterate through arrays and objects.

## for-in is still a thing, but it sucks...it always has!

The Launch Code book teaches the `for-in` loop. It doesn't say anything about `for-of`, but by golly the `for-in` loop is one of those things JavaScript developers have tried to kill for years.

`for-in`'s problem is that is returns the *index* in an array, NOT the *value*. Many new JavaScript programmers make that dumb mistake of assuming that the iterator variable in a `for-in` loop will allow them a quick way to write their array without need to use braces. It doesn't.

```js
let cars = ["Nissan", "Toyota", "Mitsubishi"];
for( let car in cars ){
    console.log(`${car}`);	// car is an INDEX!
}

console.('---');

for( let car in cars ){
    console.log(`${cars[car]}`);	// we can get the VALUE at cars[car]
}
```

```
0
1
2
---
Nissan
Toyota
Mitsubishi
```

`for-in` loops can handle objects, but using them is just as ugly.

```js
let dealers = { "Londoff": "Chevrolet", "Cancella": "Dodge", "Bomarito" : "Volkswagon" };
for( let dealer in dealers ){
    console.log(`${dealer} sells ${dealers[dealer]} cars`);
}
```

```
Londoff sells Chevrolet cars
Cancella sells Dodge cars
Bomarito sells Volkswagon cars
```

There's an exercise in this course where you call an object to fetch something by an array. 

```js
// Old and busted
let studentGrades = {
    a: ["Lisa","Martin"],
    b: ["Milhouse","Sherri","Terri"],
    c: ["Homer","Bart","Nelson","Barney"],
    d: ["Ralph"],
    f: ["Donald","Mike"]
};
let newStudentGrades = {};
for(let grades in studentGrades){
    for(let i = 0; i < studentGrades[grades].length; i++){
        newStudentGrades[studentGrades[grades][i]] = grades.toUpperCase();
    }
}
```

See how convoluted that is! And I used a regular `for` loop as the inner loop. What a mess!

If that weren't bad enough, `for-in` loops are the SLOWEST kind of loop you can use!

Fortunately, a new kind of loop is now part of JavaScript.

## for-of, your new best friend...for Objects at least

`for-of` is the PHP `foreach` of JavaScript.

While you will still need to use `Object.entries()` to convert an object to a N-by-2 array (where the outer array is N number of properites filled with two-member arrays containing the keys and values in the `[0]` and `[1]` positions, respectively) and use alittle bit of *destructuring* to assign each key and value to a variable, using the `for-of` loop is an ELEGANT means of iterating through an object.

```js
for(let [key, value] of Object.entries(obj)){
    console.log(`${key}: ${value}`);
}
```

Let's try it with our `dealers` example:

```js
let dealers = { "Londoff": "Chevrolet", "Cancella": "Dodge", "Bomarito" : "Volkswagon" };
for( let [dealer, brand] of dealers ){
    console.log(`${dealer} sells ${brand} cars`);
}
// ❌TypeError: dealers is not iterable
```

I made this mistake intentionally to remind you that Objects are NOT iterable in JavaScript. Arrays are iterable, but Objects are not. Fortunately, JavaScript provides us with the `Object.entries()` function to turn our object into an array. 

```js
let dealers = { "Londoff": "Chevrolet", "Cancella": "Dodge", "Bomarito" : "Volkswagon" };
for( let [dealer, brand] of dealers ){
    console.log(`${dealer} sells ${brand} cars`);
}
```

```
Londoff sells Chevrolet cars
Cancella sells Dodge cars
Bomarito sells Volkswagon cars
```

Arrays need not be put thorugh the `Object.entries()` function nor need to use destructuring because the `for-of` loop has a iterative structure (the array) to get the data and the iterator variable is the value of that array.  If you don't mind not knowing the index, and just want to cruse through the array using each value in the array.

```js
for(let value of arr){
    console.log(`${arr}`);
}
```

Let's look at that first example from the previous section:

```js
let cars = ["Nissan", "Toyota", "Mitsubishi"];
for( let car of cars ){
    console.log(`${car}`);	// car is the VALUE!
}
```

```
Nissan
Toyota
Mitsubishi
```

Let's look at that one example from earlier again but with for-of instead of `for-in` and `for`: 

```js
// New Hotness
let studentGrades = {
    a: ["Lisa","Martin"],
    b: ["Milhouse","Sherri","Terri"],
    c: ["Homer","Bart","Nelson","Barney"],
    d: ["Ralph"],
    f: ["Donald","Mike"]
};
let newStudentGrades = {};
for(let [grade, students] of Object.entries(studentGrades)){
    for(let student of students){
        newStudentGrades[student] = grade.toUpperCase();
    }
}
```

See how clean that is! We can now see that we are using the outer `for-of` to break apart a `studentGrades` object into a set of keys and values with the variable names `grade` and `students`. Because `students` is an Array, it would make sense to use a plural word for our value variable `students`.  The inner variable will take that array of `students` and break it into a smaller unit called `student`, which will permit us to use that `student` as a new key for our new object `newStudentGrades` that will have a corresponding value `grade` (converted to upper case in this example).

In this example, it is important to remember that object keys MUST be strings. We can not use booleans, functions, arrays, or other objects as keys and all other types, including numbers will need to be converted to a string before using them.

The only downside with using `for-of` is that while it can handle small data quickly, large amounts of data are `for-of`'s Kryptonite.[^med-hsu-for]  Still not as bad as `for-in` or `forEach`, but still not a panacea.

##  Maps are a good alternative to anything "for"

OK, there's no doubt I'm an advocate of `for-of`, but what if you wanted use a higher-order function that wasn't slow and could give you an alternative to do index iteration if you wanted it? The `.map()` function in the Array class will be your go-to function then!

```js
let dealers = { "Londoff": "Chevrolet", "Cancella": "Dodge", "Bomarito" : "Volkswagon" };
Object.entries(dealers).map(function([dealer, brand]){
    console.log(`${dealer} sells ${brand} cars`);
});	// Note: [undefined, undefined, undefined] because we didn't use a return statement in our map function!
```

```
Londoff sells Chevrolet cars
Cancella sells Dodge cars
Bomarito sells Volkswagon cars
```

Generally, `.maps()` are much better when you return something because this function is designed ot transform each entry. What if we returned an array of strings to make the Node console happy?

```js
let dealers = { "Londoff": "Chevrolet", "Cancella": "Dodge", "Bomarito" : "Volkswagon" };
Object.entries(dealers).map(function([dealer, brand]){
    return `${dealer} sells ${brand} cars`;
});
```

```
[ 'Londoff sells Chevrolet cars',
  'Cancella sells Dodge cars',
  'Bomarito sells Volkswagon cars' ]
```

### Object.fromEntries (or Proof that Microsoft Edge is still Internet Explorer)

Could we return an array of objects?* Sure, but lets make it do something in this case. Let's swap our keys and values.

```js
let dealers = { "Londoff": "Chevrolet", "Cancella": "Dodge", "Bomarito" : "Volkswagon" };
Object.entries(dealers).map(function([dealer, brand]){
    return [brand, dealer];
});
```

```
[ [ 'Chevrolet', 'Londoff' ],
  [ 'Dodge', 'Cancella' ],
  [ 'Volkswagon', 'Bomarito' ] ]
```

That's great, but wht if I wanted to convert it back into an object after mapping it?

There's a new function called `Object.fromEntries()`. Just as the String class has `.split()` to deconstruct a String into an Array of characters (or one-character Strings in this case) similar to how `Object.entries()` deconstructs an Object into an Array of two-member arrays, the Array class `join()` converts an array of strings back into an array, the equivalent function that converts an array of two-member array into an Object is `Object.fromEntries()`.

There's just one problem with using `Object.fromEntries()`: Not every browser supports it.[^ciu-fromEntries] (Friggin' Microsoft!)  Because of this lollygagging, some versions of the node console (including the one that Repl uses) may return an error saying that `Object.fromEntries()` is not a function.

```js
let brands = Object.entries(dealers).map(function([dealer, brand]){
    return [brand, dealer];
});
Object.fromEntries(brands);
// ❌ TypeError: Object.fromEntries is not a function
```

Fortunately, JavaScript is flexable enough to allow us to insert our own version until a certain web browser (Edge), gets their stuff together! (Shout out to Dr. Axel Rauschmayer for inspiring this function)

```js
// This code should fix that.
if(!Object.fromEntries){
	Object.fromEntries = function fromEntries(iterable){
		let obj = {};
    	iterable.map( ( [key,value] ) => Object.defineProperty(
        	obj, 
        	['string','symbol'].includes(typeof key) ? key : String(key),
        	{value, writable: true, enumerable: true, configurable: true}
    	));
    	return obj;
	};
}
```

With that written, we can try putting our object back together from an Array.

```js
Object.fromEntries(brands);
```

```
{ Chevrolet: 'Londoff',
  Dodge: 'Cancella',
  Volkswagon: 'Bomarito' }
```

How about that, we now have the ability to map objects like they were Arrays, just like in PHP. Let's finish that off with a function that we might use later.

```js
function mapObject(func,obj){
    return Object.fromEntries(Object.entries().map(([key,value]) => func(key,val)));
};
```

Yeah, I used an arrow function in that. (Be glad I didn't use currying!)

> :information_source: Note: We could use this also to `.filter()` objects too! Possibly `.reduce()` too!
>
> ```js
> function filterObject(func,obj){
>     return Object.fromEntires(Object.entires().filter(([key,value]) => func(key,val)));
> }
> ```
>
> 

## Got a need for speed? for and while still win!

Much like chicken noodle soup and plenty of rest when you are sick, the `for` and `while` loops are still the best way to loop through an array of data.

```js
let arr = Object.entries(obj);
let key, value;
for(let i = 0; i < arr.length; i++){
    [key,value] = arr[i];	// Destructuring, FTW!
    // If we didn't use destruturing, we would use these two lines:
    // key   = arr[i][0];
    // value = array[i][1];
    console.log(`${key}: ${value}`);
}
```

```js
let arr = Object.entries(obj);
//let key, value;
let i = 0;
while(i < arr.length){
    let [key, value] = arr[i];		// This is actually OK!
    console.log(`${key}: ${value}`);
    i++;
}
```

Regardless, using the `Object.entries()` function makes using these classic structures so much better!

Because the `for` loop is based on how the `while` loop works, the `while` loop will be the fasts way to go through a loop.

## Conclusion

JavaScript has evolved from what some people considered a "toy language" in the 1990s and 2000s, to a flexible, evolving powerhouse that complements HTML and CSS and now application development.

The `for-of` loop now allows us to means to process loops quickly without the confusion or slow behavior that `for-in` loop or `forEach` function had.  `Object.entries()` allow us the ablity to convert our non-iterable objects into iterable key-value arrays. By the way, we can extract just the keys or the values using similar functions like `Object.keys()` and `Object.values()`. 

The Array class's `.map()` function will allow us to process objects fluidly, more so when we add the missing functionality that turns arrays back into objects.

Hopefully, this document has provided you a list of tools and methods for solving problems that were not covered in the course material but will be frequently encountered in modern JavaScript.

---

## References

[^ php-ref-array ]: PHP Manual: Function Reference: [Array Functions](https://www.php.net/manual/en/ref.array.php).
[^ php-man-foreach ]: PHP Manual: Language Reference: [`foreach`](https://www.php.net/manual/en/control-structures.foreach.php).
[^ php-types-arrays ]: PHP Manual: Language Reference: [Arrays](https://www.php.net/manual/en/language.types.array.php).
[^ php-types-objects ]: PHP Manual: Language Reference: [Objects](https://www.php.net/manual/en/language.types.object.php).
[^ mdn-jsref-arrays ]: MDN: JavaScript Reference: [`Array`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array).
[^ mdn-jsref-objects ]: MDN. JavaScript Reference: [`Object`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object).
[^ mdn-jsref-foreach ]: MDN. JavaScript Reference: [`Array.prototype.forEach()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach).
[ ^ mdn-jsref-entries ]: MDN. JavaScript Reference: [`Object.entries()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/entries).
[ ^ mdn-jsref-keys ]:  MDN. JavaScript Reference: [`Object.keys()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/keys).
[ ^ mdn-jsref-values ]: MDN. JavaScript Reference: [`Object.values()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/values).
[^ mdn-jsref-for-of ]: MDN. JavaScript Reference: [`for-of`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/for...of).
[^ mdn-jsref-for-in ]: MDN. JavaScript Reference: [`for-in`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/for...in).
[^ mdn-jsref-for ]: MDN. JavaScript Reference: [`for`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/for).
[^ jspef-for-vs-foreach ]: JSPerf. [for vs forEach](https://jsperf.com/for-vs-foreach/75).
[^ med-hsu-for ]: Medium. Better Programming. ["Which Is the Fastes: While, For, forEach(), For...of?"](https://medium.com/better-programming/which-is-the-fastest-while-for-foreach-for-of-9022902be15e). Jonathan Hsu. Dec 1, 2019.
[^ ciu-fromEntries ]: CanIUse.com. [fromEntries](https://caniuse.com/#search=fromEntries).
[^ mdn-jsref-fromEntries ]: MDN. JavaScript Reference: [`Object.fromEntries()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/fromEntries).
[^ 2ality-fromEntires ]: 2ality.com. [fromEntires: An Implmentation](https://2ality.com/2019/01/object-from-entries.html#an-implementation). Axel Rauschmayer. Jan 28, 2019.

---

#JavaScript