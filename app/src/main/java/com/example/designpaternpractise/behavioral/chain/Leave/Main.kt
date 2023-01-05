package com.example.designpaternpractise.behavioral.chain.Leave

fun main() {


    val teamLeader = TeamLeader()
    val projectLeader = ProjectLeader()
    val hr = HR()
    val manager = Manager()

    teamLeader.next=projectLeader
    projectLeader.next=hr
    hr.next=manager

    val leave1 = Leave(5, 4, ReasonType.REGULAR)
    println(teamLeader.applyLeave(leave1))

    val leave2 = Leave(5, 5, ReasonType.REGULAR)
    println(teamLeader.applyLeave(leave2))

    val leave3 = Leave(12, 3, ReasonType.REGULAR)
    println(teamLeader.applyLeave(leave3))

    val leave4 = Leave(18, 2, ReasonType.CRITICAL)
    println(teamLeader.applyLeave(leave4))

    val leave5 = Leave(18, 2, ReasonType.REGULAR)
    println(teamLeader.applyLeave(leave5))

    val leave6 = Leave(30, 2, ReasonType.SPECIAL)
    println(teamLeader.applyLeave(leave6))
}