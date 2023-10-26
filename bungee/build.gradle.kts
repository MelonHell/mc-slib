plugins {
    id("com.github.johnrengelman.shadow")
}

repositories {
    maven("https://repo.codemc.org/repository/maven-public/")
}

dependencies {
    compileOnly(libs.bungee.api)
    testCompileOnly(libs.bungee.api)
    compileOnly(libs.bungee.proxy)

    val includedProjects = listOf(
        ":api:api-common",
        ":api:api-proxy",
        ":common"
    )

    includedProjects.forEach {
        api(project(it))
        shadow(project(it)) {
            isTransitive = false
        }
    }

    shadow(libs.crowdin) {
        isTransitive = false
    }
    shadow(libs.toml4j) {
        isTransitive = false
    }
}

tasks {
    shadowJar {
        configurations = listOf(project.configurations.shadow.get())

        archiveAppendix.set("")
        archiveClassifier.set("")

        relocate("su.plo.crowdin", "su.plo.slib.libs.crowdin")
        relocate("com.moandjiezana.toml", "su.plo.slib.libs.toml")
    }

    build {
        dependsOn.add(shadowJar)
    }
}
