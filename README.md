# AiCode

Kotlin Android 入门项目，使用 Jetpack Compose 和 Material 3。

## 开发环境

- Android Studio Meerkat 或更新版本
- JDK 17 或 21（字节码目标为 Java 17）
- Android SDK Platform 35、Build Tools 35.0.0
- Gradle 8.11.1（使用仓库内的 Wrapper）
- Android Gradle Plugin 8.9.2、Kotlin 2.1.20
- 最低 Android 7.0 / API 24，目标 API 35
- 应用 ID：`com.huanghaoda.aicode`

## 打开与构建

在 Android Studio 中打开仓库根目录，等待 Gradle 同步；通过 SDK Manager 安装上述 SDK。
配置 `ANDROID_HOME`，或在未纳入版本控制的 `local.properties` 中设置 `sdk.dir`。

```sh
./gradlew assembleDebug
./gradlew lintDebug
./gradlew assembleDebugAndroidTest
```

调试 APK：`app/build/outputs/apk/debug/app-debug.apk`。

连接 API 24 及以上的设备或启动模拟器，然后运行：

```sh
./gradlew installDebug
./gradlew connectedDebugAndroidTest
```

界面测试会验证欢迎页文本；需要设备或模拟器才能实际执行。
欢迎页入口是 `app/src/main/java/com/huanghaoda/aicode/MainActivity.kt`。

## 云环境

当前 SDK 位于 `/workspace/android-sdk`，完整 JDK 位于 `/workspace/toolchains/jdk-21.0.9+10`，Gradle 缓存位于 `/workspace/gradle-home`。
在当前受代理限制的云环境中执行构建时使用：

```sh
export JAVA_HOME=/workspace/toolchains/jdk-21.0.9+10
export PATH="$JAVA_HOME/bin:$PATH"
export JAVA_TOOL_OPTIONS="${JAVA_TOOL_OPTIONS:-} -Djavax.net.ssl.trustStore=/etc/ssl/certs/java/cacerts"
export ANDROID_HOME=/workspace/android-sdk
GRADLE_USER_HOME=/workspace/gradle-home ./gradlew assembleDebug lintDebug assembleDebugAndroidTest
```

本地开发无需使用云环境路径或代理配置。正式上架前请设置自己的应用 ID、图标和发布签名。
