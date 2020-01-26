# Counting in Binary and Hexadecimal

[toc]

---

> :information_source: **NOTE**: I had intially stuck this in section 2.2. of the textbook.

> :reminder_ribbon: **TODO**: I still need to finish the notes at the end of this document, but for the most part these notes are ready for use.

In this document, I will discuss why counting is important.  We know how to count to 10 and have probably heard all those *Schoolhouse Rock* songs on Multiplying numbers so many times, they are part of a Spotify playlist.

Here, we are going to talk about how to count in Binary and in Hexadecimal.

## Count to 10

Counting in decimal comes natural to us: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10.

We should actually count just the digits, so stop before we reach 10.

This make so much more sense if we start at zero: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.

Now let's do that in binary. Counting in binary is easy: 0, 1.

Doing this in octal shouldn't be too hard, even though we will rarely use it: 0, 1, 2, 3, 4, 5, 6, 7.

Finally, let's do this in Hexadecimal: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F.

"These are some weird ways to count." Not if you lack fingers, which is why you shouldn't play with fireworks. 🤪

Actually, the reason we do this is because our decimal system we are used to is based on the fact that most of us should have 10 fingers and 10 toes. It's the reason why the metric system is split into tenths when we use it.

So naturally, there would be 10 digits in a decimal system: 0 through 9.

A binary system has 2 digits in it: 0 and 1. In fact, if our world was based on a binary system, I would have told you that a binary system would be a 10 digit system and still have said the *ten* digits were 0 and 1, because 2 in base-2 is 10.

"OK, Jason, how do I count in hexadecimal on my hands when I only have 10 fingers? Do I graft three more fingers on each hand?"

No, but that would be interesting to see. Some folks are polydactyl and have six fingers on their hand, like that one guy from *The Princess Bride*, but we don't need to go that far. In fact, you will only need to use FOUR fingers on ONE hand to do.

## Nine's Table in Your Hands!

Some time in the 1990s, I saw a video of entertainer Sherri Lewis do a trick where you can do the nine-times table by taking both of your hands and putting down one finger/thumb.

```
||||/ \||||		// Let these be your fingers! 
// Long symbols are stretched out. Short ones are closed. 
// Slash and backslash are your thumbs.
..... .....		// 9 *  0 =  0	(0 on the left, 0 on the right)
.|||/ \||||		// 9 *  1 =  9	(0 on the left, 9 on the right)
|.||/ \||||		// 9 *  2 = 18 	(1 on the left, 8 on the right)
||.|/ \||||		// 9 *  3 = 27	(2 on the left, 7 on the right)
|||./ \||||		// 9 *  4 = 36	(3 on the left, 6 on the right)
||||. \||||		// 9 *  5 = 45	(4 on the left, 5 on the right)
||||/ .||||		// 9 *  6 = 54	(5 on the left, 4 on the right)
||||/ \.|||		// 9 *  7 = 63	(6 on the left, 3 on the right)
||||/ \|.||		// 9 *  8 = 72	(7 on the left, 2 on the right)
||||/ \||.|		// 9 *  9 = 81	(8 on the left, 1 on the right)
||||/ \|||.		// 9 * 10 = 90	(9 on the left, 0 on the right)
```

Pretty cool, right? The only downside is that it doesn't work with other numbers, except maybe one and zero of which your just counting your fingers in the case of 1, and in term of zero you shouldn't be counting anything.

Or so we think.

## Digital Fingers!

What if I could show you how to count from zero to fifteen on one hand and without your thumbs? It's possibly but you'll need to understand the concept of binary numbers to do it.

**Binary** goes by a few names. **Base-2** or **boolean** is are a couple of them. The 10 digit number system we are used to is called the **decimal** system or **base-10**. It's pretty obvious how we decided to use a 10 digit number system. An overwhelming majority of people have 10 fingers and 10 toes. There are 10 years in a "decade". The International System of Units group things together in tens or tenths of something.

Some ancient civilizations like the Mayans used a **duodecimal** or **base-12** system.

