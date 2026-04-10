package br.dev.purpura.study

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform