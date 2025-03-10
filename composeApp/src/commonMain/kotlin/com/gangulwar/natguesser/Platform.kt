package com.gangulwar.natguesser

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform