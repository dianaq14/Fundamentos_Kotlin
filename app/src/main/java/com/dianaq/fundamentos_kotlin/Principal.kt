package com.dianaq.fundamentos_kotlin

fun main() {
//    print("hello world")
    newTopic("Hola isis")

    newTopic("Variables y Constantes")
//    val a = 2

    val a = "isis"
    println("a = $a")

//    var b = 2
    var b: Int
    b = 5
    println("b = $b")

    var objNull: Any?
    objNull = null
    objNull= "Correcto"
    println(objNull)
}

fun newTopic(topic:String){
    println("=== $topic ===")

}

