package com.dianaq.fundamentos_kotlin.Classes

import com.dianaq.fundamentos_kotlin.newTopic

fun main (){
    newTopic("Clases")
    val phone: Phone = Phone(705752)
    phone.call()
    phone.showNumber()
    //println(phone.number)

    newTopic("Herencia")
    val smartphone = Smartphone(705752, true)
    smartphone.call()

    newTopic("Sobreescritura")
    smartphone.showNumber()
    println("Privado? ${smartphone.isPrivate}")

    newTopic("Data Classes")
    val myUser= User(0, "Diana", "Cuta",Group.FAMILY.ordinal)
    val bro=myUser.copy(1,"Oscar")
    val sis = myUser.copy(1, " Karen")
    val friend= myUser.copy(2, group = Group.FRIENDS.ordinal)

    println(myUser.component3())
    println(myUser)
    println(bro)
    println(sis)
    println(friend)

    newTopic("Funciones de alcance")
    with(smartphone){
        println("Privado? $isPrivate")
        call()
    }
    /*friend.group = Group.WORK.ordinal
    friend.name= "Juan"
    friend.lastName= "Salamanca"*/
    friend.apply {
        group = Group.WORK.ordinal
        name ="Juan"
        lastName= "Salamanca"
    }
    println(friend)
}