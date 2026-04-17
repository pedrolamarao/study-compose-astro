package br.dev.pedrolamarao.study

class JVMPlatform : br.dev.pedrolamarao.study.Platform {
    override val name: String = "Java ${System.getProperty("java.version")}"
}

actual fun getPlatform(): br.dev.pedrolamarao.study.Platform =
    _root_ide_package_.br.dev.pedrolamarao.study.JVMPlatform()