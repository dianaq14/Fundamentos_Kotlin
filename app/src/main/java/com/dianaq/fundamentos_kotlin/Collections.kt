package com.dianaq.fundamentos_kotlin

import com.dianaq.fundamentos_kotlin.Classes.Group
import com.dianaq.fundamentos_kotlin.Classes.User

fun main (){
    newTopic("Colecciones")
    newTopic("Solo lectura")

    val frutaList = listOf("Manzana", "Banana", "Arandanos", "Fresas", "Pera")
    println(frutaList.get((0..frutaList.size-1).random()))
    println("Index de Banana es ${frutaList.indexOf("Banana")}")

    newTopic("Mutable List")

    val myUser= User(0, "Diana", "Cuta",Group.FAMILY.ordinal)
    val bro=myUser.copy(1,"Oscar")
    val sis = myUser.copy(1, " Karen")
    val friend= myUser.copy(2, group = Group.FRIENDS.ordinal)

    val userList = mutableListOf( myUser,bro,sis)
    println(userList)
    userList.add(friend)
    println(userList)
    userList.removeAt(1)
    println(userList)

    newTopic("Map")
    val userMap = mutableMapOf<Int, User>()
    println(userMap)
    userMap.put(myUser.id.toInt(), myUser)
    userMap.put(myUser.id.toInt(),myUser)
    println(userMap)
    userMap.put(friend.id.toInt(),friend)
    println(userMap)
    userMap.remove(2)
    println(userMap)
    println(userMap.isEmpty())
    println(userMap.containsKey(0))
    userMap.put(bro.id.toInt(),bro)
    userMap.put(friend.id.toInt(),friend)
    println(userMap)
    println(userMap.keys)
    println(userMap.values)
}