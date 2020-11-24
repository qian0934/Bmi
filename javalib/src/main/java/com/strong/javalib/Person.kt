package com.strong.javalib

fun main() {
    val p = Person()
    p.height = 1.7f
    p.weight = 65f
    p.sayHello()
    println("Your BMI is ${p.getBmi()}")
}

class Person {
    var weight: Float = 0f
    var height: Float = 0f

    fun sayHello() {
        println("Hello")
    }

    fun getBmi() : Float {
        val bmi = weight / (height * height)
        return bmi
    }
}

