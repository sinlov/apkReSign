# apkReSign

# 使用要求


- `要求必须有java环境`
- 必须有android-sdk,出现异常时,会提示你如何操作

## 改变

fork后

- 重新使用 jdk 1.7编译,原先编译环境是1.8,会产生兼容问题
- 项目结构重做,使用gradle构建

您可以直接使用使用最新包 [ResignAPK-release-1.2.3.jar](https://github.com/sinlov/apkReSign/raw/master/jar/ResignAPK-release-1.2.3.jar)

## 使用方法

拷贝对应版本jar和shell到环境变量覆盖的目录 使用命令 `apkResign` 打开重签名工具

### Mac下使用 

- 拷贝脚本[apkResign](shell/1.2.3/apkResign)
- 拷贝对应包[ResignAPK-release-1.2.3.jar](https://github.com/sinlov/apkReSign/raw/master/jar/ResignAPK-release-1.2.3.jar)
- 到目录 `~/opt/apkDecode`
- 配置环境变量
    
```sh
vi ~/.bash_profile
# 插入内容
ANDROID_DECODE=/Users/sinlov/opt/apkDecode
export ANDROID_DECODE
export PATH=${PATH}:${ANDROID_DECODE}
# 保存后
source ~/.bash_profile
```

> Ubuntu 系统类似配置,这里就不额外说明了

### win下使用

- 拷贝脚本[apkResign.bat](shell/1.2.3/apkResign.bat)
- 拷贝对应包[ResignAPK-release-1.2.3.jar](https://github.com/sinlov/apkReSign/raw/master/jar/ResignAPK-release-1.2.3.jar)
- 到目录 `D:\opt\apkDecode`
- 配置环境变量

在系统环境变量里添加一条

APK_RESIGN 内容为 D:\opt\apkDecode

在`Path变量最后增加` %APK_RESIGN%

这样就可以用 cmd 输入 `apkResign` 来重新签名

# 构建方法

配置gradle环境后执行命令

```sh
./gradlew runOutLibs
```

输出的包在 `build/outLibs` 中



# 设计初衷

为`robotium `设计的安卓一键重签名工具。<br/>
用过` robotium `的应该都知道` re-sign.jar` 的存在，但是很多人用它却签名失败了。<br/>
` 重签名` 的原理就是去除apk正式签名，使用系统自带的` debug.keystore`默认签名进行再次签名。<br/>
因为`re-sign.jar`默认的` debug.keystore` 在`C盘/用户/.android/debug.keystore`下,<br/>
而后来Android SDK更新后` debug.keystore`存在于`SDK目录/.android/debug.keystore` <br/>
本程序强化了` re-sign.jar`,并加入了`设置路径`和`生成测试代码`的功能。

### 截图

##### 主界面

<img src= "screenshots/screenshot01.png" width="500px">

##### 生成测试代码

<img src= "screenshots/screenshot02.png" width="500px">

##### 设置jdk、sdk、debug.keystore路径

<img src= "screenshots/screenshot03.png" width="500px">

## 用法

#### 用法1

双击apkReSign.jar运行 Mac Ubuntu 可以

#### 用法2

在cmd或者命令行下执行以下语句
```
java -jar apkReSign.jar的路径
```
签名成功后输出的文件名为原apk文件名+debug.apk,直接在真机或者模拟器上安装即可<br/>

### 导入robotium

### 下载Jar包
下载[robotium-solo-5.4.1.jar](http://central.maven.org/maven2/com/jayway/android/robotium/robotium-solo/5.4.1/robotium-solo-5.4.1.jar)

### Android Studio 请使用

```gradle
dependencies {
    androidTestCompile 'com.jayway.android.robotium:robotium-solo:5.4.1'
}
```

### 利用maven
```xml
<dependencies>
   <dependency>
     <groupId>com.jayway.android.robotium</groupId>
     <artifactId>robotium-solo</artifactId>
     <version>5.4.1</version>
   </dependency>
</dependencies>

```

# JarKeyTools

In develop do not use!

## 关于

* Blog: [apkfuns.com](http://apkfuns.com?from=github)
* Email: [pengwei1024@gmail.com](http://mail.qq.com/cgi-bin/qm_share?t=qm_mailme&email=pengwei1024@gmail.com)

### 致谢

感谢 [pengwei1024/apkReSign](https://github.com/pengwei1024/apkReSign)
感谢 [troido/resign](https://github.com/troido/resign)


### License

<pre>
Copyright sinlovgmppt@gmail.com

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
</pre>
