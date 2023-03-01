package com.example.codeschoolhomework.homework2

import java.util.*

class Translator {

    private val scanner = Scanner(System.`in`)

    fun translate(text: String): String {

        println("Please translate '$text'")
        val translatedText =  scanner.nextLine()

        println("Translation completed!\n$text: $translatedText")
        return translatedText
    }
}