package com.example.kotlinbasics.assignments

fun main() {
    //ex1
    for (num in 0 .. 100 ) {
        if (num == 71)  println("IT IS OVER 70")
         else  print("$num ,")
    }
//ex2
    var con =35
   while (con>=10) {

       when(con){
           30-> println("It is Hot")
           20-> println("It is Comfy")
           15-> println("It is Cold ")
           else-> println(con)
       }
       con--
   }
}