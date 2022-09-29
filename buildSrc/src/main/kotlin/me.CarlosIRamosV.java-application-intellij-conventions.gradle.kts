plugins {
    id("org.jetbrains.intellij")
    id("me.CarlosIRamosV.java-application-conventions")
    application
}

repositories {
    maven { url = uri("https://www.jetbrains.com/intellij-repository/releases/") }
}

dependencies {
    implementation("com.jetbrains.intellij.java:java-gui-forms-rt:222.4167.33")
}

intellij {
    version.set("2022.2.2")
    type.set("IU")
}