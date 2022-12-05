buildscript {
    // 多个变量
    rootProject.extra.apply {
        set("compose_version", "1.3.1")
        set("kotlin_version", "1.7.10")
    }
}

plugins {
    id("com.android.application").version( "7.3.1").apply(false)
    id("com.android.library").version("7.3.1").apply( false)
    id("org.jetbrains.kotlin.android").version("1.6.10").apply(false)
}