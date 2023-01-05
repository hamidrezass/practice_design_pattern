package com.example.designpaternpractise.structural.decorator

interface OnBench {
    fun benchEmployee()
}
class OnBenchImplK : OnBench {
    override fun benchEmployee() {
        println("Bench Employee")
    }
}
interface Allocates {
    fun allocatedEmployee()
}
class AllocatesImplK : Allocates {
    override fun allocatedEmployee() {
        println("Allocated Employee")
    }
}

class Employee(onBench: OnBench, allocates: Allocates) :
    OnBench by onBench, Allocates by allocates

fun main() {
    val employee = Employee(OnBenchImplK(),AllocatesImplK())
    employee.benchEmployee()
    employee.allocatedEmployee()
}