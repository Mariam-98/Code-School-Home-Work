package com.example.codeschoolhomework.homework2

import java.util.*

class TranslationManager {
    private val scanner = Scanner(System.`in`)

    fun start() {

        while (LocalesDataController.locales.values.toMutableList().map {
                it.values.toMutableList()
            }.flatten().size < 2) {
            "Please insert language".log()
            val languageIndex = scanner.nextInt()
            val language = if (languageIndex >= LocalesEnum.values().size) LocalesEnum.ENGLISH
            else LocalesEnum.values()[languageIndex]
            "Please insert text".log()
            val text = scanner.next()
            val translatedText = LocalesDataController.get(language.key, text)
            "text: $text , translate: $translatedText".log()
        }
        "I am tired of translating".log()

    }

    private fun String.log() {
        println(this)
    }
}