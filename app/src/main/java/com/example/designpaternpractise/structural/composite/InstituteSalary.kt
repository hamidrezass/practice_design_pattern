package com.example.designpaternpractise.structural.composite

fun main() {
    val developer1 = Developer(1, "ali", "mid")
    val developer2 = Developer(3, "reza", "senior")
    val devCompany = Company()
    devCompany.addEmployee(developer1)
    devCompany.addEmployee(developer2)

    val manager1 = Developer(1, "seyed1", "co founder")
    val manager2 = Developer(3, "seyed2", "co founder and pm")
    val manCompany = Company()
    manCompany.addEmployee(manager1)
    manCompany.addEmployee(manager2)

    val mainCompany = Company()
    mainCompany.addEmployee(devCompany)
    mainCompany.addEmployee(manCompany)
    mainCompany.showEmplyeeDetatils()
}


interface Employee {
    fun showEmplyeeDetatils();
}

//developer is a leaf
class Developer(var id: Int, var name: String, var position: String) : Employee {
    override fun showEmplyeeDetatils() {
        println("$id  $name")
    }
}

//manager is a leaf
class Manager(var id: Int, var name: String, var position: String) : Employee {
    override fun showEmplyeeDetatils() {
        println("$id  $name")
    }
}


// company here is a composite
class Company : Employee {
    private val list: ArrayList<Employee> = arrayListOf()
    override fun showEmplyeeDetatils() {
        list.forEach { it.showEmplyeeDetatils() }
    }
    fun addEmployee(employee: Employee) {
        list.add(employee)
    }
    fun removeEmployee(employee: Employee) {
        list.remove(employee)
    }

}

