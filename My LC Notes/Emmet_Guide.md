# Emmet Guide

[toc]

---

## Introduction

**Emmet** is a plugin for many popular text editors which greatly improves HTML & CSS workflow.

## Documentation

### Cheat Sheet

>  :information_source: **NOTE**: `|` indicates where the icon would be after the command is triggered.

#### Syntax

##### Child (`>`)

##### Sibling (`+`)

##### Climb Up (`^`)

##### Grouping (`()`)

##### Multiplication (`*`)

##### Item numbering (`$`)

##### Id and Class Attributes (`#` and `.`)

##### Custom Attributes (`[]`)

##### Text (`{}`)

##### Implicit Tag Names

#### HTML

> :information_source: **NOTE**: See HTML Guide

> :information_source: **NOTE**: Deprecated tags from HTML 4 are NOT listed. 

> :information_source: **NOTE**: Inline elements will be colored <span style="color:green;">**green**</span> in their header topic.

> :reminder_ribbon: **TODO**: Consider moving the contents of this section to the HTML Guide

##### HTML Template (`!` or `html:5`)

##### <span style="color:green;">Anchor Text</span> (`a`)

Defines a hyperlink.

| Command | Produces            | Description |
| ------- | ------------------- | ----------- |
| `a`     | `<a href="|">|</a>` |             |
|         |                     |             |
|         |                     |             |



##### <span style="color:green;">Abbreviation</span> (`abbr`)

> :information_source: **NOTE**: There is an old tag called `acronym` that does what `abbr` does. Don't use that. Use `abbr`.

##### Address (`address`)

Defines the contact information for the author/owner of a document. Often this will be put into the `footer`.

##### Image Map Area (`area`)

Defines an area inside an image map (`map`) element that is clickable.

##### Article Section (`article`)

Defines an article. This is a *sematic* element much like `section`.

##### Page Aside Content (`aside`)

Defines content aise from the page content.

##### Audio Element (`audio`)

Defines audio content for sound media.

##### <span style="color:green;">Bold Text or Strong Text</span> (`b` or `strong`)

Defines **bold** text.

##### Base (`base`)

Sepecifies the base URL/target for all relative URLs in a document.

##### Bi-Directional Isolation and Override (`bdi` and `bdo`)

Bi-Directional Isolation (`bdi`) isolates a part of text that might be formatted in a different direction from other text outside it. Basically, this is used for inputing text written in languages like Arabic or Hebrew.

Bi-Directional Override (`bdo`) overrides the current text direction.

##### Blockquote (`blockquote`)

Define a section that is quoted from another source.

In Markdown, a blockquote is created using the `>` element.

It's more effective to use this as an inline aside than the `aside` element.

##### Body (`body`)

> :information_source: **NOTE**: Emmet will automatically load this element as part of the HTML Template. See HTML Template for details.

The body of an HTML document. This is the part of the page you see on the web browser.

There can ONLY BE ONE `body` element.  It is the second element in the `html` element following the `head`.

##### Line Break (`br`)

Insert a line break. This is equivalent to using a `\n` in some other programming languages.

##### Button (`button`)

The button tag is often a shorter way if creating a clickable button than using `<input type="button">`. It should still have the same functionality.

##### Canvas (`canvas`)

> :reminder_ribbon: **TODO**: Create a Canvas Guide

Canvas elements are used to draw graphics, on the fly, using JavaScript.

##### Caption (`caption`)

Defines a table caption. It is optional but if you use it, it should be the first item used inside a table element even though it will appear at the bottom of the table, much like `figcaption`.

##### <span style="color:green;">Citation Text</span> (`cite`)

Defines the title of a work.

##### <span style="color:green;">Code Text</span> (`code`)

`code` is generally monospace font indicating computer code.

##### Column (`col`)

Column elements are used to define styles across columns of rows.  This is optional, but if you do use it, it's probably a good idea to stick them all in a `colgroup`.

##### Column Group (`colgroup`)

The `colgroup` tag contains other `col` elements. If used in a table, it should be used after the `caption` element (if it is used) and before the `thead` group containing the table rows (`tr` elements) that have the table header cells (`th` elements) in them. 

##### Data (`data`)

This element links the given content with a machine-readable translation.

I don't have much experience with this element.

##### Data List (`datalist`)

Specifies a list of pre-defined options for input controls.

When ever you start typing something into a search engine, this is the element that shows up with those automated search listings.

##### <span style="color:green;">Deleted Text and inserted Text</span> (`del` and `ins`)

Deleted text is generally struck through, and inserted text is generally italicized. These two tags are often used to track changes made to documents before removing them, or to indicate a correction.

##### <span style="color:green;">Defintion Text</span> (`dfn`)

Represents the defining instance of a term.

##### Dialog Box (`dialog`)

Defines a dialog box or window. This is also called a modal.

##### Division Section (`div`)

Defines a section in a document.

##### Defintion List (`dl`)

A defintion list (`dl`) is a list of defintion terms (`dt`) and defintion descriptions (`dd`). Think of them as a list of vocabulary defitions in a dictionary.

> :reminder_ribbon: **TODO**: Provide examples.

##### Defintion Term and Defintion Description (`dt` and `dd`)

Much like `ol` and `ul` have `li` to list items, `dl` had `dt` and `dd`.

The defintion term (`dt`) can only be used once per item, but the definition description (`dd`) can be used more than once because some terms have more than one description.

##### Embedded Object (`embed`)

Defines a container for an external (non-HTML) application.

##### Field Group and Legend (`fieldset` and `legend`)

A `fieldset` defines a group of related elements in a `form`. A fieldset contals a `legend` element used as the caption of the fieldset much like the `label` element is used on form input objects.

##### Figure Caption (`figcaption`)

A `figcaption` defines the caption for a `figure` element.

##### Figure (`figure`)

Speficies self-contained content. Mostly images or media elements.

##### Page Footer Section (`footer`)

The `footer` is a *sematic* element that defines the foot of a document. This element generally follows the `main` element.

##### Form (`form`)

Defines an HTML form for user input.

##### Headers (`h1` through `h6`)

Defines HTML headings.

##### Head (`head`)

> :information_source: **NOTE**: Emmet will automatically load this element as part of the HTML Template. See HTML Template for details.

`head` is the part of the HTML document that is not visible. It is the first element in an `html` element and precedes the `body` element. 

There can ONLY BE ONE `head` element in an HTML document. CSS styling has no effect on this element.

##### Page Header Section (`header`)

The `header` element is a *sematic* element. It defines the header of a page but NOT the `head`.

##### Header Group (`hgroup`)

is an element to contain multiple header elements.

##### Horizontal Rule (`hr`)

Horizontal rule defines a line that divides major sections of a document.

Using CSS, horizontal rules can be manipulated into being vertical rules.

##### HTML Root (`html`)

>  For the Emmit command, see HTML Template.

`html` is the root element of an HTML document. It should start on the second line such that the first line is used for the `!DOCTYPE` element.

It has two children: `head` and `body`.

`html` is subject to some CSS maipulation for some reason.

##### <span style="color:green;">Italic Text and Emphasis Text</span> (`i` and `em`)

Defines *Italic* text

##### Inline Frame (`iframe`)

Defines an inline frame. 

>  :information_source: **NOTE**: Inline frames replace `frame` and `frameset`, but they are also subject to [Cross-Origin Resource Sharing](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) (CORS).

##### Image (`img`)

Define an image.

##### Input (`input`)

> :information_source: **NOTE**: Greater detail will be provided for this element later

Define an input control.

##### Keyboard Input (`kbd`)

Defines keyboard input. <kbd>Example</kbd>

##### Label (`label`)

Defines a label for an `input` element. It should also work with `select` and `textarea`.

##### List item (`li`)

An item in a `ol` or `ul` list.

##### Link (`link`)

Defines the relationship between a document and an external resource. Most of the time, it is used to link to stylesheets.

##### Page Main Section (`main`)

Specifies the main content of a document. This is a *semantic* element.

##### Image Map (`map`)

Defines a client-side image-map. `map` elements contain `area` elements.

