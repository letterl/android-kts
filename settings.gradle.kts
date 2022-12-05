pluginManagement {
    repositories {
        // 本地
        mavenLocal()
        // 阿里-gradle-plugin
        maven {
            url = uri("https://maven.aliyun.com/repository/gradle-plugin")
        }
            gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "My Application"
include(":app")
