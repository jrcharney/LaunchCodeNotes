# Chocolatey Guide

[toc]

---

## Introduction

**Chocolatey** is a *software package manager* (SPM) for Windows.

Much like how LInux organizes their software downloads using an SPM, Chocolatey is designed to work in a similar manner for Windows. Generally, the software in Chocolatey's package repository (or repo) is Free and Open Source Software (FOSS), but there are a few exceptions.

This guide is meant to cover some of the more common commands.

When using Chocolatey, you want to be in Adminstrator Mode, so you will need to open an Adminstrator PowerShell.

## How to Install Chocolatey

Installing Chocolatey (or `choco` as I will often refer to it), is easy. 

1. If you have permission, open an Adminstrator Powershell. You may be prompted about some security thing, but you want to click "Yes".

2. Run `Get-ExecutionPolicy`. If it returns `Restricted`, we will need to change it. Run `Set-ExecutionPolicty AllSigned` (more secure) or `Set-ExecutionPolicy Bypass -Scope Process` (more flexible).

3. This next part you may want to copy and paste. Run this code

   ```powershell
   Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://chocolatey.org/install.ps1'))
   ```

4. Wait a few seconds for the command to complete.

5. If you don't see any errors, you are ready to use Chocolatey. Type `choco` or `choco -?` to verify that it is ready.

## Frequent Tasks

In this section, I will list the command you will more frequently use.

### Find a package in the Chocolatey repo

```
choco search <string>
```

Find a package that matches part of a query string.  This will print out a list of possible matches if it finds something or nothing if it doesn't.

### Learn more about a package

```
choco info <package_name>
```

It's generally a good idea to make sure you install the right package. `choco info` provides a short summary of what `<package_name>` is as well as where to find more information about that package.

### List all the packages you have Installed

```
choco list --local
```

With the `--local` argument, this will list all the pagages you have previously installed.  If you do not use the `--local` argument, this will likely list all the packages in Chocolatey's repo, which could take a few minutes.

> **NOTE**: `--local` is a shorter version of `--local-only`. In case someone at Chocolatey gets rid of it, it's probably good to know the longer command.

### Install a package

```
choco install <package_name>
```

Install a new package. You can actually install more than one package at a time. Just add more packages after `<package_name>`. If you do that, don't forget to add the `-y` argument, so that you are not prompted to install each package individually.  If you do forget it, you will be asked if you want to go through with it (Y for yes, N for no, A for Yes to all, or C to Cancel). Be mindful how you use the `-y` option.

### Check for upgrades

```
choco outdated
```

This command will test to see which of your software packages have an upgrade available. It might take about a minute or two.

> :reminder_ribbon: **PERSONAL TODO**: Given how this list is separated with pipes, why not run this through a text parser and space out the table, or better yet filter out the items that don't need an upgrade.

### Upgrade a specific package

```
choco upgrade <package_name>
```

Generally when people perform upgrades, they have their SPM tell them how many upgrades are availble that need upgrading, or the software they use sends them a message saying that there is an upgrade available.  The time it takes to do this varies. If you would rather just upgrade a specific package, just tell `choco` which package to upgrade.  Don't forget, you can use the `-y` option to avoid being prompted, and you can perform an upgrade on more than one package just like the `install` command.

### Upgrade everything Choco has installed if possible

> :warning: **WARNING!** Be very careful with this command! It could break stuff!

```
choco upgrade -y all
```

Here, don't include any package name but use `all`. I do recommend you use the `-y` command to expedite this process though. Because this is Windows, this will likely take a while and things might break stuff.

 ### Uninstall a software package

```
choco uninstall <package_name>
```

Sometimes things just don't work out the way they should, other times you just need to part with things you just don't use anymore. Whatever the reason, at some point, you may find yourself needing to uninstall a package. Chocolatey makes this easy.

Generally, when you uninstall something, the software that was part of that package is removed, but some files or preferences may still be on the computer.

You can uninstall more than one package, but I would recommend not using the `-y` to do it as you should be certain that you want to remove a piece of software, more so if that software is dependent on other software which could be uninstalled if you uninstall something.

## Commands

This section will be more thorough than the section above.

> :reminder_ribbon: **TODO**: Build this section

## See Also

* NPM - Node Package Manager
* pacman - Package Manager for Arch Linux

## References

[^ choco ]: [Chocolatey](https://chocolatey.org/)
[^choco-gh]: Github. [Chocolatey choco repo](https://github.com/chocolatey/choco).
[^ choco-ghw ]: Github. [Chocolatey choco wiki](https://github.com/chocolatey/choco/wiki).



---

#Chocolatey #Windows