##### Marked/Highlighted Text (`mark`)

Defines marked/highligted elements. Image having a `span` element where the style was set to change the background color and if necessary the foreground color.

##### Meta Tags (`meta`)

Defines meta data about a HTML document. These goe in the `head`.

Generally, at least one is important. `<meta charset="utf-8">`

> :reminder_ribbon: **TODO**: Add more examples!

##### Gauge/Meter (`meter`)

Defines a scalar measurement with a known range.

##### Page Navigation Section (`nav`)

Define the navigation links section. Generally, this is between the `header` and `main` elements.

##### No-Script Alternative (`noscript`)

Defines alternate content for web brrowsers that do not have client-side scripts enabled. Useful if someone has extensions like ScriptSafe or some ad-blocker enabled.

##### Embedded Object (`object`)

Defines an embedded object.

##### Ordered List (`ol`)

Define an ordered (numbered) list.

##### Option Group (`optgroup`)

Defines an group of `option` elements.

##### Option (`option`)

Defines an option in a `select` element.

##### <span style="color:green;">Result Output</span> (`output`)

Despite how it seems, the `output` tag is not a block element. It is an inline element. It indicate how content is output.

##### Paragraph (`p`)

Define a paragraph

##### Object Parameter (`param`)

Defines a parameter for an `object`.

##### Multiple Image Resource Container (`picture`)

Defines a container for multiple image resources.

##### Preformatted Text/Code Block (`pre`)

Defines preformatted text. This is generally used for code blocks.  `pre` blocks, by default are not formatted by their programming language. Often an outside library is used to format that stuff.

##### Progress Bar (`progress`)

Represents the progress of a task.

##### <span style="color:green;">Quotation Text</span> (`q`)

Defines a short quotation.

##### Ruby Annotation (`ruby`, `rt`, and `rp`)

> :information_source: **NOTE**: This is not related to the Ruby Programming Language. Rather Ruby Annotation is for East Asian typography.

* `ruby` defines a Ruby annotation.
* `rt` defines an explaination/pronouciation of characters.
* `rp` defines what to show in browsers that do not support Ruby annotation.

##### <span style="color:green;">Strike-through Text</span> (`s`)

Defines ~~strike-through~~ text

##### <span style="color:green;">Sample Output</span> (`samp`)

Defines sample output from a computer program. This might be different from `output`.

##### Client-Side Script (`script`)

Defines a client-side script, either internally or externally.

##### Section (`section`)

Defines a section in a document. This is a *semantic* element that works just like `div`.

##### Selection List (`select`)

Defines a selection list that looks like a drop-down list if the `multiple` attribute is not used.

Selection liste contain `option` elements or `optgroup` elements which are groups of `option` elements.

##### Media Source (`source`)

Defines multiple media sources for media elements (`audio` and `video`)

##### <span style="color:green;">Spanned Text</span> (`span`)

Define spanned text, often used to style text inline in such a way that the other inline elements can't.

##### Style Information (`style`)

Defines the style information for a document. This goes in the `head` and contails CSS information.

##### <span style="color:green;">Subscript Text and Superscript Text</span> (`sub` and `sup`)

`sub` and `sup` are used to provide subscript and superscript text, respectively.

(`H<sub>2</sub>O` produces H<sub>2</sub>O while `E=mc<sup>2</sup>` produces E=mc<sup>2</sup>)

##### Foldable Summary and Details (`summary` and `details`)

The `details` defines additional details that the user can view or hide.  The details are represented by the `summary` element.

##### Scalable Vector Graphics (`svg`)

> :reminder_ribbon: **TODO**: We will need to go into details with this section. Also, why isn't this part of the Emmet Cheat sheet?

Defines a container for Scalable Vector Graphics (SVG).

##### Table (`table`)

Defines a table.

> :reminder_ribbon: **TODO**: Finish this example.

```html
<table>
    <caption></caption><!-- Defined first. Shows up last -->
    <colgroup>
        <col><!-- skip the first row -->
        <col span="2" style="avengers">
        <col span="2" style="xmen">
    </colgroup>
    <thead>
    	<tr>
            <th></th>
            <th>Name</th>
            <th>Powers</th>
            <th>Name</th>
            <th>Powers</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <th>1</th><!-- I just added these to demonstrate th can be used in rows -->
            <td>Iron Man</td>
            <td>Built his first suit in a cave...with a bunch of scraps.</td>
            <td>Wolverine</td>
            <td>Healing factor, survival skills. Augmented with Adamantium skeleton.</td>
        </tr>
        <tr>
            <th>2</th>
            <td>Captain America</td>
            <td>
                <!-- You can use lists in tables! -->
                <ul>
                    <li>Defeated Red Skull.</li>
                    <li>Vibranium super shield.</li>
                    <li>Punched a lot of Nazis.</li>
                    <li>May have punched Hitler.</li>
                </ul>
            </td>
            <td>Cyclops</td>
            <td>Eye lasers! (PEW!) Being right about something.</td>
        </tr>
        <tr>
            <th>3</th>
            <td>Black Panther</td>
            <td>King of Wakanda. Mystic suit made of Vibranium.</td>
            <td>Storm</td>
            <td>Rocking fashion sense. Can manipulate the weather.</td>
        </tr>
        <tr>
            <th>4</th>
            <td>The Hulk</td>
            <td>"No one stronger than the Hulk!"</td>
            <td>The Juggernaut</td>
            <td>"I'm the juggernaut, [censored]!"</td>
        </tr>
    </tbody>
    <tfoot>
        <tr>
            <th>Summary</th>
            <td span="2">Never Forget, Tony Stark!</td><!-- Demonstrating row spanning -->
            <td span="2">Good guys, bad guys, and explosions. (As far as the eye can see!)</td>
        </tr>
    </tfoot>
</table>
```

##### Table Row Groups (`tbody`, `tfoot`, `thead`)

Table row groups are used to group `tr` objects too.

* `thead` cointains the rows that generally have the `th` elements representing the header of the table.
* `tbody` contains the rows that generally have majority of the `td` elements.
* `tfoot` cointains the `td` elements that represent the summary of the rows in the body.

##### Table Data/Table Cell (`td`)

`td` elements are you regular table cells. These are put inside `tr` elements.

##### Template (`template`)

> :reminder_ribbon: **TODO**: Find out more about this tag

##### Text Area (`textarea`)

Defines a multiline input control. Think of it as a `<input type="text">` but for more than one line.

##### Table Header Cell (`th`)

`th` elements are different from `td` elements in that they represent the head of a column.  What some people might not know is that they can also be used to represent the first cell in a row if you are create a table to mimic a spreadsheet, which can be good if you want to represent a grid.

`th` cells are usually styled with their text aligned center and with a bold font weight.

##### Timestamp (`time`)

Defines a date and time.

##### Document Title (`title`)

> :information_source: **NOTE**: Emmet will automatically load this element as part of the HTML Template. See HTML Template for details.

Defines the document title. This element goes into the `head`. You should always use this element!

##### Table Row (`tr`)

A `tr` is a collection of `th` and `td` elements that defines a row of a table.  `tr` elements go inside `table` elements, but they can be grouped in to one of the three table row groups (`thead`, `tbody`, or `tfoot`).

##### Text Track (`track`)

Defines the text tracks for media elements (`audio` and `video`). Generally this is used to adde the closed captioning or translation.

##### <span style="color:green;">Underline Text</span> (`u`)

<u>Underline text</u>.

##### Unordered List (`ul`)

Defines an unordered (bulleted) list.

##### <span style="color:green;">Code Variable</span> (`var`)

Defines a variable, often used in code. You can use these in the `code` element. Often, this style is italicized.

##### Video Element (`video`)

Define a video.

##### Weak Break? (`wbr`)

Defines a possible line-break.

##### Comment (`<!--...-->`)

> :information_source: **NOTE**: There is no Emmet command for this as far as I know.

Defines a comment.

##### DOCTYPE (`!DOCTYPE`)

> See HTML Template for the Emmet Command that inserts this line with the other important elements.

Defines the document type.  `<!DOCTYPE html>` is ALWAYS the first line in an HTML document!