Early computer used **octal** or **base-8** system which would count from 0 through 7. But the **hexadecimal** or **base-16** system, eventually took over when an extra bit was added at the beginning of each **half-byte** or **nibble**.

And that's how we are going to learn binary and hexadecimal. Let's look at our finger diagram again.

```
X....	// to exclude thumbs, there is an X where we shoud not be using thumbs in this experiement.  Not unless you want a lesson on "signed bits". (Yeah, I didn't think so.)
// Let's also add some columns showing how they are lined up.
// Let's practice on the right hand.
// Your right pinky finger represents 1 (2^0 = 1)
// Your right ring finger represents 2 (2^1 = 2)
// Your right middle finger represent 4 (2^2 = 4)
// Your right index finger represents 8 (2^3 = 8)
// Ignore your thumb!
// I will show the math as well as what those values look like when strung together.

x....	// 8 * 0 + 4 * 0 + 2 * 0 + 1 * 0 = 0	0000 = 0
x...|	// 8 * 0 + 4 * 0 + 2 * 0 + 1 * 1 = 1	0001 = 1
x..|.	// 8 * 0 + 4 * 0 + 2 * 1 + 1 * 0 = 2	0010 = 2
x..||	// 8 * 0 + 4 * 0 + 2 * 1 + 1 * 1 = 3	0011 = 3
x.|..	// 8 * 0 + 4 * 1 + 2 * 0 + 1 * 0 = 4	0100 = 4
x.|.|	// 8 * 0 + 4 * 1 + 2 * 0 + 1 * 1 = 5	0101 = 5
x.||.	// 8 * 0 + 4 * 1 + 2 * 1 + 1 * 0 = 6	0110 = 6
x.|||	// 8 * 0 + 4 * 1 + 2 * 1 + 1 * 1 = 7	0111 = 7
x|...	// 8 * 1 + 4 * 0 + 2 * 0 + 1 * 0 = 8	0000 = 8
x|..|	// 8 * 1 + 4 * 0 + 2 * 0 + 1 * 1 = 9	0001 = 9
x|.|.	// 8 * 1 + 4 * 0 + 2 * 1 + 1 * 0 = 10	0010 = A	(10 = A)
x|.||	// 8 * 1 + 4 * 0 + 2 * 1 + 1 * 1 = 11	0011 = B	(11 = B)
x||..	// 8 * 1 + 4 * 1 + 2 * 0 + 1 * 0 = 12	0100 = C	(12 = C)
x||.|	// 8 * 1 + 4 * 1 + 2 * 0 + 1 * 1 = 13	0101 = D	(13 = D)
x|||.	// 8 * 1 + 4 * 1 + 2 * 1 + 1 * 0 = 14	0110 = E	(14 = E)
x||||	// 8 * 1 + 4 * 1 + 2 * 1 + 1 * 1 = 15	0111 = F	(15 = F)
```

Mind-blown, right?

In hexadecimal we count from 0 through F (15). 16 in base-10 is 10 in base-16. But that "1" in is in your left hand with your finger extended, while your right hand has all its fingers closed. 

Still confusing? Let's try using both hands this time.

```
lllll rrrrr
prmit timrp
....x x....

// This time, with your left hand
// * Ignore your left thumb
// * let your left index finger represent 16 (2^4)
// * let your left middle finger represent 32 (2^5)
// * let your left ring finger reprsent 64 (2^6)
// * let your left pinky finger represent 128 (2^7)

....x x....	//   0 (00)		...		....x x...|	//   1 (01)
....x x...|	//   1 (01)
....x x..|.	//   2 (02)		... 	....x x..||	//   3 (03)
....x x.|..	//   4 (04)		... 	....x x.|||	//   7 (07)
....x x|...	//   8 (08)		... 	....x x||||	//  15 (0F)
...|x x....	//  16 (10)		... 	...|x x||||	//  31 (1F)
..|.x x....	//  32 (20)		... 	..||x x||||	//  63 (3F)
.|..x x....	//  64 (40)		... 	.|||x x||||	// 127 (7F)
|...x x....	// 128 (80)		... 	||||x x||||	// 255 (FF)
```

Do you get it now?

