package com.example.designpaternpractise.behavioral.mediator

interface ChatRoom {


    fun registerParticipants(participant: Participant)

    fun send(message: String, from: Participant, to: Participant?)


}

class Participant(private val name: String, private val chatRoom: ChatRoom) {


    init {
        chatRoom.registerParticipants(this)
    }

    fun send(message: String, to: Participant?) {
        chatRoom.send(message, this, to)
    }

    fun receive(message: String) {
        println("$name gets $message")
    }


    object SuperChat : ChatRoom {

        enum class Mode {
            PUBLIC, PRIVATE, MIXED
        }


        val list = arrayListOf<Participant>()
        var mode: Mode = Mode.PRIVATE

        override fun registerParticipants(participant: Participant) {

            list.add(participant)
        }

        override fun send(message: String, from: Participant, to: Participant?) {

            when (mode) {

                Mode.PUBLIC -> list.forEach { it.receive("$from says : $message") }

                Mode.PRIVATE -> list.find { it.name.equals(to) }?.receive("$from says: $message")

            }
        }


    }

    fun main() {
        val alice = Participant("Alice", SuperChat)
        val bob = Participant("Bob", SuperChat)
        val charlie = Participant("Charlie", SuperChat)

        alice.send("hi all!", null)
        bob.send("hi Alice", alice) // only this message will be delivered in PRIVATE mode
        charlie.send("hi Alice", null)

        SuperChat.mode = SuperChat.Mode.PUBLIC
    }
}