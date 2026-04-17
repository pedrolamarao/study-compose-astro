package br.dev.pedrolamarao.study

class WasmPlatform : br.dev.pedrolamarao.study.Platform {
    override val name: String = "Web with Kotlin/Wasm"
}

actual fun getPlatform(): br.dev.pedrolamarao.study.Platform =
    _root_ide_package_.br.dev.pedrolamarao.study.WasmPlatform()