package com.dianaq.fundamentos_kotlin

fun main (){
    newTopic("Bucles")
    showPersons("Isis","Bruno","Boo")
    showPersons("Isis", "Boo", "athenea", "Kyle", "Ariel", "Kiara", "Ringo", "Thorn")
}

fun showPersons(p1: String, p2: String, p3:String){
    println(p1)
    println(p2)
    println(p3)
}

fun showPersons(vararg persons: String){
   /* println(persons[0])
    println(persons[1])
    println(persons[2])
    println(persons[3])*/

    newTopic("For")
    for (person in persons){
        println(person)
    }

    newTopic("While")
    var index =0
    while (index < persons.size){
        if (persons[index]=="Ringo") println("Es Ringo!")
        println(persons[index])
        index++
    }

    newTopic("when")
    println(index)
    index = (0..persons.size).random()
    when (persons[index]){
        "Boo" -> (println("Es Boo"))
        "Isis" -> {
            println("Ir a otra pantalla")
            println(2+1)
        }
        else -> println(persons[index])
    }
}