Your right hand represent the **lower nibble** while your left hand represents the **higher nibble**. Together those two digits form an 8-bit unit called a **byte**!

## Converting Decimal to Binary or Hexidecimal :reminder_ribbon:

The formula for this conversion looks like this
$$
\begin{aligned}
\text{For } D \in [0,255] \and \{h,l\} \in [0,1] \and \{H,L\} \in [0,F]: \\
\\
\end{aligned}
\\
\require{enclosed}
\begin{aligned}
\begin{array}{rrll}
&q_7 &\text{R } h_3 & \rightarrow & \quad h_3  \cdot 8  &&&&&& q_7 \text{ should be 0}\\ 
&2 \enclose{longdiv}{q_6} \\
&\uparrow \\
&q_6 &\text{R } h_2 & \rightarrow & \quad h_2 \cdot 4 \\ 
&2 \enclose{longdiv}{q_5} \\
&\uparrow \\
&q_5 &\text{R } h_1 & \rightarrow & \quad h_1 \cdot 2 \\ 
&2 \enclose{longdiv}{q_4} \\
&\uparrow \\
&q_4 &\text{R } h_0 & \rightarrow & \underline{+ h_0 \cdot 1} \\ 
&2 \enclose{longdiv}{q_3} \\

&\uparrow \\
&q_3 &\text{R } l_3 & \rightarrow &&& \quad l_3 \cdot 8 \\ 
&2 \enclose{longdiv}{q_2} \\
&\uparrow \\
&q_2 &\text{R } l_2 & \rightarrow &&& \quad l_2 \cdot 4 \\ 
&2 \enclose{longdiv}{q_1} \\
&\uparrow \\
&q_1 &\text{R } l_1 & \rightarrow &&& \quad l_1 \cdot 2 \\ 
&2 \enclose{longdiv}{q_0} \\
&\uparrow \\
&q_0 &\text{R } l_0 & \rightarrow &&& \underline{+ l_0 \cdot 1} \\ 
\text{Start down here! } \quad D_{(10)}\rightarrow & 2 \enclose{longdiv}{D}
&&& \quad \quad \downarrow & &\quad \quad \downarrow \\
&&&& \quad [ \quad H & & |\quad \quad L &] &= X_{(16)}
\end{array}
\end{aligned}
\\
$$
There is a much more elegant way to do this than like above. The above looks a lot like a cracking tower used by a petroleum distiller to separate crude oil into different hydrocarbons. Each division produces a quotient and a remainder. The remainder is also called a modulus and it has an operator for integer division.

> :reminder_ribbon: **TODO**: Show that again but this time as a state diagram or flow chart in Mermaid!

The output should be a two digit hexadecimal between 00 and FF, equivalent to 0 and 255 in decimal.

So how is this useful?

## ASCII Table

The basic set of symbols that a computer uses which are represented with the hexadecimal values of 0 through 7F, which could also be represented with decimal values 0 through 127 or octal values 0 through 177 are know as the **ASCII Characters**.

> :information_source: **NOTE**: I reversed the order of the columns so that it would be understood how the left hand's fingers represent the higher nibble.

