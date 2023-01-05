//package com.example.designpaternpractise.structural.adapter
//
//
//interface Shape {
//    fun draw()
//    fun createManipulator(): ShapeManipulator<out Shape>
//}
//
//interface ShapeManipulator<T : Shape> {
//    fun drag()
//    fun resize(scale: Float)
//}
//
//internal class Circle : Shape {
//    override fun draw() {
//        TODO("Not yet implemented")
//    }
//
//    override fun createManipulator(): ShapeManipulator<out Shape> {
//        return CircleManipulator(this)
//    }
//
//}
//
//i
//class test<T>(ss:T){
//
//}
