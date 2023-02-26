package com.example.codeschoolhomework.homework1

import java.util.Scanner

class GovernmentManager {
    private val governments = mutableListOf<Government>()
    private val scanner = Scanner(System.`in`)

    fun start() {
        "GovernmentManager is starting...".log()

        when (GovernmentActionEnum.valueOf(scanner.nextLine().uppercase())) {
            GovernmentActionEnum.CREATE_GOVERNMENT -> createGovernment()
            GovernmentActionEnum.ADD_HUMAN -> addHuman()
            GovernmentActionEnum.REMOVE_HUMAN -> TODO()
            GovernmentActionEnum.GIVE_PENSION -> TODO()
            GovernmentActionEnum.SHOW_PENSIONERS -> TODO()
            GovernmentActionEnum.CHANGE_PENSION_AGE -> TODO()
        }
    }

    private fun createGovernment() {
        "Creating government".log()

        "Please insert government name, for example: Armenia".log()
        val governmentName = scanner.nextLine()

        "Please insert government year, for example: 1991".log()
        val governmentYear = scanner.nextInt()

        val government = Government(governmentName, governmentYear)
        governments.add(government)

        "Government $government successfully created".log()
    }

    private fun addHuman() {
        "Add Human".log()
        "Please insert government name".log()
        val govName = scanner.nextLine()
        val government = governments.find { govName == it.name }

        if (government == null) {
            "Government with name: $govName does not exists!".log()
            addHuman()
        } else {
            "Please insert human name".log()
            val humanName = scanner.nextLine()

            "Please insert human agge".log()
            val age = scanner.nextInt()

            "Please insert human serial number".log()
            val serialNumber = scanner.nextLine()

            val human = Human(age, humanName, serialNumber)

            government.addHuman(human)
            "human $human, was successfully added to $government".log()
        }
    }

    private fun String.log() {
        println(this)
    }
}