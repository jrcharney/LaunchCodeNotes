# Important Stuff to remember

[toc]

---

## JavaScript-C++ Mnemonic

```js
// Single line comment
/* Multiline
 * Comments
 */
const input = require('readline-sync');		// This is like your "#include<iostream>" for cin

let stringInput = input.question("What's the word? ");	// This is your 'cin'
let numberInput = Number(input.question("Pick a number: "));	// with type conversion

let number1;			// Delcaration
number1 = numberInput;	// Assignement

let number2 = inputQuestion("Pick another number: ");
console.log(typeof number2);		// "string"
number2 = Number(number2);			// also type conersion
console.log(typeof number2);		// "number"

console.log("Concatenating " + number1 + " " + number2);
console.log("Also concatenating ",number1,number2);
console.log(`Template literals: ${number1} ${number2}`);

console.log("This is your 'cout'");	// it doesn't need the readline-sync

// todo: only if example

if(number1 %2 === 0){
    console.log(`${number1} is even`);
} else {
    console.log(`${number1} is odd`);
}

// ternary operator is single line if-else statement!
console.log(`${number2} is ${(number2 % 2 === 0) ? "even" : "odd"}`);	// ternary opertor

// todo: if-else-if-else example

// todo: ternary operator
// let result = (test1) ? true1 : (test2) ? true2 : false;

// todo: if-else if
```

## Important parts of Textbook Notes

* In chapter 5, I have truth tables and flow charts.
* In chapter 6, section 4 (6.4), there is a Class diagram showing the error types and a table showing what each one does.



## Things I whish JavaScript would do

* [ ] Borrow text transformation from Bash for template literals for string values