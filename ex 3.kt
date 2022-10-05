package com.example.kotlinbasics.assignments

fun main () {
    //ex 3
    val num = arrayListOf(1.0,2.5,2.9,8.9,2.3)
    var avr : Double=0.0
 for (index in 0 until num.size){

     avr+= num[index]

 }
    println("the Average : ${avr/num.size}")
}
