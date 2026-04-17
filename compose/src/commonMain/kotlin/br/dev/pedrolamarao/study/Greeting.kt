package br.dev.pedrolamarao.study

class Greeting {
    private val platform = _root_ide_package_.br.dev.pedrolamarao.study.getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}