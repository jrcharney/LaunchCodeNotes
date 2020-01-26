# Operators

[toc]

---

## Order of Operations :reminder_ribbon:

The **order of operations** or **operator precedence**, is the order by which the rules for operations are applied.

> :information_source: **Note**: Originally this table was posted in Section 4.6.3.2. of the Textbook.

> :reminder_ribbon: **TODO**: Add a Notes column later, or better yet add some superscripts and list out stuff after the table is complete.

The following table is ordered from highest (21) to lowest (1) precedence.

<table>
    <tr>
    	<th>Precedence</th>
        <th>Operator Type</th>
        <th>Associativity<sup>1</sup></th>
        <th>Individual operators</th>
    </tr>
    <tr>
    	<td>21</td>
        <td>Grouping</td>
        <td>n/a</td>
        <td><code>( <var>&hellip;</var> )</code></td>
    </tr>
    <tr>
    	<td>20</td>
        <td>Member Access</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> . <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>20</td>
        <td>Computed Member Access</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> [ <var>&hellip;</var> ]</code></td>
    </tr>
    <tr>
    	<td>20</td>
        <td><code>new</code> (with argument list)</td>
        <td>N/A</td>
        <td><code>new <var>&hellip;</var> ( <var>&hellip;</var> )</code></td>
    </tr>
    <tr>
    	<td>20</td>
        <td>Function Call</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> ( <var>&hellip;</var> )</code></td>
    </tr>
    <tr>
    	<td>20</td>
        <td>Optional chaining</td>
        <td>LTR</td>
        <td><code>?.</code></td>
    </tr>
    <tr>
    	<td>19</td>
        <td><code>new</code> (without argument list)</td>
        <td>RTL</td>
        <td><code>new <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>18</td>
        <td>Postfix Increment</td>
        <td>N/A</td>
        <td><code><var>&hellip;</var> ++</code></td>
    </tr>
    <tr>
    	<td>18</td>
        <td>Postfix Decrement</td>
        <td>N/A</td>
        <td><code><var>&hellip;</var> --</code></td>
    </tr>
    <tr>
    	<td>17</td>
        <td>Logical NOT</td>
        <td>RTL</td>
        <td><code>! <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>17</td>
        <td>Bitwise NOT</td>
        <td>RTL</td>
        <td><code>~ <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>17</td>
        <td>Unary Plus</td>
        <td>RTL</td>
        <td><code>+ <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>17</td>
        <td>Unary Negation</td>
        <td>RTL</td>
        <td><code>- <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>17</td>
        <td>Prefix Increment</td>
        <td>RTL</td>
        <td><code>++ <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>17</td>
        <td>Prefix Decrement</td>
        <td>RTL</td>
        <td><code>-- <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>17</td>
        <td><code>typeof</code></td>
        <td>RTL</td>
        <td><code>typeof <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>17</td>
        <td><code>void</code></td>
        <td>RTL</td>
        <td><code>void <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>17</td>
        <td><code>delete</code></td>
        <td>RTL</td>
        <td><code>delete <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>17</td>
        <td><code>await</code></td>
        <td>RTL</td>
        <td><code>await <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>16</td>
        <td>Exponentiation</td>
        <td>RTL</td>
        <td><code><var>&hellip;</var> ** <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>15</td>
        <td>Multiplication</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> * <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>15</td>
        <td>Division</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> / <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>15</td>
        <td>Remainder (Modulus)</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> % <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>14</td>
        <td>Addition</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> + <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>14</td>
        <td>Subtraction</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> - <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>13</td>
        <td>Bitwise Left Shift</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> &lt;&lt; <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>13</td>
        <td>Bitwise Right Shift</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> &gt;&gt; <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>13</td>
        <td>Bitwise Unsigned Right Shift</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> &gt;&gt;&gt; <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>12</td>
        <td>Less Than</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> &lt; <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>12</td>
        <td>Less Than or Equal</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> &lt;= <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>12</td>
        <td>Greater than</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> &gt; <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>12</td>
        <td>Greater Than or Equal</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> &gt;= <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>12</td>
        <td><code>in</code></td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> in <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>12</td>
        <td><code>instanceof</code></td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> instanceof <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>11</td>
        <td>Equality</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> == <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>11</td>
        <td>Inequality</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> != <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>11</td>
        <td>Strict Equality</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> === <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>11</td>
        <td>Strict Inequality</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> !== <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>10</td>
        <td>Bitwise AND</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> &amp; <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>9</td>
        <td>Bitwise XOR</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> ^ <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>8</td>
        <td>Bitwise OR</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> | <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>7</td>
        <td>Nullish coalescing operator</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> ?? <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>6</td>
        <td>Logical AND</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> &amp;&amp; <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>5</td>
        <td>Logical OR</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> || <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>4</td>
        <td>Conditional</td>
        <td>RTL</td>
        <td><code><var>&hellip;</var> ? <var>&hellip;</var> : <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>3</td>
        <td>Assignemnt</td>
        <td>RTL</td>
        <td><code><var>&hellip;</var> = <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>3</td>
        <td>Assignemnt</td>
        <td>RTL</td>
        <td><code><var>&hellip;</var> += <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>3</td>
        <td>Assignemnt</td>
        <td>RTL</td>
        <td><code><var>&hellip;</var> -= <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>3</td>
        <td>Assignemnt</td>
        <td>RTL</td>
        <td><code><var>&hellip;</var> **= <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>3</td>
        <td>Assignemnt</td>
        <td>RTL</td>
        <td><code><var>&hellip;</var> *= <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>3</td>
        <td>Assignemnt</td>
        <td>RTL</td>
        <td><code><var>&hellip;</var> /= <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>3</td>
        <td>Assignemnt</td>
        <td>RTL</td>
        <td><code><var>&hellip;</var> %= <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>3</td>
        <td>Assignemnt</td>
        <td>RTL</td>
        <td><code><var>&hellip;</var> &lt;&lt;= <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>3</td>
        <td>Assignemnt</td>
        <td>RTL</td>
        <td><code><var>&hellip;</var> &gt;&gt;= <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>3</td>
        <td>Assignemnt</td>
        <td>RTL</td>
        <td><code><var>&hellip;</var> &gt;&gt;&gt;= <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>3</td>
        <td>Assignemnt</td>
        <td>RTL</td>
        <td><code><var>&hellip;</var> &amp;= <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>3</td>
        <td>Assignemnt</td>
        <td>RTL</td>
        <td><code><var>&hellip;</var> ^= <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>3</td>
        <td>Assignemnt</td>
        <td>RTL</td>
        <td><code><var>&hellip;</var> |= <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>2</td>
        <td>yield</td>
        <td>RTL</td>
        <td><code>yield <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>2</td>
        <td>yield*</td>
        <td>RTL</td>
        <td><code>yield* <var>&hellip;</var></code></td>
    </tr>
    <tr>
    	<td>1</td>
        <td>Comma/Sequence</td>
        <td>LTR</td>
        <td><code><var>&hellip;</var> , <var>&hellip;</var></code></td>
    </tr>
