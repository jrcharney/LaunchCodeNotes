# Node.js Reference

[toc]

---

> :construction: **UNDER CONSTRUCTION**: This page is a work in progress.

## Introduction

Node.js is a [insert description here]



> :reminder_ribbon: **TODO**: Datatypes will be added TypeScript style.



## Packages and Classes

```mermaid
classDiagram

class Console {
	+new Console(stdout[,stderr[,ignoreErrors]])
	+new Console(options)
	+console.assert(values[,...message])
	+console.clear()
	+count([label])
	+console.countReset([label])
	+console.debug(data[,...args])
	+console.dir(obj[,options])
	+console.dirxml(...data)
	+console.error([data[,...args]])
	+console.group([...label])
	+console.groupCollapsed()
	+console.groupEnd()
	+console.info([data[,...args]])
	+console.log([data[,...args]])
	+console.table(tabularData[,properties])
	+console.time([label])
	+console.timeEnd([label])
	+console.timeLog([label[,...data]])
	+console.trace([message[,...args]])
	+console.warn([data[,...args]])
	%% ()
	%% Inspector Only Methods()
	+console.profile([label])
	+console.profileEnd([label])
	+console.timeStamp([label])
}


class fs

class Dir {
	~fs
	dir.close()
}

class Dirent {
	~fs
}
```

---

## :reminder_ribbon: TODO

* [ ] Assertion Testing
* [ ] Async Hooks
* [ ] Buffer
* [ ] C++ Addons
* [ ] C/C++ Addons with N-API
* [ ] Child Processes
* [ ] Cluster
* [ ] Command Line Options
* [ ] Console
  * [x] Diagrammed
  * [ ] Documented
* [ ] Crypto
* [ ] Debugger
* [ ] Depricated APIs (probably should exclude this)
* [ ] DNS
* [ ] Domain
* [ ] ECMAScript Modules
* [ ] Errors
* [ ] Events
* [ ] File System
* [ ] HTTP
* [ ] HTTP/2
* [ ] HTTPS
* [ ] Inspector
* [ ] Internationalization
* [ ] Modules
* [ ] Net
* [ ] OS
* [ ] Path
* [ ] Performance Hooks
* [ ] Policies
* [ ] Process
* [ ] Punycode
* [ ] Query Strings
* [ ] Readline (VERY IMPORTANT!)
* [ ] REPL
* [ ] Report
* [ ] Stream
* [ ] String Decoder
* [ ] Timers
* [ ] TLS/SSL
* [ ] Trace Events
* [ ] TTY
* [ ] UDP/Datagram
* [ ] URL
* [ ] Utilities
* [ ] V8
* [ ] VM
* [ ] Worker Threads
* [ ] Zlib



---

## References

> :reminder_ribbon: **TODO**: Add references. Reference lines start with `[^ initials ]: `

[^ njs-api ]: Node.js Documentation. [v12.15.0](https://nodejs.org/dist/latest-v12.x/docs/api/)

---

#NodeJS #References