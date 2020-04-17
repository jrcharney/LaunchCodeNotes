## Angular Guide

[toc]

---

> **Note**: This guide is just a quick reference of the simple tasks. A more thorough gude is in the Angular Reference

## Create a new project

```bash
ng new ${angular-project-name}		# create a new angular project
# You will be asked two questions:
# * When asked if you want to do routing, press N for N.
# * When asked what stylesheet language you would like to use, pick CSS.
cd ${angular-project-name}
# At this point, use the Git_Gud_Quick.md guide to create a new repo for this project. These next two lines are optional but useful to remember
git remote add origin https://github.com/${user}/${angular-project-name}.git
git push -u origin master
# Now we want to go to the src/app directory where most of the work is done
cd src/app
```

## Generate a new...

> **NOTE**: There's a good chance what you are being told to make will be in the `src/app` directory or a child directory of it.

### Component

> **NOTE**: More than likely, if you make a component, you need to be in the class or component where you want to create the component. It's what distinguishes `component` from `class`.

```bash
$ pwd
project-name/src/app
$ ng generate component ${component-name} # component-name is lowercase and words are separated by spaces, but the class will likely be ComponentName in title case.
CREATE src/app/component-name/component-name.component.html (25 bytes)
CREATE src/app/component-name/component-name.component.spec.ts (650 bytes)
CREATE src/app/component-name/component-name.component.ts (284 bytes)
CREATE src/app/component-name/component-name.component.css (0 bytes)
UPDATE src/app/app.module.ts (410 bytes)
```

> **Note**: If you need to remove a component, you need to go into `src/app/app.module.ts` to remove that compoent 

The new `${component-name}/${component-name}.ts` fill will likely look like this

```typescript
import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'app-component-name',
    templateUrl: './orbit-list.component.html',
    styleUrls: ['./orbit-list.component.css']
})
export class ComponentNameComponent implements OnInit {
    
    constructor() { }
    
    ngOnInit() {
    }
    
}
```

> > **TODO**: Rewrite this block later! Show how `app.component.ts` looks like by default and how classes made in compoent directories can modify components.
>
> **NOTE**: If any class files other than the `app.component.*` files are there, they might be imported into `${component-name}/${component-name}.ts`. You might see something like this at the top of the file.
>
> ```typescript
> import { Component } from '@angular/core';
> import { ClassName } from './class-name'
> ```
>
> > :bookmark: I'll have to get back to this later

### Class

> **Note:** Classes are automatically generated in `src/app`. Yould be in `${project-name}`, and this command should still create `${project-name}/src/app/${class-name}`

```bash
$ pwd
project-name
$ ng generate class ${ClassName}		# ClassName is title case, but files created will be lowercase
CREATE src/app/${classname}.spec.ts (166 bytes)
CREATE src/app/${classname}.ts (27 bytes)
```

The new `${classname}.ts` file should look like this

```typescript
export class ClassName {
    
}
```



## Launch the server!

Often, if you download a project, you will need to install dependencies first. The place to do this is in the project folder.  Some projects may be bundled together, so in order to clear the air, any time you are asked to do an `npm install` first to get those dependencies, you want to be in the folder that is the parent of `src`, because that is usually the project folder.

```bash
$ pwd
project-name/src/app		# Not here!
$ cd ..
$ pwd
project-name/src			# Not here!
$ cd ..
$ pwd
project-name				# Here!
$ npm install
```

That same folder should be where you should launch the Angular server.

```bash
$ pwd
project-name
$ ng serve
```

Go to `http://localhost:4200/`. This is where the website is running. The port number, `:4200`, is important, so don't forget it!

You can only run one project at a time, so before working on another project, be sure to stop the server. The command to do this is `CTRL+C`.

## Shortcuts

* `ng n ${project-name}` short for `ng new ${project-name}`
* `ng g ${object} ${object-name}` short for `ng generate ${object} ${object-name}`
* `ng s` short for `ng serve`