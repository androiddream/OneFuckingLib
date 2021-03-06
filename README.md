- 还在Github苦苦寻找好用的lib？
- 每次新建项目感觉没有工具类，不想写代码？
- 每次新建项目都要复制粘贴各种第三方库？

去他🐱的第三方库，你**只需要一个库**！<br>
新建项目，依赖这个库，你就可以写一个完整的app！

## What is it
**OneFuckingLib**集成了Android常用的第三方库，有官方控件、Rxjava系列、Glide、Gson、[工具类](https://github.com/Blankj/AndroidUtilCode)、[BaseRecyclerViewAdapterHelper](https://github.com/CymChad/BaseRecyclerViewAdapterHelper) 等等。具体库请查看 [build.gradle](https://github.com/DanteAndroid/OneFuckingLib/blob/master/onelib/build.gradle#L36)

## How to use
[![](https://jitpack.io/v/DanteAndroid/OneFuckingLib.svg)](https://jitpack.io/#DanteAndroid/OneFuckingLib)

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
      compile 'com.github.DanteAndroid:OneFuckingLib:v0.93'//最新版本号见上面图标
  }
```

3.在自定义application中初始化
```
    @Override
    public void onCreate() {
        super.onCreate();
        OneLib.init(this);
    }
```

## Proguard rules
建议打开混淆。 [复制混淆规则](https://github.com/DanteAndroid/OneLib/blob/master/onelib/proguard-rules.pro) 或者使用` compile 'com.hwangjr.proguard:proguardconfig:1.0.1@aar' `这个混淆库来混淆（使用此库后，其他第三方库也不需要你担心混淆的事情了）
## Q&A
- 集成这个库是否会使APK增大很多？<br>
A: 你可以开启混淆来减少apk体积。如果这些库大部分都是您用到的，那么集成此库与分别继承基本没区别；如果有很多用不到，你可以在app的`build.gradle`中启用`shrinkResources true`来移除无用资源（没有被调用的代码都会被移除）

- 我不需要 Rxjava 怎么办？<br>
A: 请到 https://github.com/DanteAndroid/OneLib 这个库是基本版（无Rxjava）。

- 好多库我都用不到/能不能加上xx库？<br>
A: 您可以[向我推荐库](https://github.com/DanteAndroid/OneFuckingLib/issues/new)或者 Pull Request. 如果是热门库我会考虑添加/修改。如果还不满足您的需求，可以直接[联系我](mailto:502273376@qq.com)做一个您专用的库

- 打印log的工具怎么使用？<br>
A: 是[Hugo](https://github.com/JakeWharton/hugo)，我最近才发现的，挺好用。用法很简单，在你需要打印的方法上面加上`@DebugLog`注解，就可以自动打印参数和返回值。release版本不打印。