#### CSS

> :information_source: **NOTE**: See CSS Guide

> :reminder_ribbon: **TODO**: Put print-only CSS in its own section​ 
>
> :reminder_ribbon: **TODO**: We should move all this CSS stuff to the CSS Guide

##### Properties

###### @

> :reminder_ribbon: **TODO**: Should I move `@font-feature-values` to closer to `font-feature-settings`?

> :information_source: **NOTE**: `@keyframes` is listed in "A is for Animation"

| Property               | Description                                                  | Values |
| ---------------------- | ------------------------------------------------------------ | ------ |
| `@charset`             | Specifies the character encoding used in the style sheet     |        |
| `@font-face`           | A rule that allows websites to download and use fonts other than the "web-safe" fonts. Basically this is used to import fonts.<br /> :reminder_ribbon: **TODO**: List some websites to get fonts from. |        |
| `@font-feature-values` | Allows authors to use a common name in `font-variant-alternate` for feature activated differently in OpenType. |        |
| `@import`              | Allows you to import a style sheet from another style sheet. |        |
| `@media`               | Sets the style rules for different media types/devices/sizes.<br />:reminder_ribbon: **TODO**: Eventually talk about Responsive Web Design (RWD). |        |

###### A-B

> :information_source: **NOTE**: `align` properties are in "F is for Flex". For horizontal text alignment, see `text-align`. For vertical text alignment, see `vertical-align`. `animation` properties are in "A is for Animation" to which you may also want to look at "T is for Transition".

| Property                         | Description                                                  | Values |
| -------------------------------- | ------------------------------------------------------------ | ------ |
| `all`                            | Resets all properties (except `unicode-bidi` and `direction`) |        |
| `backface-visibility`            | Defines whether or not the back face of an element should be visible when facing the user. In other words, how does this element look like when flipped over on its backside, like a card. |        |
| `bottom`                         | Sets the element position, from the bottom of its parent element. |        |
| `box-decoration-break` :printer: | Sets the behavior of the background and border of an element at page-break, or (for inline elements) at line break. |        |
| `box-shadow`                     | Attach one or more shadows to an element.<br />See also `text-shadow`. |        |
| `box-sizing`                     | Defines how how the width and height of an element should be calculated: Should they include padding and borders, or not. |        |
| `break-after` :printer:          | Specifies whether or not a page-, column-, or region-break should occur after the specified element. |        |
| `break-before` :printer:         | Specifies whether or not a page-, column-, or region-break should occur before the specified element. |        |
| `break-inside` :printer:         | Specifies whether or not a page-, column-, or region-break should occur inside the specified element. |        |

###### A is for Animation

> :information_source: **NOTE**: For transitions, see "T is for Transition".

| Property                    | Description                                                  | Values |
| --------------------------- | ------------------------------------------------------------ | ------ |
| `@keyframes`                | Specifies the animation code.                                |        |
| `animation`                 | Shorthand property for all the *`animation-\*`* properties   |        |
| `animation-delay`           | Specifies a delay for the start of an animation              |        |
| `animation-direction`       | Specifies the direction of which an animation should be played. |        |
| `animation-duration`        | Specifies how long an animation should take to complete one cycle. |        |
| `animation-fill-mode`       | Specifies a style for the element when the animation is not playing. |        |
| `animation-iteration-count` | Specifies the number of times an animation should be played. |        |
| `animation-name`            | Specifies a name for the `@keyframes` animation.             |        |
| `animation-play-state`      | Specifies whether the animation is running or paused.        |        |
| `animation-timing-function` | Specifies the speed curve of the animation.                  |        |



###### B is for Background

| Property                | Description                                                  | Values |
| ----------------------- | ------------------------------------------------------------ | ------ |
| `background`            | A shorthand property for all the *`background-\*`* properties |        |
| `background-attachment` | Sets whether a background images scrolls with the rest of the page or is fixed.<br />This can create a neat effect in some cases. |        |
| `background-blend-mode` | Specifies the blending mode of each background layer (color or image) |        |
| `background-clip`       | Defines how far the background (color or image) should extend within an element |        |
| `background-color`      | Specifies the background color of an element.                |        |
| `background-image`      | Specifies one or more background images for an element.<br />Gradients are set with this property. |        |
| `background-origin`     | Specifies the origin position of a background image.         |        |
| `background-position`   | Specifies the position of a background image.                |        |
| `background-repeat`     | Specifies if/how a background image will be repeated.        |        |
| `background-size`       | Specifies the size of the background images.                 |        |



###### B is for Border

> :reminder_ribbon: **TODO**: I may have to consider splitting this table into smaller groups.

> :information_source: **NOTE**: `border-image` and `border-image-*` properties in "B is for Border Image"

> :information_source: **NOTE**: `border-radius` and `border-*-*-radius` properties are in "B is for Border Radius"

| Property              | Description                                                  | Values |
| --------------------- | ------------------------------------------------------------ | ------ |
| `border`              | A shorthand property for *`border-width border-style border-color`* for all four sides of an element. |        |
| `border-bottom`       | A shorthand property for *`border-bottom-width border-bottom-style border-bottom-color`*. Applies to the bottom border. |        |
| `border-bottom-color` | Sets the color for the bottom border.<br />See `border-color` for values. |        |
| `border-bottom-style` | Sets the the style of the bottom border.<br />See `border-style` for values. |        |
| `border-bottom-width` | Set the width of the bottom border.<br />See `border-width` for values. |        |
| `border-collapse`     | Specifies whther table border should collapse into a single border or be separated. :reminder_ribbon: |        |
| `border-color`        | Sets the color of the four borders.                          |        |
| `border-left`         | A shorthand property for *`border-left-width border-left-style border-left-color`*. Applies to the left border. |        |
| `border-left-color`   | Sets the color for the left border.<br />See `border-color` for values. |        |
| `border-left-style`   | Sets the the style of the left border.<br />See `border-style` for values. |        |
| `border-left-width`   | Set the width of the left border.<br />See `border-width` for values. |        |
| `border-right`        | A shorthand property for *`border-right-width border-right-style border-right-color`*. Applies to the right border. |        |
| `border-right-color`  | Sets the color for the right border.<br />See `border-color` for values. |        |
| `border-right-style`  | Sets the the style of the right border.<br />See `border-style` for values. |        |
| `border-right-width`  | Set the width of the right border.<br />See `border-width` for values. |        |
| `border-spacing`      | Sets the distance between the borders of adjacent cells.     |        |
| `border-style`        | Sets the style of the four borders.                          |        |
| `border-top`          | A shorthand property for *`border-top-width border-top-style border-top-color`*. Applies to the top border. |        |
| `border-top-color`    | Sets the color for the top border.<br />See `border-color` for values. |        |
| `border-top-style`    | Sets the the style of the top border.<br />See `border-style` for values. |        |
| `border-top-width`    | Set the width of the top border.<br />See `border-width` for values. |        |
| `border-width`        | Sets the width of the four borders.                          |        |

###### B is for Border Image

| Property              | Description                                                  | Values |
| --------------------- | ------------------------------------------------------------ | ------ |
| `border-image`        | A shorthand property for all the *`border-image\*`* properties. |        |
| `border-image-outset` | Specifies the amount by which the border image area extends beyond the border box. |        |
| `border-image-repeat` | Specifies whether the border image should be repeated, rounded, or stretched. |        |
| `border-image-slice`  | Specifies how to slice the border image.                     |        |
| `border-image-source` | Specifies the path to the image to be used as a border.      |        |
| `border-image-width`  | Specifies the width of the border image.                     |        |


###### B is for Border Radius

> :information_source: **NOTE**: `border-radius` properties can be set with two values instead of one. This can make corners more elliptical than circular.

| Property                     | Description                                                  | Values |
| ---------------------------- | ------------------------------------------------------------ | ------ |
| `border-radius`              | A shorthand property for the four *`border-\*-\*-radius`* properties. |        |
| `border-bottom-left-radius`  | Define the radius of the border of the bottom-left corner.   |        |
| `border-bottom-right-radius` | Define the radius of the border of the bottom-right corner.  |        |
| `border-top-left-radius`     | Define the radius of the border of the top-left corner.      |        |
| `border-top-right-radius`    | Define the radius of the border of the top-right corner.     |        |



