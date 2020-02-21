# Express.js

> :construction: **UNDER CONSTRUCTION**: This page is a work in progress.

[toc]

---

## Introduction

**Express** (or Express.js) descibes itself as a "Fast, unopinionated, minimalist web framework for Node.js".  For the most part, Express provides a concise library of functions (many of which appear to be part of Node.js) boiled down to a more frequent set of objects. 

### Why?

Even thouh Express is NOT part of LC101, Express is the "E" in "MEAN" (MongDB, Express, Angular, Node). Thus, a lot of applications use Express.

## Installation

```bash
npm install express --save
```

## API

> :reminder_ribbon: **TODO**: Make sure depricated items are not listed.

### `express()`

```mermaid
classDiagram
class Express {
	json([options])
	raw([options])
	Router Router([options])
	static(root, [options])
	text([options])
	urlencoded([options])
}
```



#### Methods

### `app` (Application)

```mermaid
classDiagram
class Application {
	locals
	mountpath
	%% Events
	mount
	%% actually, mount is that app.on('mount',callback(parent))
	all(path, callback[, callback ...])
	delete(path, callback[, callback ...])
	disable(name)
	Boolean disabled(name)
	enable(name)
	Boolean enabled(name)
	engine(ext, callback)
	get(name)
	get(path, callback[, callback ...])
	listen(path, [callback])
	listen([port[, host [,backlog]]][, callback])
	%% METHOD(path, callback[, callback ...])
	param([name], callback)
	path()
	post(path, callback[, callback ...])
	put(path, callback[, callback ...])
	render(view, [locals], callback)
	route(path)
	set(name,value)
	use([path,] callback [,callback...])
}
```



#### Properties

#### Events

> :reminder_ribbon: **TODO**: How does somone add an Event to a Class Diagram?

#### Methods

### `req` (Request)

```mermaid
classDiagram
class Request {
	app
	baseURL
	body
	cookies
	fresh
	hostname
	ip
	ips
	method
	originalURL
	params
	path
	protocol
	query
	route
	secure
	signedCookie
	stale
	subdomains
	xhr
	
	accepts(types)
	acceptsChasets(charset [,...])
	acceptsEncodings(encoding [,...])
	acceptsLanguage(lang [,...])
	get(field)
	is(type)
	range(size[, options])
}
```

#### Properties

#### Methods

### `res` (Response)

```mermaid
classDiagram
class Response {
	app
	headersSent
	locals
	append(field[, value])
	attachement([filename])
	cookie(name, value [, options])
	clearCookie(name [, options])
	download(path [,filename] [, options] [, fn])
	end([data] [,encoding])
	format(object)
	get(field)
	json([body])
	jsonp([body])
	links(links)
	location(path)
	redirect([status,] path)
	render(view [,locals] [, callback])
	send([body])
	sendFile(path [,options] [, fn])
	sendStatus(statusCode)
	set(field [,value])
	status(code)
	type(type)
	vary(field)
}
```

#### Properties

#### Methods

#### Deprecated Methods

* **`param`**`(name[, defaultValue])` - Use `req.params`, `req.body`, `req.query` instead.

### `router` (Router)

```mermaid
classDiagram
	class Router {
		all(path, [callback,...] callback)
		%% METHOD(path, [callback,...] callback)
		get(path, [callback,...] callback)
		put(path, [callback,...] callback)
		post(path, [callback,...] callback)
		%% what other METHODS are there? ()
		param(name, callback)
		route(path)
		use([path], [function, ...] function)
	}
```

#### Methods



---

## References

[ ^ express ]: ExpressJS.com(https://expressjs.com/).

[^ express-api ]: ExpressJS.com - [4.x API](https://expressjs.com/en/4x/api.html).

---

#Nodejs #Express