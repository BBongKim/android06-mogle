buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(com.wakeup.buildsrc.Depends.ClassPaths.gradle)
        classpath(com.wakeup.buildsrc.Depends.ClassPaths.kotlin_gradle_plugin)
        classpath(com.wakeup.buildsrc.Depends.ClassPaths.navigation_gradle_plugin)
        classpath(com.wakeup.buildsrc.Depends.ClassPaths.hilt_android_gradle_plugin)
        classpath(com.wakeup.buildsrc.Depends.ClassPaths.kotlinx_serialization)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
    }
}