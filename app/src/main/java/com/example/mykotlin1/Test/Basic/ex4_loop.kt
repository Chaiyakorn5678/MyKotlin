package com.example.mykotlin1.Test.Basic

fun main() {
    for(count in 0..10){
        print("$count ")
    }
    println()
//////////////////////////////////
    for(count in 0 until 10){
        print("$count ")
    }
    println()
  ////////////////////////
    for (count in 10 downTo 0){
        print("$count ")
    }
    println()
////////////////////////
    for (count in 10..0 step 2){
        print("$count ")
    }
    println()
    ////////////////////////
    val arrayDemo = arrayOf("111", 124, true)
    for (item in arrayDemo){
        print("$item")
    }

}