<table>
	<tr>
     <th title="Hexadecimal">Hex</th>
     <th></th>
 	 <th><code>0x7<var>l</var></code></th>
 	 <th><code>0x6<var>l</var></code></th>
 	 <th><code>0x5<var>l</var></code></th>
 	 <th><code>0x4<var>l</var></code></th>
 	 <th><code>0x3<var>l</var></code></th>
 	 <th><code>0x2<var>l</var></code></th>
 	 <th><code>0x1<var>l</var></code></th>
 	 <th><code>0x0<var>l</var></code></th>
    </tr>
	<tr>
     <th></th>
     <th title="Decimal">Dec</th>
 	<th><code>112+<var>l</var></code></th>
 	<th><code>96+<var>l</var></code></th>
 	<th><code>80+<var>l</var></code></th>
 	<th><code>64+<var>l</var></code></th>
 	<th><code>48+<var>l</var></code></th>
 	<th><code>32+<var>l</var></code></th>
 	<th><code>16+<var>l</var></code></th>
 	<th><code>0+<var>l</var></code></th>
 </tr>
 <tr>
     <th><code>0x<var>h</var>0</code></th>
     <th><code><var>h</var>+0</code></th>
     <td><code>p</code></td>
     <td><code title="Grave Accent/Back Tick">`</code></td>
     <td><code>P</code></td>
     <td><code title="At">@</code></td>
     <td><code title="Zero">0</code></td>
     <td><code title="Space">SP</code></td>
     <td><code title="Data Link Escape">DLE</code></td>
     <td><code title="Null">NUL</code></td>
 </tr>
 <tr>
     <th><code>0x<var>h</var>1</code></th>
     <th><code><var>h</var>+1</code></th>
     <td><code>q</code></td>
     <td><code>a</code></td>
     <td><code>Q</code></td>
     <td><code>A</code></td>
     <td><code title="One">1</code></td>
     <td><code title="Exclamation Point">!</code></td>
     <td><code title="Device Control 1/XON">DC1</code></td>
     <td><code title="Start of Header">STX</code></td>
 </tr>
 <tr>
     <th><code>0x<var>h</var>2</code></th>
     <th><code><var>h</var>+2</code></th>
     <td><code>r</code></td>
     <td><code>b</code></td>
     <td><code>R</code></td>
     <td><code>B</code></td>
     <td><code title="Two">2</code></td>
     <td><code title="Double Quote">&quot;</code></td>
     <td><code title="Device Control 2">DC2</code></td>
     <td><code title="Start of Text">SOT</code></td>
 </tr>
 <tr>
     <th><code>0x<var>h</var>3</code></th>
     <th><code><var>h</var>+3</code></th>
     <td><code>s</code></td>
     <td><code>c</code></td>
     <td><code>S</code></td>
     <td><code>C</code></td>
     <td><code title="Three">3</code></td>
     <td><code title="Octothorpe/Pound/Hash">#</code></td>
     <td><code title="Device Control 3/XOFF">DC3</code></td>
     <td><code title="End of Text">ETX</code></td>
 </tr>
 <tr>
     <th><code>0x<var>h</var>4</code></th>
     <th><code><var>h</var>+4</code></th>
     <td><code>t</code></td>
     <td><code>d</code></td>
     <td><code>T</code></td>
     <td><code>D</code></td>
     <td><code title="Four">4</code></td>
     <td><code title="Dollar Sign">$</code></td>
     <td><code title="Device Control 4">DC4</code></td>
     <td><code title="End of Transmission">EOT</code></td>
 </tr>
 <tr>
     <th><code>0x<var>h</var>5</code></th>
     <th><code><var>h</var>+5</code></th>
     <td><code>u</code></td>
     <td><code>e</code></td>
     <td><code>U</code></td>
     <td><code>E</code></td>
     <td><code title="Five">5</code></td>
     <td><code title="Percent Sign">%</code></td>
     <td><code title="Negative Acknowledge">NAK</code></td>
     <td><code title="Enquiry">ENQ</code></td>
 </tr>
 <tr>
     <th><code>0x<var>h</var>6</code></th>
     <th><code><var>h</var>+6</code></th>
     <td><code>v</code></td>
     <td><code>f</code></td>
     <td><code>V</code></td>
     <td><code>F</code></td>
     <td><code title="Six">6</code></td>
     <td><code title="Ampersand">&amp;</code></td>
     <td><code title="Synchronous Idle">SYN</code></td>
     <td><code title="Acknowledge">ACK</code></td>
 </tr>
 <tr>
     <th><code>0x<var>h</var>7</code></th>
     <th><code><var>h</var>+7</code></th>
     <td><code>w</code></td>
     <td><code>g</code></td>
     <td><code>W</code></td>
     <td><code>G</code></td>
     <td><code title="Seven">7</code></td>
     <td><code title="Single Quote/Apostrophe">&apos;</code></td>
     <td><code title="End of Transmission Block">ETB</code></td>
     <td><code title="(Audio) Bell/Beep">BEL</code></td>
 </tr>
 <tr>
     <th><code>0x<var>h</var>8</code></th>
     <th><code><var>h</var>+8</code></th>
     <td><code>x</code></td>
     <td><code>h</code></td>
     <td><code>X</code></td>
     <td><code>H</code></td>
     <td><code title="Eight">8</code></td>
     <td><code title="Open parenthesis">(</code></td>
     <td><code title="Cancel">CAN</code></td>
     <td><code title="Backspace">BS</code></td>
 </tr>
 <tr>
     <th><code>0x<var>h</var>9</code></th>
     <th><code><var>h</var>+9</code></th>
     <td><code>y</code></td>
     <td><code>i</code></td>
     <td><code>Y</code></td>
     <td><code>I</code></td>
     <td><code title="Nine">9</code></td>
     <td><code title="Close Parenthesis">)</code></td>
     <td><code title="End of Medium">EM</code></td>
     <td><code title="Horizontal Tabulation/Tab">HT/Tab</code></td>
 </tr>
 <tr>
     <th><code>0x<var>h</var>A</code></th>
     <th><code><var>h</var>+10</code></th>
     <td><code>z</code></td>
     <td><code>j</code></td>
     <td><code>Z</code></td>
     <td><code>J</code></td>
     <td><code title="Colon">:</code></td>
     <td><code title="Asterisk/Star">*</code></td>
     <td><code title="Substitute">SUM</code></td>
     <td><code title="Line Feed/New Line">LF</code></td>
 </tr>
 <tr>
     <th><code>0x<var>h</var>B</code></th>
     <th><code><var>h</var>+11</code></th>
     <td><code title="Opening (Curly) Brace">{</code></td>
     <td><code>k</code></td>
     <td><code title="Opening (Square) Bracket">[</code></td>
     <td><code>K</code></td>
     <td><code title="Semicolon">;</code></td>
     <td><code title="Plus Sign">+</code></td>
     <td><code title="Escape">ESC</code></td>
     <td><code title="Vertical Tabulation/Vertical Tab">VT</code></td>
 </tr>
 <tr>
     <th><code>0x<var>h</var>C</code></th>
     <th><code><var>h</var>+12</code></th>
     <td><code title="Pipe/Vertical Bar">|</code></td>
     <td><code>l</code></td>
     <td><code title="Backslash">\</code></td>
     <td><code>L</code></td>
     <td><code title="Less Than">&lt;</code></td>
     <td><code title="Comma">,</code></td>
     <td><code title="File Separator">FS</code></td>
     <td><code title="Form Feed">FF</code></td>
 </tr>
 <tr>
     <th><code>0x<var>h</var>D</code></th>
     <th><code><var>h</var>+13</code></th>
     <td><code title="Close (Curly) Brace">}</code></td>
     <td><code>m</code></td>
     <td><code title="Close (Square) Bracket">]</code></td>
     <td><code>M</code></td>
     <td><code title="Equal">=</code></td>
     <td><code title="Dash/Hyphen/Minus Sign">-</code></td>
     <td><code title="Group Separator">GS</code></td>
     <td><code title="Carriage Return">CR</code></td>
 </tr>
 <tr>
     <th><code>0x<var>h</var>E</code></th>
     <th><code><var>h</var>+14</code></th>
     <td><code title="Tilde">~</code></td>
     <td><code>n</code></td>
     <td><code title="Caret/Hat">^</code></td>
     <td><code>N</code></td>
     <td><code title="Greater Than">&gt;</code></td>
     <td><code title="Full Stop/Period">.</code></td>
     <td><code title="Record Separator">RS</code></td>
     <td><code title="Shift Out">SO</code></td>
 </tr>
 <tr>
     <th><code>0x<var>h</var>F</code></th>
     <th><code><var>h</var>+15</code></th>
     <td><code title="Delete">DEL</code></td>
     <td><code>o</code></td>
     <td><code title="Underscore">_</code></td>
     <td><code>O</code></td>
     <td><code title="Question Mark">?</code></td>
     <td><code title="(Forward) Slash">/</code></td>
     <td><code title="Unit Separator">US</code></td>
     <td><code title="Shift In">SI</code></td>
 </tr>
</table>

The above table is called the **ASCII Table**. I added two rows on the top and two columns on the left such that the first row and the first column represent the numbers/letters of each nibble. (`h` for higher, `l` for lower). The second row and column shows how if you add the decimal equivalent of each nibble, the sum is the decimal equivalent.

This is a bit of a short cut from the usual way of converting hexadecimal to decimal which is to break apart each bit in both nibbles and get the sum using this formula.
$$
\begin{aligned}
\text{For } \{H,L\} \in [0,F] \and \{h,l\} \in [0,1] \and D \in [0,255]: \\
\\
X_{(16)} &= \\
\left[ H | L \right] &= \\
2^4 \cdot \left( \sum_{i=0}^3 2^i \cdot h_i \right) + 2^0 \cdot \left( \sum_{i=0}^3 2^i \cdot l_i \right) &= \\
2^4 \cdot ( 2^3 \cdot h_3 + 2^2 \cdot h_2 + 2^1 \cdot h_1 + 2^0 \cdot h_0 ) + 
2^0 \cdot ( 2^3 \cdot l_3 + 2^2 \cdot l_2 + 2^1 \cdot l_1 + 2^0 \cdot l_0 ) &= \\
( 2^7 \cdot h_3 + 2^6 \cdot h_2 + 2^5 \cdot h_1 + 2^4 \cdot h_0 ) + 
( 2^3 \cdot l_3 + 2^2 \cdot l_2 + 2^1 \cdot l_1 + 2^0 \cdot l_0 ) &= \\
 2^7 \cdot h_3 + 2^6 \cdot h_2 + 2^5 \cdot h_1 + 2^4 \cdot h_0 + 
 2^3 \cdot l_3 + 2^2 \cdot l_2 + 2^1 \cdot l_1 + 2^0 \cdot l_0 &= D_{(10)}
\end{aligned}
$$
You may notice that some of the bits for the number and symbol keys have a correspondence with each other. Certainly there is a storied history behind why some of the symbols have changed position, but it's not one that is relevant, nor fits these notes. (Yet.)

## Escape Sequences :reminder_ribbon:

> :reminder_ribbon: **TODO**: Create a list of Escape Sequence

## Bitwise Operators :reminder_ribbon:

> :reminder_ribbon: **TODO**: Explore how bitwise operators work!

> :point_up: **ONE MORE THING!** I almost forgot ot mention, when you do that "binary math", you can actually multiply and divide by two with a rarely used set of operators used in JavaScript that are part of a couple of ther languages called **bit shifters**.  
>
> Think if it like this: Every time you multiply by two, you shift the bits to the left by one place. 1 becomes 2 because 1 times 2 is 2. 2 becomes 4 because 2 times 2 is 4. 4 becomes 8 because 4 times 2 is 8. etc. We can effective do this  within the range of our bits. If we shift to far left, that is an **overflow**. While we know that 2 times 128 (which is 2 to the 7th power) is 256 (which is 2 to the 8th power), we start back at 0. Think of it as how at 12:59 PM, the clock doesn't roll over to 13:00 (less you have one of those 24 hour clocks) but a 1:00 PM.
>
> Multiplication by 2 is a **bit shift left** (`x = x << 1;`), while dividing by 2 is a **bit shift right** (`x = x >> 1;`).
>
> **What about remainders in odd numbers?**
> If we bit shifted a number like 7 to the right by 1 place, the value becomes 3. While 7 divided by 2 is 6 with a remainder of 1, in rightward bit shifting, remainders are discarded.
>
> > :reminder_ribbon: **TODO**: How do computers divide by odd numbers if bit shifting explains how we can multiply and divide by even numbers that have a base of 2 (2, 4, 8, 16, 32, etc.) But how about numbers like 3 or 6?
>
> These left and right bit shift operators only apply to integer values. We can't use them for floating point numbers. 
>
> This is all beyond the scope of this course, but useful to know if you're curious about what those `<<` and `>>` operators (and a couple of others) do.



---

#Computer_Science