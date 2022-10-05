package com.example.kotlinbasics.assignments
fun main() {

    a(2.9,1.0)}
fun a(num1 : Double,num2 :Double,name :String = "+"){

    when(name){
        "+"-> println(num1+num2)
        "-"-> println(num1-num2)
        "*"->println(num1*num2)
        "/"->println(num1/num2)
        else->println("unknown")
    }
}