package com.example.codeschoolhomework.homework2

import java.util.*

class Translator {

    private val scanner = Scanner(System.`in`)

    private var onRestListener: OnRestListener? = null

    fun translate(languageKey: String, text: String): String {
//        if(){
//            onRestListener.onRestStarted()
//        }

//        if(){
//            onRestListener.onRestCompleted()
//        }
//        println(
//            "Please translate  $text into ${
//                LocalesEnum.values().find { it.key == languageKey }?.name
//            }"
//        )
        val translatedText = scanner.nextLine()

        println("Translation completed!\n$text: $translatedText")
        return translatedText
    }

    interface OnRestListener {
        fun onRestStarted()
        fun onRestCompleted()
    }
}