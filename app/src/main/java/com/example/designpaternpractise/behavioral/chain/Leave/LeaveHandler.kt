package com.example.designpaternpractise.behavioral.chain.Leave

abstract class LeaveHandler {

    lateinit var next: LeaveHandler
    abstract fun applyLeave(leave: Leave): String
}