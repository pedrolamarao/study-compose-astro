import com.github.gradle.node.npm.task.NpmTask
import com.github.gradle.node.npm.task.NpxTask

plugins {
    id("base")
    id("com.github.node-gradle.node") version("7.1.0")
}

node {
    download = true
    version = "22.22.2"
}

tasks.register<NpmTask>("astroCreate") {
    group = "astro"
    args = listOf("create","astro@latest","study","--","--no-git","--skip-houston","--template=minimal","--yes")
}

val copyPublic = tasks.register<Sync>("copyPublic") {
    into(layout.buildDirectory.dir("astro/public"))
    from("public")
    from(project(":compose").tasks.named("wasmJsBrowserDistribution")) {
        exclude("**/*.html")
        exclude("**/*.css")
    }
}

val astroBuild = tasks.register<NpxTask>("astroBuild") {
    group = "astro"
    inputs.files(copyPublic)
    inputs.file("astro.config.mjs")
    inputs.file("package.json")
    inputs.files(fileTree("src"))
    inputs.file("tsconfig.json")
    outputs.dir(layout.buildDirectory.dir("astro/dist"))

    command = "astro"
    args = listOf("build")
}

tasks.register<NpxTask>("astroDev") {
    group = "astro"
    dependsOn(copyPublic)

    command = "astro"
    args = listOf("dev")
}

tasks.assemble.configure { dependsOn(astroBuild) }