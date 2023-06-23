package com.dianaq.fundamentos_kotlin

import kotlin.math.abs

fun main(){
    sayHello()

    newTopic("Argumentos")
    //println(sum(2,13))

    val a =18
    val b =15
    println("$a + $b = ${sum(a,b)}")
    println("$a - $b = ${sub(a,b)}")

    newTopic("Inflix")
    val c = 3
    println(c.enableAbs(false))
    println("$a + $c = ${sum(a,c.enableAbs(false))}")
    println("$a + $c = ${sum(a,c.enableAbs(true))}")

    newTopic("Sobrecarga")
    showProduct("Soda", "10%")
    showProduct("Pan")
    showProduct("caramelo", "15%")
    showProduct("jugo", validity = "22 de Marzo")
}

private fun sayHello(): Unit { //Unit = void
    println("Hola Kotlin")
}
fun sum(a: Int,b:Int): Int {
    return a + b
}

fun sub(a: Int,b:Int) = a - b

infix fun Int.enableAbs(enable : Boolean) = if (enable) abs(this) else this

fun showProduct(name: String, promo:String ="Sin Promoción", validity: String ="agotar existencias"){
    println("$name = $promo hasta $validity")
}