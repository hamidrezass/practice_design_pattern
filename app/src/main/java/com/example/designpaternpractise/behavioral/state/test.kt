package com.example.designpaternpractise.behavioral.state

fun main() {
    val player = Player()

    player.state.onPlay()

    Thread.sleep(1000)
    player.state.onLock()
    Thread.sleep(2000)
    player.state.onLock()
    Thread.sleep(2000)
    player.state.onLock()
}