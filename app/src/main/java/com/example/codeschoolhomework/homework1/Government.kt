package com.example.codeschoolhomework.homework1

class Government(val name: String, val year: Int) {
    private val humans = mutableListOf<Human>()
    private var pensionAge = PENSIONER_DEFAULT_AGE

    fun addHuman(human: Human) {
        humans.add(human)
    }

    fun removeHuman(human: Human) {
        humans.remove(human)
    }

    fun givePension() {
        getPensioners().forEach {
            it.onPensionReceived(1000)
        }
    }

    fun getPensioners(): List<Human> {
        val pens = mutableListOf<Human>()
        humans.forEach {
            if (it.age >= pensionAge) {
                pens.add(it)
            }
        }

        return pens
    }

    companion object {
        const val PENSIONER_DEFAULT_AGE = 63
    }
}