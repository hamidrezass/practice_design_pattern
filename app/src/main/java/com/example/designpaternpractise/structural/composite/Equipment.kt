package com.example.designpaternpractise.structural.composite


open class Equipment(open val price: Int, val name: String)

open class Composite(name: String) : Equipment(0, name) {

    private val equipmentList = ArrayList<Equipment>()

    override val price: Int
        get() = equipmentList.map { it.price }.sum()

    fun add(equipment: Equipment) = apply { equipmentList.add(equipment) }

}

class PersonalComputer() : Composite("PC")
class Processor : Equipment(1070, "Processor")
class HardDrive : Equipment(250, "Hard Drive")
class Memory : Equipment(280, "Memory")


fun main() {
    val pc = PersonalComputer().add(Processor()).add(HardDrive()).add(Memory())
    println(pc.price)
}