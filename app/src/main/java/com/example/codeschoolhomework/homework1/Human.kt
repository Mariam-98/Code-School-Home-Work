package com.example.codeschoolhomework.homework1

data class Human(var age: Int, var name: String, val serialNumber: String, var account: Int) : OnPensionListener {

    override fun onPensionReceived(amount: Int) {
        println("pension received for human: $this ")
    }
}

