- 还在Github苦苦寻找好用的lib？
- 每次新建项目感觉没有工具类，不想写代码？
- 每次新建项目都要复制粘贴各种第三方库？

去他🐱的第三方库，你**只需要一个库**！<br>
新建项目，依赖这个库，你就可以写一个完整的app！

## What is it
OneFuckingLib 集成了Android常用的第三方库，有官方控件、Rxjava、Glide、Gson、[工具类](https://github.com/Blankj/AndroidUtilCode)、[BaseRecyclerViewAdapterHelper](https://github.com/CymChad/BaseRecyclerViewAdapterHelper) 等等。具体库请查看[build.gradle](https://github.com/DanteAndroid/OneFuckingLib/blob/master/onelib/build.gradle#L36)

## How to use

1.复制代码到**项目**(不是app，是project)的`build.gradle`文件里

```
buildscript {
    dependencies {
        classpath 'com.jakewharton.hugo:hugo-plugin:1.2.1' //打印log的工具，可选
    }
}

allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```

2.复制代码到app模块的`build.gradle`

```
apply plugin: 'com.jakewharton.hugo'//打印log的工具，可选

//other configurations

  dependencies {
      compile 'com.github.DanteAndroid:OneFuckingLib:v0.3'
  }
```

## Q&A
- 我不需要 Rxjava 怎么办<br>
A: 请到 https://github.com/DanteAndroid/OneLib， 这个库是基本版（无Rxjava）。

- 好多库我都用不到/能不能加上xx库？<br>
A: 您可以[向我推荐库](github.com/DanteAndroid/OneFuckingLib/issues/new)或者 Pull Request. 如果是热门库我会考虑添加/修改。如果还不满足您的需求，可以直接联系我做一个您专用的库

- 打印log的工具怎么使用？<br>
A: 是[Hugo](https://github.com/JakeWharton/hugo)，我最近才发现的，挺好用。用法很简单，在你需要打印的方法上面加上`@DebugLog`注解，就可以自动打印参数和返回值。release版本不打印。
