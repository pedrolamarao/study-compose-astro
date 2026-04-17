package br.dev.pedrolamarao.study

class JsPlatform : br.dev.pedrolamarao.study.Platform {
    override val name: String = "Web with Kotlin/JS"
}

actual fun getPlatform(): br.dev.pedrolamarao.study.Platform = _root_ide_package_.br.dev.pedrolamarao.study.JsPlatform()