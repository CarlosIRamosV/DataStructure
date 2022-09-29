import gradle.kotlin.dsl.accessors._72efc76fad8c8cf3476d335fb6323bde.implementation

plugins {
    id("com.github.johnrengelman.shadow")
    id("me.CarlosIRamosV.java-common-conventions")
    application
}

dependencies {
    implementation("org.jetbrains:annotations:23.0.0")
}

application {
    mainClass.set("me.CarlosIRamosV." + project.name + ".Main")
}

tasks {
    jar {
        manifest {
            attributes(
                mapOf(
                    "Main-Class" to application.mainClass.get(),
                    "ImplementationTitle" to project.name,
                    "Implementation-Version" to project.version
                )
            )
        }
    }
    shadowJar {
        manifest.inheritFrom(jar.get().manifest)
    }
}