</table>

A few notes about the above table:

1. The **Associativity** column indicate how this operation will operate, from Left-to-right (LTR) or Right-to-left (RTL).

For more details, read [this page](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Operator_Precedence).

> :reminder_ribbon: **TODO**: Should I add a section that describes what each of the operators does?
> (More than likely, but I don't feel like doing it right now.)

## Compound Assignment Operators

**Compound assignment operators** allow us to use a shorthand to execute some operators. They have a low precedence so they won't execute until all the stuff on the right-hand side is computed.

<table>
    <tr>
        <th>Shorthand</th>
        <th>Meaning</th>
    </tr>
    <tr>
    	<td><code><var>x</var> = <var>y</var></code></td>
    	<td><code><var>x</var> = <var>y</var></code></td>
    </tr>
    <tr>
    	<td><code><var>x</var> += <var>y</var></code></td>
    	<td><code><var>x</var> = <var>x</var> + <var>y</var></code></td>
    </tr>
    <tr>
        <td><code><var>x</var> -= <var>y</var></code></td>
    	<td><code><var>x</var> = <var>x</var> - <var>y</var></code></td>
    </tr>
    <tr>
        <td><code><var>x</var> **= <var>y</var></code></td>
    	<td><code><var>x</var> = <var>x</var> ** <var>y</var></code></td>
    </tr>
    <tr>
		<td><code><var>x</var> *= <var>y</var></code></td>
    	<td><code><var>x</var> = <var>x</var> * <var>y</var></code></td>
    </tr>
    <tr>
		<td><code><var>x</var> /= <var>y</var></code></td>
    	<td><code><var>x</var> = <var>x</var> / <var>y</var></code></td>
    </tr>
    <tr>
		<td><code><var>x</var> %= <var>y</var></code></td>
    	<td><code><var>x</var> = <var>x</var> % <var>y</var></code></td>
    </tr>
    <tr>
        <td><code><var>x</var> &lt;&lt;= <var>y</var></code></td>
    	<td><code><var>x</var> = <var>x</var> &lt;&lt; <var>y</var></code></td>
    </tr>
    <tr>
		<td><code><var>x</var> &gt;&gt;= <var>y</var></code></td>
    	<td><code><var>x</var> = <var>x</var> &gt;&gt; <var>y</var></code></td>
    </tr>
    <tr>
        <td><code><var>x</var> &gt;&gt;&gt;= <var>y</var></code></td>
    	<td><code><var>x</var> = <var>x</var> &gt;&gt;&gt; <var>y</var></code></td>
    </tr>
    <tr>
        <td><code><var>x</var> &amp;= <var>y</var></code></td>
    	<td><code><var>x</var> = <var>x</var> &amp; <var>y</var></code></td>
    </tr>
    <tr>
        <td><code><var>x</var> ^= <var>y</var></code></td>
    	<td><code><var>x</var> = <var>x</var> ^ <var>y</var></code></td>
    </tr>
    <tr>
        <td><code><var>x</var> |= <var>y</var></code></td>
    	<td><code><var>x</var> = <var>x</var> | <var>y</var></code></td>
    </tr>
</table>



---

#Computer_Science

