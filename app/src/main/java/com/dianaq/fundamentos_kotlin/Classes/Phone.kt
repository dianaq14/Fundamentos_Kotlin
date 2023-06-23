package com.dianaq.fundamentos_kotlin.Classes

import com.dianaq.fundamentos_kotlin.newTopic

open class Phone (protected val number: Int){
    fun call(){
        println("Llamando...")
    }
    open fun showNumber(){
        println("Mi numero es $number")
    }

}