plugins {
    id("java")
    id("org.jetbrains.intellij") version "1.17.2"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

intellij {
    version.set("2023.3")  // IDEのバージョン
    type.set("IU")
    plugins.set(listOf("com.intellij.java"))
    updateSinceUntilBuild.set(false)
}

tasks {
    buildSearchableOptions {
        enabled = false
    }
    
    patchPluginXml {
        sinceBuild.set("233")  // 対応する最小ビルド番号
        untilBuild.set("242.*")  // 対応する最大ビルド番号
    }
} 