package br.dev.pedrolamarao.study

interface Platform {
    val name: String
}

expect fun getPlatform(): br.dev.pedrolamarao.study.Platform