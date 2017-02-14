# OneFuckingLib
You just need one fucking library.

- 还在Github苦苦寻找好用的lib？
- 每次新建项目感觉没有工具类，不想写代码？
- 每次新建项目都要复制粘贴各种第三方库？

去他🐱的第三方库，你**只需要一个库**！

## How to use
1. 复制代码到**项目**(不是app，是project)的`build.gradle`文件里
```
buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        **classpath 'com.jakewharton.hugo:hugo-plugin:1.2.1' //打印log的工具**
    }
}

allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```

2. 复制代码到app模块的`build.gradle`
```
apply plugin: 'com.jakewharton.hugo'//打印log的工具

//other configurations

  dependencies {
    **compile 'com.github.DanteAndroid:OneFuckingLib:v0.1'**f
  }
```
