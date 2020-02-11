# PowerShell Guide

[toc]

---

> 🧩 This guide is meant for Microsoft Windows, preferably Windows 10 or newer.

> :construction: **Under Construction** - This page is a work in progress. It's not complete.



## Things to making PowerShell more useful

1. **Install [Chocolatey](https://chocolatey.org/) (in the Administrative PowerShell!)** Just about every Linux distribution has a package manager to download software. However, Windows is not a Linux distro. However, Windows does have a package manager for Free and Open Source Software (FOSS) for Windows. That's what Chocolatey is.  You can't install software in the regular shell, you need to do it as an administrator. We recommend using this to install FOSS instead of the Windows Store. Use that for proprietary software (especially if Microsoft makes it).
2. **Know the difference between regular and Administrative PowerShell.** Administrative PowerShell has features that regular PowerShell doesn't have. This is to keep regular users from doing Administrative things that they shouldn't do. Linux and Unix have similar features, but the administrator is sometimes called `root` since that's where their home directory is.
3. **Know how Wildcards work.** This will make things a little more productive if you need to manipulate more than one file to do something.



## Common Commands

Since PowerShell is designed to behave like an UNIX or Linux Shell, many of the basic commands from Unix and Linux can be used here.

* `echo "string to print"` - Print a string to standard output. Variables (which start with `$`) can be included.
* `ls [path/to/directory]` - show what is in the current directory. If you include a path, show what is in that directory.
* `mv old_file_name new_file_name` - Move or rename files. The `mv` (move) command has two purposes:
  1. It can move files from one directory to another.
  2. It can rename files (which basically is like moving, but you change the name of the file)
* `cp original_file copy_of_file` - Copy files provided the original name an a new name for the copy. It is possible to make a copy of a directory using the `cp` command. ( :reminder_ribbon: **TODO**: Explain. )
* `rm file_name`- Delete a file. Be very careful with this! You cannot use this to delete directories...at least not without adding some attribute to force it to do so.
* `mkdir new_directory` - Create a new directory.
* `rmdir old_directory` - Delete a directory. Generally, it won't let you do this unless the directory is empty.
* `touch new_file` - create an empty file



## Environment Variables

Environment variables are common variables used to identify.  Unlike in UNIX or Linux, variables in PowerShell do not appear to be case-sensitive.

* `$env:UserName` = `Jason` - returns your username
* `$env:UserProfile` = `C:\Users\Jason` - returns the path to your user directory. This is equivalent to the `$HOME` variable if you are familiar with UNIX or Linux.
  * `$HOME` happens to be another name for `$env:UserProfile`
* `$env:AppData` = `C:\Users\Jason\AppData\Roaming`
* `$env:OneDrive` = `C:\Users\Jason\OneDrive` - Path to your OneDrive directory where files are stored in the cloud (assuming you have Microsoft OneDrive)





---

#PowerShell #Guides