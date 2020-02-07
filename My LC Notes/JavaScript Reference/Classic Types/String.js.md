# Strings

> :information_source: **NOTE**: Depricated and removed features have been omitted from thsi documentation.

[toc]

---

## Inherits from

* [`Function`](Function.js.md)
* [`Object`](Object.js.md)

## Constructor

* `String`

## Properties

### Static Properties

* `String.prototype` - Allows the addition of properties to a `String` object.

### Instance Properties

> :information_source: **NOTE:** Instance Properties are usually documented with `String.prototype.` as a prefix. In order to save time, I have ommitted this.

* `constructor` (read only) - Specifis the function that creates an object's prototype.

* `length`  (read only) - returns an integer indicating the length of the string.
* *`N`* (read only) - Used to access the character in the `N`th position where `N` is an integer between `0` and `str.length - 1`.

## Methods

### Static Methods

* `String.fromCharCode(num[,...[numN]])` - Returns a string created by using the specified sequence of Unicode values.
* `String.fromCharPoint(num[,...[numN]])` - Returns a string created by using the specified sequence of code points.
* `String.raw()` - Returns a string created from a raw template string.

### Instance Methods

> :information_source: **NOTE:** Instance Methods are usually documented with `String.prototype.` as a prefix. In order to save time, I have ommitted this.
>
> Methods with the :warning: emoji indicate that it is not standardized. Documentation will only be provided if it is actually useful.

* `charAt(index)` - Returns the character (exactly one UTF-16 code unit) at the specified `index`.

* `charCodeAt(index)` - Returns a number that is the UTF-16 code unit at the specified `index`.

* `charCodePointAt(index)` - Returns a nonnegative integer `Number` that is the code point value of the UTF-16 encoded code point starting at the specified `index`.

* `concat(str[, ...strN])` - Combines the text of two (or more) strings and returns a new string.

* `endsWith(searchString[, length])` - Determines whether a string ends with the characters of the string `searchString`.

* `includes(searchString[, position])` - Determines wheter the calling string contains `searchString`.

* `indexOf(searchValue[, fromIndex])` - Returns the index within the calling `String` object of the first occurence of `searchValue`, or `-1` if not found.

* `lastIndexOf(searchValue[, fromIndex])` - Returns the index within the calling `String` object of the last occurence of `searchValue`, or `-1` if not found.

* `localeCompare(compareString[, locales [, options]])` - Returns a number indicating whether the reference string `compareString` comes before, after, or is equivalent to the given string in sort order.

* `match(regexp)` - Used to match regular expression `regexp` against a string.

* `matchAll(regexp)` - Returns an iterator of all matches of `regexp`.

* `normalize([form])` - Returns the Unicode Normalization Form of the calling string value.

* `padEnd(targetLength[, padString])` - Pads the current string from the end with a given string and returns a new string of the length `targetLength`.

* `padStart(targetLength[, padString])` - Pads the current string from the start with a given string and returns a new string of the length `targetLength`.

* `repeat(count)` - Returns a string consisting of the elements of the object repeated `count` times.

* `replace(searchFor,replaceWith)` - Used to replace occurrences of `searchFor` (which may be a string or regular expression) using `replaceWith` (which may be a string or a function).

* `search(regexp)` - Search for a match between a regular expression `regexp` and the calling string.

* `slice(beginIndex[, endIndex])` - Extracts a section of a string and returns a new string.

* `split([sep [,limit]])` - Returns an array of strings populated by spliting the calling string at occurences of the substring `sep`.

* `startsWith(searchString[, length])` - Determines whether the calling string begins with the characters of string `searchString`.

* `substring(beginIndex[, endIndex])` - Returns a new string containing characters of the calling string from (or between) the specified index (or indeces).

* `toLocaleLowerCase([locale, ...locales])` - The characters within a string are converted to lowercase while respecting the current locale. For most languages, this will return the same as `toLowerCase()`.

* `toLocaleUpperCase([locale, ...locales])`  - The characters within a string are converted to uppercase while respecting the current locale. For most languages, this will return the same as `toUpperCase()`.

* `toLowerCase()` - Returns the calling string value converted to lowercase.

* `toSource()` :warning: - Returns an object literal representing the specified object; you can use this value to create a new object. Overrides the `Object.prototype.toSource()` method.

* `toString()` - Returns a string representing the specified object. Overrides the `Object.prototype.toString()` method.

  > :information_source: **NOTE**: When executing String conversion, It is possible to use `String` as a more reliable `toString()` alternative, as it works when used on `null`, `undefined`, or on `Symbols`.

* `toUpperCase()` - Returns the calling string value converted to uppercase.

* `trim()` - Trims whitespace from the beginning and end of the string.

* `trimEnd()` (or `trimRight()`) - Trims whitespace from the end of the string.

* `trimStart()` (or `trimLeft()`) - Trims whitespace from the beginning of the string.

* `valueOf()` - Returns the primitive value of the specific object. Overrides the `Object.prototype.valueOf()` method.

* `[@@iterator]()` (or is it `@@iterator()`?) - Returns a new `Iterator` object that iterates over the codepoint of a String value, returning each code point as a String value.



---

## References

[^mdn]: MDN Web Docs. [Strings](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String).
[^ w3s ]: W3Schools.com [Strings](https://www.w3schools.com/jsref/jsref_obj_string.asp)



---

#JavaScriptReference