###### C

> :information_source: **NOTE**: `column-*` properties as well as `columns` are in "C is for Column".

| Property            | Description                                                  | Values |
| ------------------- | ------------------------------------------------------------ | ------ |
| `caption-side`      | Specifies the placement of a table caption (`<caption>`)     |        |
| `caret-color`       | Specifies the color of the cursor (caret) in inputs, textareas, or any element that is editable. |        |
| `clear`             | Specifies on which side of an element floating elements are not allowed to float.<br />See also `float`<br />:information_source: **NOTE**: Generally, to reset the effects of `float`, an empty element that sets `clear` is used after an element that uses `float`. Using `:before` or `:after` doesn't seem to be as effective as using a blank `<div>` to reset the previous floating element. |        |
| `clip-path`         | Clips an absolutely positioned element.<br />It might be possible to do with with an SVG `<path>`.<br />:information_source: **NOTE**: There is an old property called `clip`, that is deprecated. You should be using `clip-path`! |        |
| `color`             | Sets the color of text                                       |        |
| `content`           | Used within the `:before` and `:after` pseudo-elements, to insert generated content. |        |
| `counter-increment` | Increases or decreases the value of one or more CSS counters. Might be useful in `<ol>` elements. |        |
| `counter-reset`     | Creates or resets one or more CSS counters.                  |        |
| `cursor`            | Specifies the mouse course to be displayed when pointing over an element<br />:information_source: **NOTE**: Animated gifs can not be used with this property. There is a way to emulate that ability though. :reminder_ribbon: |        |

