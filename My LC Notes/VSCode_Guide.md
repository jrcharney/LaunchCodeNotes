# Visual Studio Code Guide

[toc]

---

## Introduction

This probably won't be a "guide" *per se*, but it will be a document that will cover some common tasks, especially when you upgrade VSCode.

## Administrative Stuff

### How To Install

I recommend installing through [Chocolatey](https://chocolatey.org/). (See [Chocolatey Guide](Chocolatey_Guide.md)).

> :reminder_ribbon: **TODO**: Instructions for Linux and Mac

```
choco install vscode
```

Pretty simple. You might get some prompts along the way. Read them and follow their instructions to install VSCode.

### How To Upgrade

Upgrades should be done in Adminstrator Mode in Windows.

I find using Chocolatey be be the least annoying way to do it, but you will need to do this in an Administrator Powershell on Windows or do this in a Terminal on Linux or Mac, and NOT the embedded terminal in VS Code.

```
choco upgrade vscode
```

If you do it the GUI way, you will need to open VS Code as an Administrator.

Some features (include themes) may be reset after an Administrative upgrade, especially if you had `[Unsupported]` in your title bar. The upgrade will reset things to use what Microsoft Considers supported. Fortunately, this Guide will cover what to do about that.

### Re-enable the "Unsupported" stuff

#### Re-enable that "unsupported" theme you had

You installed a rad theme in VSCode from Github, but it wasn't in the Extension Marketplace. 

If you are reading this, you may have installed it using be5invis's [Custom CSS and JS Loader](https://github.com/be5invis/vscode-custom-css), which [is available in the Extension Marketplace](https://marketplace.visualstudio.com/items?itemName=be5invis.vscode-custom-css). I use it because at the time of this writing, I am using [Synthwave x Fluoromachine](https://marketplace.visualstudio.com/items?itemName=webrender.synthwave-x-fluoromachine) (https://github.com/webrender/synthwave-x-fluoromachine) as my theme, but I'm not using the custom font with the ligatures that make the operators look like long bars or arrows. Though I might want to consider swtiching back to [Syntwave '84](https://marketplace.visualstudio.com/items?itemName=RobbOwen.synthwave-vscode) (https://github.com/robb0wen/synthwave-vscode) or to [Moonlight](https://marketplace.visualstudio.com/items?itemName=atomiks.moonlight) ([github](https://github.com/atomiks/moonlight-vscode-theme)) in the near future. I like dark themes with glowing text.

In case you are interested in making your own themes, Sergey Volkov [has a guide on dev.to](https://dev.to/js2me/make-your-own-custom-theme-for-vs-code-me7) on how to make your own themes using the Custom CSS and JS Loader extension.

You can find more VS Code themes at [VSCodeThemes.com](https://vscodethemes.com/).

At any rate, here are the instructions to get it working again.

1. Open VSCode as an Administrator. (You may need to right click, on the VS Code Icon, find a menu item that is "Visual Studio Code" (If it is on the taskbark) or "More" (if it is in the Start Menu), and select "Run as Administrator"). 
2. You'll get a security prompt. Click yes.
3. `CTRL+Shift+P`
4. Find and seelect "Reload Custom CSS and JS". You may get a message that you will 
5. If you get a message saying "Your Code installation appears to be corrupt Please reinstall." Ignore it.

> **NOTE**: If you are changing to another theme, you may want to make sure that your `vscode_custom_css.imports` has that custom CSS file (like `file:///C:/Users/<your_user_name>/.vscode/extensions/webrender.synthwave-x-fluoromachine-0.0.9/synthwave-x-fluoromachine.css` removed from `settings.json` first. ;-)

> :reminder_ribbon: **TODO**: Expand this in the future for other things.

### Extension Recommendations

> :reminder_ribbon: **TODO**: Write this later



---

#VSCode