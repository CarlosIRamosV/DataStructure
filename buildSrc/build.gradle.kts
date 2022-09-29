plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation("com.github.johnrengelman.shadow:com.github.johnrengelman.shadow.gradle.plugin:7.1.2")
    implementation("org.jetbrains.intellij:org.jetbrains.intellij.gradle.plugin:1.9.0")
}