> **All about `clip-path`**: 
>
> It might be possible to set a clipping or even a masking path using SVG.
> A good site that provides some great examples for using `clip-path` is [*Clippy - CSS `clip-path` maker*](https://bennettfeely.com/clippy/).

###### C is for Column

| Property            | Description                                                  | Values |
| ------------------- | ------------------------------------------------------------ | ------ |
| `column-count`      | Specifies the number of columns an element should be divided into |        |
| `column-fill`       | Specifies how to fill columns, balanced or not               |        |
| `column-gap`        | Specifies the gap between columns.                           |        |
| `column-rule`       | Shorthand property for all the *`column-rule-\*`* properties.<br />I think this syntax works like border rules.<br />:reminder_ribbon: **TODO** what is "rule"? |        |
| `column-rule-color` | Specifies the color of the rule between columns.             |        |
| `column-rule-style` | Specifies the style of the rule between columns.             |        |
| `column-rule-width` | Specifies the width of the rule between columns.             |        |
| `column-span`       | Specifies how many columns an element should span.           |        |
| `column-width`      | Specifies the column width.                                  |        |
| `columns`           | A shorthand property for `column-width` and `column-count`.  |        |

###### D-F

> :information_source: **NOTE**: `flex` properties are in "F is for Flex". `font` properties are in "F is for Font"

| Property      | Description                                                  | Values |
| ------------- | ------------------------------------------------------------ | ------ |
| `direction`   | Specifies the text/writing direction.<br />Generally used if you are using a language such as Arabic or Hebrew. |        |
| `display`     | Specifies how certain HTML elements should be displayed.<br />If you use `display:flex;`, do look at "F is for Flex". |        |
| `empty-cells` | Specifies whether or not to display borders and background on empty cells in a table. |        |
| `filter`      | Defines effects (e.g. blurring or color shifting) on an element before the element is displayed. |        |
| `float`       | Specifies whether or not a box should float. :balloon: <br />Setting floating elements can be complicated.<br />See also `clear` to reset the floating state after it is used. |        |

###### F is for Flex

> :reminder_ribbon: **TODO**: The Flexbox guide has flex properties in two groups. Should we add something to indicate what group they are in?

This section is specifically for **flexbox** (or "flex") elements. A flexbox is a flexible container.

CSS-Tricks has a pretty good [guide on how to use Flexbox](https://css-tricks.com/snippets/css/a-guide-to-flexbox/).

| Property          | Description                                                  | Values |
| ----------------- | ------------------------------------------------------------ | ------ |
| `align-content`   | Specifies the alignment between the lines inside a flexbox when the items do not use all available space. |        |
| `align-items`     | Specifies the alignment for items inside a flexbox.          |        |
| `align-self`      | Specifies the alignment for selected items inside a flexbox. |        |
| `flex`            | Shorthand property for the *`flex-grow`*, *`flex-shrink`*, and *`flex-basis`* properties. |        |
| `flex-basis`      | Specifies the initial length of a flexible item.             |        |
| `flex-direction`  | Specifies the direction of the flexible items.               |        |
| `flex-flow`       | Shorthand property for *`flex-direction`* and *`flex-wrap`* properties. |        |
| `flex-grow`       | Specifies how much the item will grow relative to the rest.  |        |
| `flex-shrink`     | Specifies how much the item will shrink relative to the rest. |        |
| `flex-wrap`       | Specifies whether the flexible items should wrap or not.     |        |
| `justify-content` | Specifies the alignment between the items inside a flexible container when the items do not use all available space. |        |
| `order`           | Sets the order of the flexible item, relative to the rest.   |        |

###### F is for Font

| Property                  | Description                                                  | Values |
| ------------------------- | ------------------------------------------------------------ | ------ |
| `font`                    | Shorthand property for `font-family`, `font-variant`, `font-weight`, `font-size`/`line-height`, and the `font-family` properties. |        |
| `font-family`             | Specifies the font family for text.                          |        |
| `font-feature-settings`   | See also `@font-feature-values`                              |        |
| `font-kerning`            | Controls the usage of the kerning information (how letters are spaced). |        |
| `font-language-override`  | Controls the usage of language-specific glyphs in a typeface. |        |
| `font-size`               | Specifies the size of text.                                  |        |
| `font-size-adjust`        | Preserves the readability of text when font fallback occurs. |        |
| `font-stretch`            | Selects a normal, condensed, or expanded face from a font family. |        |
| `font-style`              | Specifies the font style for text. Generally, if text is italic or not. |        |
| `font-synthesis`          | Controls which missing typefaces (bold or italic) may be synthesized by the browser. |        |
| `font-variant`            | Specifies whether or nor a text should be displayed in a small-caps font. |        |
| `font-variant-alternates` | Controls the usage of alternate glyphs associated to the alternate names defined in `@font-feature-values` |        |
| `font-variant-caps`       | Controls the usage of alternate glyphs for capital letters.  |        |
| `font-variant-east-asian` | Controls the usage of alternate glyphs for East Asian Scripts (e.g. Chinese, Japanese, Korean) |        |
| `font-variant-ligatures`  | Controls which ligatures and contextual forms are used in textual content of the elements it applies to. |        |
| `font-variant-numeric`    | Controls the usage of alternate glyphs for numbers, fractions, and ordinal markers. |        |
| `font-variant-position`   | Controls the usage of alternate glyphs for smaller size positioned as superscript or subscript regarding the baseline of the font. |        |
| `font-weight`             | Specifies the weight of a font. Generally this is used to make text bold. |        |

###### G is for Grid

**Grid** is more complex that flexboxes.

| Property                | Description                                                  | Values |
| ----------------------- | ------------------------------------------------------------ | ------ |
| `grid`                  | A shorthand property for the `grid-template-rows`, `grid-template-columns`, `grid-template-areas`, `grid-auto-rows`, `grid-auto-columns`, and the `grid-auto-flow` properties. :reminder_ribbon: |        |
| `grid-area`             | Either specifies a name of the grid item, or this property is a shorthand property for `grid-row-start`, `grid-column-start`, `grid-row-end`, and `grid-column-end` properties. :reminder_ribbon: |        |
| `grid-auto-columns`     | Specifies a default column size                              |        |
| `grid-auto-flow`        | Specifies how auto-placed items are inserted in the grid.    |        |
| `grid-auto-rows`        | Specifies a default row size                                 |        |
| `grid-column`           | Shorthand property for the `grid-column-start` and the `grid-column-end` properties. :reminder_ribbon: |        |
| `grid-column-end`       | Specifies where to end the grid item.                        |        |
| `grid-column-gap`       | Specifies the size of the gap between columns.               |        |
| `grid-column-start`     | Specifies where to start the grid item.                      |        |
| `grid-gap`              | A shorthand property for the `grid-row-gap` and `grid-column-gap` properties. :reminder_ribbon: |        |
| `grid-row`              | A shorthand property for the `grid-row-start` and `grid-row-end` properties. :reminder_ribbon: |        |
| `grid-row-end`          | Specifies where to end the grid item.                        |        |
| `grid-row-gap`          | Specifies the size of the gap between rows.                  |        |
| `grid-row-start`        | Specifies where to start the grid item.                      |        |
| `grid-template`         | A shorthand property for the `grid-template-rows`, `grid-template-columns`, and `grid-areas` properties |        |
| `grid-template-areas`   | Specifies how to display columns and rows, using named grid items |        |
| `grid-template-columns` | Specifies the size of the columns, and how many columns in a grid layout |        |
| `grid-template-rows`    | Specifies the size of the rows in a grid layout              |        |

###### H-I

> :information_source: **NOTE**: For `justify-content` see "F is for Flex"

| Property                     | Description                                                  | Values |
| ---------------------------- | ------------------------------------------------------------ | ------ |
| `hanging-punctuation`        | Specifies whether a punctuation character may be placed outside the line box. |        |
| `height`                     | Sets the height of an element                                |        |
| `hyphens`                    | Sets how to split words to improve the layout of paragraphs  |        |
| `image-rendering`? :printer: | Gives a hint to the browser about what aspects of an image are most important to preserve when the image is scaled |        |
| `isolation`                  | Defines whether an element must create a new stacking content |        |

###### L

| Property               | Description                                                  | Values |
| ---------------------- | ------------------------------------------------------------ | ------ |
| `left`                 | Specifies the left position of a positioned element          |        |
| `letter-spacing`       | Increase or decrease the space between characters in a text. |        |
| `line-break` :printer: | Specifies how/if to break lines                              |        |
| `line-height`          | Set the line height                                          |        |
| `list-style`           | Shorthand property for the *`line-style-\*`* properties      |        |
| `list-style-image`     | Specifies an image as the list-item marker                   |        |
| `list-style-position`  | Specifies the position of the list-item markers (bullet points) |        |
| `list-style-type`      | Specifies the type of list-item marker                       |        |

###### M

> :reminder_ribbon: **TODO**: Should there be a section to describe margins, borders, padding, and position properties?

| Property         | Description                                                  | Values |
| ---------------- | ------------------------------------------------------------ | ------ |
| `margin`         | A shorthand property for all the *`margin-\*`* properties<br />Sets all the margin properties in one declaration.<br />Margins are outside the border.<br />For space inside the border, see `padding`. |        |
| `margin-bottom`  | Sets the bottom margin of an element.                        |        |
| `margin-left`    | Sets the left margin of an element.                          |        |
| `margin-right`   | Sets the right margin of an element.                         |        |
| `margin-top`     | Sets the top margin of an element.                           |        |
| `max-height`     | Sets the maximum height of an element.                       |        |
| `max-width`      | Sets the maximum width of an element.                        |        |
| `min-height`     | Sets the minimum height of an element.                       |        |
| `min-width`      | Sets the minimum width of an element.                        |        |
| `mix-blend-mode` | Specifies how an element's content should blend with its direct parent background. :reminder_ribbon: |        |

###### O

> :information_source: **NOTE**: For `order` see "F is for Flex"

| Property          | Description                                                  | Values |
| ----------------- | ------------------------------------------------------------ | ------ |
| `object-fit`      | Specifies how the contents of a replaced element should be fitted to the box established by its used height and width. :reminder_ribbon: |        |
| `object-position` | Specifies the alignment of the replaced element inside its box. :reminder_ribbon: |        |
| `opacity`         | Sets the opacity level for an element.<br />You can also set the alpha channel on color properties. |        |
| `orphans`         | Sets the minimum number of lines that must be left at the bottom of a page when a page break occurs inside an element. :reminder_ribbon: |        |
| `outline`         | Shorthand property for `outline-width`, `outline-style`, and `outline-color` properties. :reminder_ribbon: |        |
| `outline-color`   | Sets the color of an outline                                 |        |
| `outline-offset`  | Offsets an outline, and draws it beyond the border edge.     |        |
| `outline-style`   | Sets the style of an outline                                 |        |
| `outline-width`   | Sets the width of an outline                                 |        |
| `overflow`        | Specifies what happens of content overflows an element's box.<br />For the overflow that applies to text, see `text-overflow`. |        |
| `overflow-wrap`   | Specifies whether or not the browser may break lines within word in order to prevent overflow (when a string is too long to fit its containing box) |        |
| `overflow-x`      | Specifies whether or not to clip the left/right edges of content, if it overflows the element's content area |        |
| `overflow-y`      | Specifies whether or not to clip the top/bottom edges of the content, if it overflows the element's content area. |        |

###### P

> :reminder_ribbon: **TODO**: Consider a "P is for Position" section which will contain `position`, `bottom`, `top`, `left`, and `right` and possibly `float` and `clear`.

| Property                      | Description                                                  | Values                                                       |
| ----------------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `padding`                     | A shorthand property for all the *`padding-\*`* properties.<br />Sets all the padding properties in one declaration.<br />Padding is inside the border.<br />For space outside the border, see `margin`. |                                                              |
| `padding-bottom`              | Sets the bottom padding of an element                        |                                                              |
| `padding-left`                | Sets the left padding of an element                          |                                                              |
| `padding-right`               | Sets the right padding of an element                         |                                                              |
| `padding-top`                 | Sets the top padding of an element                           |                                                              |
| `page-break-after` :printer:  | Sets the page-break behavior after an element                |                                                              |
| `page-break-before` :printer: | Sets the page-break behavior before an element               |                                                              |
| `page-break-inside` :printer: | Sets the page-break behavior inside an element               |                                                              |
| `perspective`                 | Gives a 3D-positioned element some perspective               |                                                              |
| `perspecitive-origin`         | Defined at which position the user is looking at the 3D-positioned element |                                                              |
| `pointer-events`              | Defines whether or not an element reacts to pointer events   |                                                              |
| `position`                    | Specifies the type of positioning method used for an element | * `static`<br />* `relative`<br />* `absolute`<br />* `fixed` |

###### Q-T

> :information_source: **NOTE**: `text`, `transform` and `transition` properties are in their own sections.

| Property          | Description                                                  | Values |
| ----------------- | ------------------------------------------------------------ | ------ |
| `quotes`          | Sets the type of quotation marks for embedded quotations     |        |
| `resize`          | Defines if (and how) and element is resizable by the user.   |        |
| `right`           | Specifies the right position of a positioned element.        |        |
| `scroll-behavior` | Specifies whether to smoothly animate the scroll position in a scrollable box, instead of a straight jump |        |
| `tab-size`        | Specifies the width of a tab character                       |        |
| `table-layout`    | Defines the algorithm used to layout table cells, rows, and columns |        |
| `top`             | Specifies the top position of a positioned element           |        |



###### T is for Text

| Property                  | Description                                                  | Values                                                   |
| ------------------------- | ------------------------------------------------------------ | -------------------------------------------------------- |
| `text-align`              | Specifies the horizontal alignment to text.                  | * `left`<br />* `center`<br />* `right`<br />* `justify` |
| `text-align-last`         | Describe how the last line of a block or a line right before a forced line break is aligned when `text-align` is `justify`. |                                                          |
| `text-combine-upright`    | Specifies the combination of multiple characters in the space of a single character. |                                                          |
| `text-decoration`         | Specifies the decoration added to text.<br />This is generally used for underline and strike-through. |                                                          |
| `text-decoration-color`   | Specifies the color of the `text-decoration`.                |                                                          |
| `text-decoration-line`    | Specifies the type of line in the `text-decoration`.         |                                                          |
| `text-decoration-style`   | Specifies the style of the line in the `text-decoration`.    |                                                          |
| `text-indent`             | Specifies the indentation of the first line in a text-block. |                                                          |
| `text-justify`            | Specifies the justification method used when `text-align` is `justify`. |                                                          |
| `text-orientation`        | Defines the orientation of the text in a line                |                                                          |
| `text-overflow`           | Specifies what should happen when text overflows the containing element. |                                                          |
| `text-shadow`             | Adds shadow to text.<br />See also `box-shadow`.             |                                                          |
| `text-transform`          | Controls the capitalization of text                          |                                                          |
| `text-underline-position` | Specifies the position of the underline which is set using the `text-decoration` property. |                                                          |

###### T is for Transform

| Property           | Description                                               | Values |
| ------------------ | --------------------------------------------------------- | ------ |
| `transform`        | Applies a 2D or 3D transformation to an element           |        |
| `transform-origin` | Allows you to change the position on transformed elements |        |
| `transform-style`  | Specifies how nested elements are rendered in 3D space    |        |

###### T is for Transition

> :information_source: **NOTE**: For animations, see "A is for Animation".

| Property                     | Description                                                  | Values |
| ---------------------------- | ------------------------------------------------------------ | ------ |
| `transition`                 | Shorthand property for all the *`transition-\*`* properties  |        |
| `transition-delay`           | Specifies when the transition effect will start              |        |
| `transition-duration`        | Specifies how many seconds or milliseconds a transition effect takes to complete. |        |
| `transition-property`        | Specifies the name of the CSS property the transition effect is for |        |
| `transition-timing-function` | Specifies the speed curve of the transition effect.          |        |

###### U-Z

| Property             | Description                                                  | Values     |
| -------------------- | ------------------------------------------------------------ | ---------- |
| `unicode-bidi`       | Used together with the `direction` property to set or return whether the text should be overridden to support multiple languages |            |
| `user-select`        | Specifies whether the text of an element can be selected     |            |
| `vertical-align`     | Sets the vertical alignment of an element                    |            |
| `visibility`         | Specifies whether or not an element is visible.              |            |
| `white-space`        | Specifies how white-space inside an element is handled.      |            |
| `windows`? :printer: | Sets the minimum number of lines that must be left at the top of the page when a page break occurs inside an element. |            |
| `width`              | Sets the width of an element                                 |            |
| `word-break`         | Specifies how words should break when reaching the end of a line. |            |
| `word-spacing`       | Increases or decreases the space between words in a text.    |            |
| `word-wrap`          | Allows long, unbreakable words to be broken and wrap to the next line. |            |
| `writing-mode`       | Specifies whether lines of text are laid out horizontally or vertically. |            |
| `z-index`            | Sets the stack order of a positioned element                 | *`number`* |

##### Aural Properties :wheelchair:

Aural stylesheet properties use a combination of speech synthesis (also known as Text-to-Speech or TTS) and sound effect to allow the user to listen to information instead of reading it.  These features were added in CSS 2.

Aural presentation can be used:

* By people with visual impairments.
* To help users learning to read.
* To help users who have difficulty reading (e.g. dyslexia)
* For home entertainment
* In the car, where users should never use their devices while driving.
* For home assistant devices (e.g. Amazon Alexa, Google Home)
* By print-impared communities.

The aural presentation converts the document to plain text and feeds it to a screen reader (a program that can read the characters on the screen).

Default values for properties are in bold in the third column.

> :reminder_ribbon: **TODO**: Find out what the default values are for these properties.

| Property            | Description                                                  | Values                                                       |
| ------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `azimuth`           | Sets where the sound should come from                        | *`angle`*|`left-side`|`far-left`|`left`|`center-left`| `center`|`center-right`|`right`|`far-right`|`right-side`|`behind`|`leftwards`|`rightwards` |
| `cue`               | Sets the `cue-*` properites in one declaration.              | *`cue-before cue-after`*                                     |
| `cue-after`         | Specify a sound to be played after speaking an element's content. | **`none`**|*`url`*                                           |
| `cue-before`        | Specify a sound to be played before speaking an element's content. | **`none`**|*`url`*                                           |
| `elevation`         | Sets where the sound should be coming from.                  | *`angle`*|`below`|`level`|`above`|`higher`|`lower`           |
| `pause`             | Sets the `pause-*` properties in one declaration             | *`pause-before pause-after`*                                 |
| `pause-after`       | Specifies a pause after speaking an element's content        | *`time`*|*`percent`*                                         |
| `pause-before`      | Specifies a pause before speaking an element's content       | *`time`*|*`percent`*                                         |
| `pitch`             | Specifies a speaking voice                                   | *`frequency`*|`x-low`|`low`|`medium`|`high`|`x-high`         |
| `pitch-range`       | Specifies the variation in the speaking voice (Monotone voice or animated voice?) | *`number`*                                                   |
| `play-during`       | Specifies a sound to be played while speaking an element's content. | `auto`|`none`|*`url`*|`mix`|`repeat`                         |
| `richness`          | Specifies the richness of the speaking voice. (Rich voice or thin voice?) | `number`                                                     |
| `speak`             | Speak whether content will render aurally                    | `normal`|`none`|`spell-out`                                  |
| `speak-header`      | Specifies how to handle table headers. Should the headers be spoken before every cell, or only before a cell with a different header than the previous cell? | `always`|`once`                                              |
| `speak-numeral`     | Specify how to speak numbers                                 | `digits`|`continuous`                                        |
| `speak-punctuation` | Specify how to speak punctuation characters                  | `none`|`code`                                                |
| `speech-rate`       | Specifies the speaking speed.                                | *`number`*|`x-slow`|`slow`|`medium`|`fast`|`x-fast`|`faster`|`slower` |
| `stress`            | Specifies the "stress" in the speaking voice                 | *`number`*                                                   |
| `voice-family`      | Specifies the voice family of the speaking                   | *`specific-voice`*|*`generic-voice`*<br />* *`generic-voice`* values: `male`|`female` |
| `volume`            | Specifies the volume of the speaking                         | *`number`*|*`percent`*|`silent`|`x-soft`|`soft`|`medium`|`loud`|`x-loud` |

> :reminder_ribbon: **TODO**: There was some article about TTS that I was fiddling around with recently. Find it.

##### Print-Only Properties :printer:

> :reminder_ribbon: **TODO**: Populate this section later

##### Selectors

###### Classes and ID

* The period (`.`) is a **class selector** and select items using the `class` attribute.
* The octothorpe (`#`) is an **id selector** and select items using the `id` attribute.

| Selector            | Example         | Example Description                                          |
| ------------------- | --------------- | ------------------------------------------------------------ |
| *`.class`*          | `.intro`        | Select all elements with `class="intro"`                     |
| *`.class1.class2`*  | `.name1.name2`  | Select all elements with both `name1` and `name2` set with the `class` attribute. Note there is no space between the classes. |
| *`.class1 .class2`* | `.name1 .name2` | Select all elements with `name2` that is a descendent of an element with `name1`. Note there *IS* a space between the classes. |
| *`#id`*             | `#firstname`    | Select the element with with `id="firstname"`                |

###### Elements

* The asterisk (`*`) selects all elements. Use it sparingly.
* The string selects an element matching that string.
* The period (`.`) selects elements that have a matching `class`. (This rule works with `#` for `id` as well.)
* The comma (`,`) defines separate matches to apply a rule to.
* The space (` `) defines matching one matching pattern inside of another.
* The greater-than (`>`) defines the matching the right pattern which is the child of the left pattern.
* The plus (`+`) defines the matching right pattern which is placed immediately after the left pattern.
* The tilde (`~`) selects ever right pattern that is preceded by the left pattern.

| Selector    | Example   | Example Description                                          |
| ----------- | --------- | ------------------------------------------------------------ |
| `*`         | `*`       | Select all elements                                          |
| *`element`* | `p`       | Select all `<p>` elements                                    |
| *`el1,el2`* | `div, p`  | Select all `<div>` elements and all `<p>` elements.          |
| *`el1 el2`* | `div p`   | Select all `<p>` elements inside `<div>` elements.           |
| *`el1>el2`* | `div > p` | Select all  `<p>` elements where the parent is a `<div>` element. |
| *`el1+el2`* | `div + p` | Select all `<p>` elements that are placed immediately after `<div>` elements. |
| *`el1~el2`* | `p ~ ul`  | Selects every `<ul>` element that is precided by a `<p>` element. |

###### Attributes

Bracket attributes (`[]`) are the long way, but most literal way to do stuff.

* `.name` is equivalent to `[class="name"]`
* `#name` is equivalent to `[id="name"]`

But you shouldn't use bracket attributes like this. Rather you should use them for attributes that don't have shorthand featues like the `class` and `id` atributes do. For instance, you may want to apply attributes to anchors that have `href` elements. So you will wnat to use something like `a[href]`. 

What if you wated to apply icons to links that were of a specific file type, or matched a certain web address? That's what Bracket attributes can do.

> :information_source: **NOTE**: You do not have to surround your *`value`* in the selector syntax with quotes, however, I would recommend doing so.

> :reminder_ribbon: **TODO**: What is the difference between `|=` and `^=`?

| Selector                | Example              | Example Description                                          |
| ----------------------- | -------------------- | ------------------------------------------------------------ |
| *`[attribute]`*         | `[target]`           | Select all elements with a `target` attribute.               |
| *`[attribute=value]`*   | `[target="_blank"]`  | Select all elements with a `target="_blank"`.                |
| *`[attribute~=value]`*  | `[title~="flower"]`  | Select all elements with a `title` attribute that contains the word `"flower"`. |
| *`[attribute|=value]`*  | `[lang|="en"]`       | Select all elements with a `lang` attribute value starting with `"en"`. |
| *`[attribute^=value]`*  | `a[href^="https"]`   | Select every `<a>` element whose `href` attribute value begins with `"https"` |
| *`[attribute$=value]`*  | `a[href$=".pdf"]`    | Select ever `<a>` element whose `href` attribute value ends with `".pdf"`. |
| *`[attribute\*=value]`* | `a[href*="twitter"]` | Select every `<a>` element whose `href` attribute value contains the substring `twitter`. |

###### Pseudo-Selectors

Pseudo-Selectors are by far the largest group of selectors. Most people are introduced to them by the various pseudo-selectors applied to the anchor tag to distigush between unvisted, visited, and active links. But this list has grown significantly.

Each pseudo-selector is preceded by a colon (`:`).

Some pseudo-selectors have two colons (`::`) for reasons I should probably look into.

| Selector                     | Example                                | Example Description                                          |
| ---------------------------- | -------------------------------------- | ------------------------------------------------------------ |
| `:active`                    | `a[href]:active`                       | Select all anchors (`<a>`) with the `href` attribute that are active. (An active page is a page that is open, though some browsers have been rather lazy with applying this feature.) |
| `::after`                    | `p::after`                             | Insert something after the content of each `<p>` element.    |
| `::before`                   | `p::before`                            | Insert something before the content of each `<p>` element.   |
| `:checked`                   | `input[type="checkbox"]:checked`       | Select every checkbox (`<input type="checkbox">`) that is checked. (This feature also works with `<input type="radio">`). (This psudo-selector should be applied to `<input>` elements that have the `checked` attribute.) |
| `:default`                   | `input:default`                        | Select the default `<input>` element. :reminder_ribbon:      |
| `:disabled`                  | `input:disabled`                       | Selects every disabled `<input>` element. (This pseudo-selector should also work for elements that use the `disabled` attribute.) |
| `:empty`                     | `p:empty`                              | Select every `<p>` element that has no children, including text nodes. |
| `:enabled`                   | `input:enabled`                        | Selects every enabled `<input>` element. (This pseudo-selector should alsow rok for element that do not use the `disabled` attribute. This may be equivalent to `:not(:disabled)`) |
| `:first-child`               | `p:first-child`                        | Select every `<p>` that is the first child of its parent. (This pseudo-selector is equivalent to `:nth-child(1)`) |
| `::first-letter`             | `p::first-letter`                      | Select the first letter of every `<p>` element.              |
| `::first-line`               | `p::first-line`                        | Select the first line of every `<p>` element.                |
| `:first-of-type`             | `p:first-of-type`                      | Select every`<p>` element that is the first `<p>` element of its parent. (This pseudo-selector is equivalent to `:nth-of-type(1)`) |
| `:focus`                     | `input:focus`                          | Select the input element which has focus. An element has *focus* when an input device (such as a mouse or keyboard cursor) is inside the element.<br />(An element that does not have focus is said to have *blur*, which is not one of the pseudo-selectors in CSS but could be simulated by using `:not(:focus)` but the better alternative would be to define the element WITHOUT the `:focus` making that the blurred defintion. Think of how we don't need to define `:not(:hover)` when we use a `:hover`) |
| `:hover`                     | `a[href]:hover`                        | Select anchors with the `href` attribute on mouse over.      |
| `:in-range`                  | `input:in-range`                       | Select elments with a value within a specific range. :reminder_ribbon: |
| `:indeterminante`            | `input[type="checkbox"]:indeterminate` | Select checkboxes that are in an indeterminate state. (I chose to use the checkbox example because it is possible to make a group of checkboxes select some values, but if not all of them are selected, the parent checkbox that represents all of them could have an indeterminate value.) |
| `:invalid`                   | `input:invalid`                        | Selects all `input` elements with an invalid value.          |
| `:lang(`*`language`*`)`      | `p:lang(en)`                           | Select every `<p>` element with a `lang` attribute euqal to `en` (English). |
| `:last-child`                | `p:last-child`                         | Select every `<p>` element that is the last child of its parent. (This pseudo-selector is equivalent to `:nth-last-child(1)`) |
| `:last-of-type`              | `p:last-of-type`                       | Select every `<p>` element that is the last `<p>` element of its parent. (This pseudo-selector is equivalent to `:nth-last-of-type(1)`) |
| `:link`                      | `a[href]:link`                         | Select any anchor element that has the `href` attribute that was not visted yet. |
| `:not(`*`selector`*`)`       | `:not(p)`                              | Select every element that is not a `<p>` element. (NOTE: the `:not` pseudo-selector has better examples that this.) :reminder_ribbon: |
| `:nth-child(`*`n`*`)`        | `p:nth-child(2)`                       | Select every `<p>` element that is the second child of its parent. |
| `:nth-last-child(`*`n`*`)`   | `p:nth-last-child(2)`                  | Select every `<p>` element that is second to last child of its parent, counting from the last child. |
| `:nth-last-of-type(`*`n`*`)` | `p:nth-last-of-type(2)`                | Select every `<p>` element that is the second to last `<p>` element of its parent, counting from the last child. |
| `:nth-of-type(`*`n`*`)`      | `p:nth-of-type(2)`                     | Select every `<p>` element that is the second `<p>` element of its parent. |
| `:only-child`                | `p:only-child`                         | Select every `<p>` element that is the only child of its parent. |
| `:only-of-type`              | `p:only-of-type`                       | Select every `<p>` element that is the only `<p>` element of its parent. |
| `:optional`                  | `input:optional`                       | Selects input elemenet with no `required` attribute. (This psuedo-selector is likel the opposite of `:required`) |
| `:out-of-range`              | `input:out-of-range`                   | Selects `input` elements with a value outside of a specified range. (This pseudo-selector is likely the opposite of `:in-range`) |
| `::placeholder`              | `input[type="text"]::placeholder`      | Select text input elements with the `placeholder` attribute. (This most likely is used in text input fields as well as `textarea` elements.) |
| `:read-only`                 | `input:read-only`                      | Selects `input` elements where the `readonly` attribute is specified. |
| `:read-write`                | `input:read-write`                     | Selects `input` elements where the `readonly` attribute is NOT specified. |
| `:required`                  | `input:required`                       | Selects `input` elements where the `required` attribute is specified. |
| `:root`                      | `:root {...}`                          | Selects the document's root element. (This pseudo-selector actually provides a place to define CSS variables.) |
| `::selection`                | `::selection`                          | Selects the portion of an element that is selected by a user. |
| `:target`                    | `#news:target`                         | Selects teh current active `#news` element (clicked on a URL containing that anchor name) |
| `:valid`                     | `input:valid`                          | Selects all input elements with a valid value                |
| `:visited`                   | `a[href]:visited`                      | Select all anchor elements where the `href` attribute was visited. |

##### Functions

> :reminder_ribbon: **TODO**: Add the parameters for each of these functions later.

CSS Functions are used as a value for various CSS properties.

As of CSS 3, we can also define variables and call those vairables.

###### Variables

To define variables in CSS, you generally want to set them in the `:root` pseudo-selector at the top of your CSS file.

```css
:root {
    --red: #f00;
}

.redtext {
    color: var(--red);
}
```

Variables used in calculations or other functions should be called using the `var()` function.

###### Calculating Functions

> :reminder_ribbon: **TODO**: Show what operators are supported by the `calc()` function.

| Function         | Description                                               |      |
| ---------------- | --------------------------------------------------------- | ---- |
| `attr()`         | Return the value of an attribute of the selected element  |      |
| `calc()`         | Perform calculations to determine CSS property values     |      |
| `cubic-bezier()` | Defines a cubic Bezier curve                              |      |
| `url()`          | Define a URL in which to find a file or data from.        |      |
| `var()`          | Call a variable to insert the value of a custom property. |      |

In the near future, new functions of this category will be able to perform various mathematical functions similar to how the `Math` object does in JavaScript.

CSS libraries (written in JavaScript) such as [Sass](https://sass-lang.com/) and [Less](http://lesscss.org/) can already do this, but they are not standard CSS.

###### Color Functions

| Function | Description                                                  |      |
| -------- | ------------------------------------------------------------ | ---- |
| `hsl()`  | Defines colors using the Hue-Saturation-Lightness model (HSL) |      |
| `hsla()` | Defines colors using the Hue-Saturation-Lightness-Alpha model (HSLA) |      |
| `rgb()`  | Defines colors using the Red-Green-Blue model (RGB)          |      |
| `rgba()` | Defines colors using the Red-Green-Blue-Alpha model (RGBA)   |      |

###### Gradient Functions

| Function                      | Description                                                  |      |
| ----------------------------- | ------------------------------------------------------------ | ---- |
| `linear-gradient()`           | Sets a linear gradient as the `background-image`.<br />Define at least two colors (`top` to `bottom`) |      |
| `radial-gradient()`           | Sets a radial gradient as the `background-image`.<br />Define at leas two colors (center to edges) |      |
| `repeating-linear-gradient()` | Repeats a linear gradient                                    |      |
| `repeating-radial-gradient()` | Repeats a radial gradient                                    |      |

> :information_source: **NOTE**: To avoid banding with linear gradients, set `html {height: 100%;}`. This usally fixes the bug that causes linear gradients.

##### Animatable

> :reminder_ribbon: **TODO**: In the CSS properties list, indicate which properties are animatable.

##### Units

CSS has severa different units for expressing length.

Many CSS properties take "length" values, such as `width`, `margin`, `padding`, `font-size`, etc.

Length is a number followed by a length unit, such as `10px`, `2em`, etc.

Whitespaces cannot appear between the number and the unit. However, if the value is `0`, the unit can be ommitted.

For some CSS properties, negative lengths are permitted.

There are two types of lenght units: absolute and relative.

###### Absolute Lengths

The absolute length units are fixed and a length expressed in any of these will appear as exactly that size.

Absolute length units are not recommended for use on the screen, because screen sizes may vary. However, they can be used if the output medium is know, such as for print layout.

| Unit | Description | Notes                |
| ---- | ----------- | -------------------- |
| `cm` | centimeters | 1cm = 0.01m          |
| `mm` | millimeters | 1mm = 0.1cm = 0.001m |
| `in` | inches      | 1in = 96px = 2.54cm  |
| `px` | pixels      | 1px = 1/96in         |
| `pt` | points      | 1pt = 1/72in         |
| `pc` | picas       | 1pc = 12pt = 1/6in   |

> :information_source: **NOTE**: Pixels (`px`) are relative to the viewing device. For low-<abbr title="dots per inch">dpi</abbr> devices, `1px` is one device pixel (dot) of the display. For printers and high resolution screens, `1px` implies multiple device pixels. :fuelpump: YMMV

###### Relative Lengths

Relative length units specify a length relative to another length property. Relative length units scale better between different rendering mediums.

Maybe I'm old hat or because I've never really owned a computer with a really big screen, but I don't use relative lengths as much as I should.  If you know how to use them, send me some feedback.

| Unit   | Description                                       | Notes                                             |
| ------ | ------------------------------------------------- | ------------------------------------------------- |
| `%`    | Relative to the parent element                    |                                                   |
| `em`   | Relative to the `font-size` of the element        | `2em` means 2 times the size of the current font. |
| `rem`  | Relative to the `font-size` of the root element.  |                                                   |
| `vw`   | Relative to 1% of the width of the viewport       |                                                   |
| `vh`   | Relative to 1% of the height of the viewport      |                                                   |
| `vmin` | Relative to 1% of viewport's smaller dimension    |                                                   |
| `vmax` | Relative to 1% of the viewport's larger dimension |                                                   |
| `ex`   | Relative to the `x-height` of the current font    | Rarely used                                       |
| `ch`   | Relative to `width` of the "0" (zero)             |                                                   |



> :bulb: **TIP**: The `em` and `rem` units are practical in creating perfectly scalable layout!
>
> For `vw`, `vh`, `vmin`, and `vmax`, when we speak of "viewport" we mean "the browser window size". If the view port is `50cm` wide, `1vw` = `0.5cm`.

##### Colors

##### Default Values

> :reminder_ribbon: **TODO** Add these to each of the properties

##### Browser Support

Probably the best place to check to see if something is compatible is to go to [CanIUse.com](http://caniuse.com/).

#### XSL

> :information_source: **NOTE**: **XSL** (**Extensible Stylesheet Language**) is a language used by **XML** (Extensible Markup Language) to apply stylesheet templates to XML. XML and XSL are beyond the scope of what LC101 entails, but since this is part of the Cheat Sheet documentation, I will be written here.

### Abbreviations

#### Syntax

#### Element Types

#### Implicit Tag Names

#### "Lorem Ipsum" Generator

### CSS Abbreviations

#### Vendor Prefixes

#### Gradients

#### Fuzzy Search

### Actions

#### Expand Abbreviation

#### Balance

#### Go to Matching Pair

#### Wrap with Abbreviation

#### Go to Edit Point

#### Select Item

#### Toggle Comment

#### Split/Join Tag

#### Remove Tag

#### Merge Lines

#### Update Image Size

#### Evaluate Math Expression

#### Increment/Decrement Number

#### Reflect CSS Value

#### Encode/Decode Image to data:URL

### Filters

#### Yandex BEM/OOCSS

### Customization

#### snippets.json

#### preferences.json

#### syntaxProfiles.json



---

## References

[^emmet]: [Emmet](https://emmet.io/)
[^em-doc]: [Emmet Documentation](https://docs.emmet.io/)
[^ em-cs ]: [Emmet Cheat Sheet](https://docs.emmet.io/cheat-sheet/)
[^ w3s-html-er]: [W3Schools HTML Element Reference](https://www.w3schools.com/tags/default.asp)
[^ w3s-css ]: [W3Schools CSS Tutorial](https://www.w3schools.com/css/default.asp)
[^ w3s-css-units]: [W3Schools CSS Units](https://www.w3schools.com/cssref/css_units.asp)
[^ w3s-css-sel ]: [W3Schools CSS Selectors](https://www.w3schools.com/cssref/css_selectors.asp)
[^ w3s-css-funcs ]: [W3Schools CSS functions](https://www.w3schools.com/cssref/css_functions.asp)
[^ ct-clip-path ]: CSS Tricks: [Almanac: `clip-path`](https://css-tricks.com/almanac/properties/c/clip-path/).

