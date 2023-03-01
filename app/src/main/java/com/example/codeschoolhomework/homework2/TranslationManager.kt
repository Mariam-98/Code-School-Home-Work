package com.example.codeschoolhomework.homework2

import java.util.*

class TranslationManager {
    private val scanner = Scanner(System.`in`)

    fun start() {

        while (scanner.nextLine() != "STOP") {
            "Please insert text".log()
            val text = scanner.nextLine()
            val translatedText = LocalesDataController.get(text)
            "text: $text , translate: $translatedText".log()
        }
    }

    private fun String.log() {
        println(this)
    }
}